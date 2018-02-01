package com.starzplay.assignment.controller;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.starzplay.assignment.model.Entry;
import com.starzplay.assignment.model.Filter;
import com.starzplay.assignment.model.Level;
import com.starzplay.assignment.model.MovieMetadata;
import com.starzplay.assignment.service.FilterService;
import com.starzplay.assignment.service.MediaService;
import com.starzplay.assignment.validation.ValidationUtil;

@RestController
public class MediaController {
	
	private static final Logger LOGGER = Logger.getLogger(MediaController.class); 

	private MediaService mediaService;
	private FilterService filterService;
	
	@Autowired
	public void setMediaService(MediaService mediaService) {
		this.mediaService = mediaService;
	}

	@Autowired
	public void setFilterService(FilterService filterService) {
		this.filterService = filterService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "Welcome to StarzPlay...";
	}
	
	/**
	 * 
	 * @param filter
	 * @param level
	 * @return
	 */
	@RequestMapping("/media")
	public List<Entry> getMedia(@RequestParam(value="filter") Filter filter, @RequestParam(name="level", required=false) String level) {
		
		MovieMetadata metadata =  mediaService.getMovieMetadata();
		
		List<Entry> filteredMovies= null;
		if(ValidationUtil.isValidLevel(level)) {
			filteredMovies = filterService.getCensoredMovies(metadata.getEntries(), Level.valueOf(level));
		}else{
			filteredMovies = filterService.getUncensoredMovies(metadata.getEntries());
		}
		
		// debugging to view the selected data in logs.
		LOGGER.debug("Total Filtered Movies : " + filteredMovies.size());
		filteredMovies.forEach(movie -> {
			StringBuilder mediaBuilder = new StringBuilder();
			mediaBuilder.append("[");
			movie.getMedia().forEach(media -> mediaBuilder.append("Guid:" + media.getGuid()));
			mediaBuilder.append("]");
			
			ToStringBuilder stringBuilder = new ToStringBuilder(this)
											.append("Movie", movie.getGuid())
											.append("Classification", movie.getPeg$contentClassification())
											.append("Total Media", movie.getMedia().size())
											.append("Media", mediaBuilder.toString());
			LOGGER.debug(stringBuilder.toString());
		});
		
		return filteredMovies;
	}
	

}
