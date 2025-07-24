package com.example.JWT_TOKEN_AUTHORIZATION;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/public/user/signup")
	public String signUpUser(@RequestBody UserInformationDto userInformation) {
		return userService.signUpUser(userInformation);
		
	}
	
	@PostMapping("/public/user/signin")
	public String signin(@RequestBody UserLoginDto userLogin) {
		return userService.signin(userLogin);
		
	}
	
	@PostMapping("/api/user/change/password")
	public String changepassword(@RequestBody ChangePasswordDto changePassword, String userId) {
		return userService.changepassword(changePassword,userId );
		
	}
	
	@DeleteMapping("/api/user/delete/{userId}")
	public String deleteUser(@PathVariable String userId) {
		return userService.deleteUser(userId );
		
	}
	
	

}
