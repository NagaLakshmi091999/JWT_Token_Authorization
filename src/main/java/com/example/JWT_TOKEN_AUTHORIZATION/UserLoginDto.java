package com.example.JWT_TOKEN_AUTHORIZATION;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDto {
	
	private String emailId;
	private String password;

}
