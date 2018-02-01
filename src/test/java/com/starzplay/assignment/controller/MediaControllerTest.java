package com.starzplay.assignment.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.starzplay.assignment.model.Entry;
import com.starzplay.assignment.model.Filter;
import com.starzplay.assignment.model.Level;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MediaControllerTest{

	@Autowired
	private MediaController mediaController;
	
	@Test
	public void testIndex(){
		
		String result = mediaController.index();
		
		Assert.assertNotNull(result);
		Assert.assertTrue(result.contains("Welcome"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetMediaWithNullFilter(){
		
		mediaController.getMedia(null, null);
		
	}
	
	@Test
	public void testGetMediaWithNullLevel(){
		
		List<Entry> list = mediaController.getMedia(Filter.censoring, null);
		
		Assert.assertNotNull(list);
		Assert.assertEquals(3, list.size());
		Assert.assertTrue(list.stream().anyMatch(item -> "".equals(item.getPeg$contentClassification())));
		Assert.assertTrue(list.stream().anyMatch(item -> Level.uncensored.toString().equals(item.getPeg$contentClassification().toLowerCase())));
	}
	
	@Test
	public void testGetMediaWithCensoredLevel(){
		
		List<Entry> list = mediaController.getMedia(Filter.censoring, Level.censored.toString());
		
		Assert.assertNotNull(list);
		Assert.assertEquals(1, list.size());
		Assert.assertTrue(list.stream().allMatch(item -> Level.censored.toString().equals(item.getPeg$contentClassification().toLowerCase())));
		Assert.assertTrue(list.get(0).getMedia().stream().allMatch(item -> item.getGuid().endsWith("C")));

	}
	
	@Test
	public void testGetMediaWithUncensoredLevel(){
		
		List<Entry> list = mediaController.getMedia(Filter.censoring, Level.uncensored.toString());
		
		Assert.assertNotNull(list);
		Assert.assertEquals(1, list.size());
		Assert.assertTrue(list.stream().allMatch(item -> Level.censored.toString().equals(item.getPeg$contentClassification().toLowerCase())));
		Assert.assertTrue(list.get(0).getMedia().stream().allMatch(item -> !item.getGuid().endsWith("C")));

	}
	
}
