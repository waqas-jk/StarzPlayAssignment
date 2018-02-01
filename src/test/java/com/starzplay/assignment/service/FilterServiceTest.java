package com.starzplay.assignment.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.starzplay.assignment.model.Entry;
import com.starzplay.assignment.model.Level;
import com.starzplay.assignment.model.Medium;
import com.starzplay.assignment.model.MovieMetadata;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilterServiceTest{

	private static final String GUID_UNCENSORED = "1qwqsde32M";
	private static final String GUID_CENSORED = "1qwqsde32MC";
	
	
	private MovieMetadata metadata = null;
	
	@Autowired
	private FilterService filterSerivce;
	
	@Before
	public void setup() {
		metadata = new MovieMetadata();
		
		Medium censored = new Medium();
		censored.setGuid(GUID_CENSORED);
		Medium uncensored = new Medium();
		uncensored.setGuid(GUID_UNCENSORED);
		
		Entry entryWithNoClass = new Entry();
		entryWithNoClass.setMedia(Arrays.asList(uncensored));
		entryWithNoClass.setPeg$contentClassification("");
		
		Entry entryUncensored = new Entry();
		entryUncensored.setMedia(Arrays.asList(uncensored));
		entryUncensored.setPeg$contentClassification("Uncensored");
		
		
		Entry entryCensored = new Entry();
		entryCensored.setMedia(Arrays.asList(uncensored, censored));
		entryCensored.setPeg$contentClassification("Censored");
		
		metadata.setEntries(Arrays.asList(entryWithNoClass, entryUncensored, entryCensored));
		metadata.setEntryCount(Long.valueOf(metadata.getEntries().size()));
	}
	
	@Test
	public void testGetCensoredMovies(){
		
		List<Entry> list = filterSerivce.getCensoredMovies(metadata.getEntries(), Level.censored);
		
		Assert.assertNotNull(list);
		Assert.assertEquals(GUID_CENSORED, list.get(0).getMedia().get(0).getGuid());
	}
	
	@Test
	public void testGetCensoredMoviesWithEMptyList(){
		
		List<Entry> list = filterSerivce.getCensoredMovies(new ArrayList<Entry>(), Level.censored);
		
		Assert.assertNotNull(list);
		Assert.assertTrue(list.isEmpty());

	}
	
	@Test
	public void testGetCensoredMoviesWithEmptyList(){
		
		List<Entry> list = filterSerivce.getCensoredMovies(new ArrayList<Entry>(), Level.censored);
		
		Assert.assertNotNull(list);
		Assert.assertTrue(list.isEmpty());
	}
	
	@Test
	public void testGetCensoredMoviesWithNullLevel(){
		
		List<Entry> list = filterSerivce.getCensoredMovies(new ArrayList<Entry>(), null);
		Assert.assertNotNull(list);
		Assert.assertTrue(list.isEmpty());
	}
	
	@Test
	public void testGetUncensoredMovies(){
		
		List<Entry> list = filterSerivce.getUncensoredMovies(metadata.getEntries());
		
		Assert.assertNotNull(list);
		Assert.assertEquals(2, list.size());
	}
	
	@Test
	public void testGetUncensoredMoviesWithEmptyList(){
		
		List<Entry> list = filterSerivce.getUncensoredMovies(new ArrayList<Entry>());
		
		Assert.assertNotNull(list);
		Assert.assertTrue(list.isEmpty());
	}

}
