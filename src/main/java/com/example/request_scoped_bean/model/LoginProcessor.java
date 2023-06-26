package com.example.request_scoped_bean.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component //is bean
@RequestScope
public class LoginProcessor {
	
	private String username;
	private String password;
	
	public boolean login() {
		String username = this.getUsername();
		String password = this.getPassword();
		
		if ("joe".equals(username) && "naRnia".equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
