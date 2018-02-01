package com.starzplay.assignment.controller;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.starzplay.assignment.StarzPlayAssignmentApplication;
import com.starzplay.assignment.model.Entry;
import com.starzplay.assignment.model.Filter;
import com.starzplay.assignment.model.Level;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StarzPlayAssignmentApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MediaControllerIT{

	private static String MEDIA_URL= "/media?filter=%s&level=%s";
	
	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	@Test
	public void testIndex() {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange( createURLWithPort("/"), HttpMethod.GET, entity, String.class);
		Assert.assertTrue(response.getBody().contains("Welcome to StarzPlay"));
	}
	

	@Test
	public void testGetMediaWithNullFilter(){
		
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange( createURLWithPort("/media"), HttpMethod.GET, entity, String.class);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getBody().contains("Bad Request"));
	}
	
	@Test
	public void testGetMediaWithNullLevel(){
		
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange( createURLWithPort("/media"), HttpMethod.GET, entity, String.class);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getBody().contains("Bad Request"));
	}
	
	@Test
	public void testGetMediaWithCensoredLevel() throws JsonParseException, JsonMappingException, IOException{
		
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		
		String mediaUrl = String.format(MEDIA_URL, Filter.censoring.toString(), Level.censored.toString());
		ResponseEntity<String> response = restTemplate.exchange( createURLWithPort(mediaUrl), HttpMethod.GET, entity, String.class);
		
		Assert.assertNotNull(response);
		Assert.assertFalse(response.getBody().isEmpty());
		
		ObjectMapper mapper = new ObjectMapper();
		List<Entry> entries = mapper.readValue(response.getBody(),new TypeReference<List<Entry>>(){} );
		Assert.assertNotNull(entries);
		
		Assert.assertTrue(entries.stream().allMatch(item -> Level.censored.toString().equals(item.getPeg$contentClassification().toLowerCase())));
		Assert.assertTrue(entries.get(0).getMedia().stream().allMatch(item -> item.getGuid().endsWith("C")));

	}
	
	@Test
	public void testGetMediaWithUncensoredLevel() throws JsonParseException, JsonMappingException, IOException{
		
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		
		String mediaUrl = String.format(MEDIA_URL, Filter.censoring.toString(), Level.uncensored.toString());
		ResponseEntity<String> response = restTemplate.exchange( createURLWithPort(mediaUrl), HttpMethod.GET, entity, String.class);
		
		Assert.assertNotNull(response);
		Assert.assertFalse(response.getBody().isEmpty());
		
		ObjectMapper mapper = new ObjectMapper();
		List<Entry> entries = mapper.readValue(response.getBody(),new TypeReference<List<Entry>>(){} );
		Assert.assertNotNull(entries);
		
		Assert.assertNotNull(entries);
		Assert.assertEquals(1, entries.size());
		Assert.assertTrue(entries.stream().allMatch(item -> Level.censored.toString().equals(item.getPeg$contentClassification().toLowerCase())));
		Assert.assertTrue(entries.get(0).getMedia().stream().allMatch(item -> !item.getGuid().endsWith("C")));

	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

}
