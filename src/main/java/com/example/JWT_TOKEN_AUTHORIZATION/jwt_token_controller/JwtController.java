package com.example.JWT_TOKEN_AUTHORIZATION.jwt_token_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.JWT_TOKEN_AUTHORIZATION.jwt_token_util.JwtUtil;

@RestController
public class JwtController {
	@Autowired
	JwtUtil jwtUtil;
	@GetMapping("/jwt/create/token/{emailId}")
	public String getToken(@PathVariable String emailId) {
		return jwtUtil.createToken(emailId);
	}

}
