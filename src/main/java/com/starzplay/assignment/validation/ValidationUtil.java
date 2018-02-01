package com.starzplay.assignment.validation;

import java.util.stream.Stream;

import com.starzplay.assignment.model.Filter;
import com.starzplay.assignment.model.Level;

public class ValidationUtil {
	
	public static boolean isValidFilter(String filterValue) {
		
		return Stream.of(Filter.values()).anyMatch(filter -> filter.toString().equals(filterValue));
	}
	
	public static boolean isValidLevel(String levelValue) {
		return Stream.of(Level.values()).anyMatch(level -> level.toString().equals(levelValue));

	}
}
