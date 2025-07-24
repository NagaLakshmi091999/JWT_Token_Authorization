package com.example.JWT_TOKEN_AUTHORIZATION;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInformationRepository extends JpaRepository<UserInformation, String>{

	UserInformation findByEmailnIdAndPassword(String emailId, String password);

}
