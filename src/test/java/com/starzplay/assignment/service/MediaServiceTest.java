package com.starzplay.assignment.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.starzplay.assignment.model.MovieMetadata;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MediaServiceTest{

	@Autowired
	private MediaService mediaService;
	
	@Test
	public void testGetMovieMetadata(){
		
		MovieMetadata metadata = mediaService.getMovieMetadata();
		
		Assert.assertNotNull(metadata);
		Assert.assertEquals(4, metadata.getEntries().size());
	}

}
