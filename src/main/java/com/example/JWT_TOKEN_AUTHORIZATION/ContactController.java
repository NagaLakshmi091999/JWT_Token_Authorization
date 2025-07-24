package com.example.JWT_TOKEN_AUTHORIZATION;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping("/public/contact/info")
	public String getContactInfo() {
		return "call: + 09876 67854, emailId: info@example.com";
		
	}
	

}
