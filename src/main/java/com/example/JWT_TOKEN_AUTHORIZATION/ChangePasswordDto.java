package com.example.JWT_TOKEN_AUTHORIZATION;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordDto {
	
	private String currentPassword;
	private String newPassword;

}
