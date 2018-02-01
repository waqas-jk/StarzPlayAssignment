package com.starzplay.assignment.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.starzplay.assignment.model.Entry;
import com.starzplay.assignment.model.Level;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MediaControllerTest{

	@Test
	public void testGetMovieMetadata(){
		
		List<Entry> list = filterSerivce.getCensoredMovies(metadata.getEntries(), Level.censored);
		
		Assert.assertNotNull(list);
		Assert.assertEquals(GUID_CENSORED, list.get(0).getMedia().get(0).getGuid());
	}

}
