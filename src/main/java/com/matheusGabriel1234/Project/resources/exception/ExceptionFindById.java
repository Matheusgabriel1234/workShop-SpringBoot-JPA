package com.matheusGabriel1234.Project.resources.exception;

import java.io.Serializable;


public class ExceptionFindById implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Long timeStamp;
private Integer status;
private String error;
private String message;
private String path;

public ExceptionFindById() {
	
}

public ExceptionFindById(Long timeStamp, Integer status, String message, String path,String error) {
	super();
	this.timeStamp = timeStamp;
	this.status = status;
	this.message = message;
	this.path = path;
	this.error = error;
}

public Long getTimeStamp() {
	return timeStamp;
}

public void setTimeStamp(Long timeStamp) {
	this.timeStamp = timeStamp;
}

public Integer getStatus() {
	return status;
}

public void setStatus(Integer status) {
	this.status = status;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

public String getError() {
	return error;
}

public void setError(String error) {
	this.error = error;
}





}
