package com.example.JWT_TOKEN_AUTHORIZATION;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_information")
public class UserInformation {
	@Id
	private String enmailId;
	private String password;
	private String userName;
	private String mobileNumber;

}
