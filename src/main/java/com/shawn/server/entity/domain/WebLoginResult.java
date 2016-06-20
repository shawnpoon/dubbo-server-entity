package com.shawn.server.entity.domain;

import java.io.Serializable;

public class WebLoginResult implements Serializable {
	
	private static final long serialVersionUID = 1866370680829933075L;
	private boolean isAuthenticated = false;
	private String errMessage;

	public WebLoginResult(boolean isAuthenticated, String errMessage) {
		this.isAuthenticated = isAuthenticated;
		this.errMessage = errMessage;
	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

}
