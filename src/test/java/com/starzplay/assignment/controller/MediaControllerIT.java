package com.starzplay.assignment.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MediaControllerIT{

	@Test
	public void testIsValidFilterBlankReturnsFalse(){
		String str = "";
		Assert.assertFalse( ValidationUtil.isValidFilter(str));
	}
	
	@Test
	public void testIsValidFilterReturnsTrue(){
		String str = "censoring";
		Assert.assertTrue(ValidationUtil.isValidFilter(str));
	}
	
	@Test
	public void testIsValidFilterReturnsFalse(){
		String str = "CENSORING";
		Assert.assertFalse(ValidationUtil.isValidFilter(str));		
	}

	@Test
	public void testIsValidLevelBlankReturnsFalse(){
		String str = "";
		Assert.assertFalse(ValidationUtil.isValidLevel(str));	
	}
	
	@Test
	public void testIsValidLevelReturnsTrue(){
		String str = "censored";
		Assert.assertTrue(ValidationUtil.isValidLevel(str));
	}
	
	@Test
	public void testIsValidLevelReturnsFalse(){
		String str = "CENSORED";
		Assert.assertFalse(ValidationUtil.isValidLevel(str));
	}

}
