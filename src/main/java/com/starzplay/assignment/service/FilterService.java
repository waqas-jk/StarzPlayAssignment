package com.starzplay.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.starzplay.assignment.model.Entry;
import com.starzplay.assignment.model.Level;
import com.starzplay.assignment.model.Medium;

@Service
public class FilterService {
	
	/**
	 * Get Censored movies and filter the media based on level field.
	 * @param entries
	 * @param level
	 * @return list of Movies
	 */
	public List<Entry> getCensoredMovies(List<Entry> entries, Level level) {
		
		if(level == null) {
			return new ArrayList<>();
		}
		
		List<Entry> filteredEntries = entries
										.stream()
										.filter(entry -> entry.getPeg$contentClassification().toLowerCase().equals(Level.censored.toString()))
										
										.collect(Collectors.toList());
		
		filteredEntries.forEach( entry -> {
			entry.setMedia(this.filterMedia(entry, level));
		});
		
		return filteredEntries;
	}

	/**
	 * Get Uncensored movies.
	 * @param entries
	 * @return list of Movies
	 */
	public List<Entry> getUncensoredMovies(List<Entry> entries) {
		
		Predicate<Entry> isUncensored = entry -> Objects.isNull(entry.getPeg$contentClassification())
									|| entry.getPeg$contentClassification().trim().isEmpty() 
									|| entry.getPeg$contentClassification().toLowerCase().equals(Level.uncensored.toString());
				
		return entries.stream().filter(isUncensored).collect(Collectors.toList());
	}
	
	/**
	 * Filter the movie media based on level field
	 * @param entry
	 * @param level
	 * @return
	 */
	private List<Medium> filterMedia(Entry entry, Level level) {
		
		return entry.getMedia()
				.stream()
				.filter(media ->  Level.censored.equals(level) ? media.getGuid().endsWith("C") : !media.getGuid().endsWith("C"))
				.collect(Collectors.toList());
	}

}
