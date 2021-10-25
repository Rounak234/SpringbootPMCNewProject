package com.PlacementManagementSystemUsingSpring.SpringbootPMS.Exceptional;

import java.util.Date;

public class ErrorDetails {
	
	
	private Date timestamp;
	private String message;
	private String Stream;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPassword() {
		return Stream;
	}

	public ErrorDetails(Date date, String message2, String stream) {	
		
	
	System.out.println("Error Message");

}
	
	
}

	




