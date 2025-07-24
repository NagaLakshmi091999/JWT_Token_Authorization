package com.example.JWT_TOKEN_AUTHORIZATION.jwt_token_util;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	
	private final String secretKey = "ajhvgjkjhjhbmkjiyugtyftdvhjbbkjiuyuftdrdfhjnkghfrnbvgfvgnjhvfdddderdrvgcftdedgctdd";
	
	private final long TOKEN_EXPIRY_DURATION = 5* 60000; //1sec = 1000ms 1min = 60000ms
	public String createToken(String emailId) {
		
		String token = null;
		return token = Jwts.builder()
				.setSubject(emailId)// unique  user id
				.setIssuedAt(new Date(System.currentTimeMillis())) //set create time
				.setExpiration(new Date(System.currentTimeMillis() +TOKEN_EXPIRY_DURATION))// set expiration time
				.signWith(SignatureAlgorithm.HS256,secretKey)
				.compact();
		
	}

}
