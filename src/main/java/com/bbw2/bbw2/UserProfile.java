package com.bbw2.bbw2;

import lombok.Data;

@Data
public class UserProfile {
    
    private String name;
	private String email;

	@Override
	public String toString() {
		return "UserProfile [name=" + name + ", email=" + email + "]";
	}
}
