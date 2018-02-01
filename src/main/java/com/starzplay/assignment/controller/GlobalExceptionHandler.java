package com.starzplay.assignment.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseBody
    public ResponseEntity<Object> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        Class<?> type = e.getRequiredType();
        String message;
        if(type.isEnum()){
            message = String.format("The parameter %s must have a value among : %s", e.getName(), StringUtils.join(type.getEnumConstants(), ", "));
        }
        else{
            message = String.format("The parameter %s must be of type %s", e.getName(), type.getTypeName());
        }
        return buildResponse(HttpStatus.UNPROCESSABLE_ENTITY, message);
    }
    
	private ResponseEntity<Object> buildResponse(HttpStatus unprocessableEntity, String message) {
		return ResponseEntity.status(unprocessableEntity).body(message);
	}
}