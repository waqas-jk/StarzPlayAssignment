package com.starzplay.assignment.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.starzplay.assignment.model.MovieMetadata;


@Service
public class MediaService {
	
	@Value("${media.metadata.rest.url}")
	private String metadataServiceUrl;
	
	/**
	 * Retrieve movie metadata using REST API.
	 * @return movie metadata
	 */
	public MovieMetadata getMovieMetadata() {
		return  new RestTemplate().getForObject(metadataServiceUrl, MovieMetadata.class);
	}

}
