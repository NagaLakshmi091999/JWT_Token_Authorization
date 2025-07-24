package com.example.JWT_TOKEN_AUTHORIZATION;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserInformationDto {
	@Id
	private String emailId;
	private String password;
	private String userName;
	private String mobileNumber;

}
