package com.example.JWT_TOKEN_AUTHORIZATION;

public interface UserService {

	String signUpUser(UserInformationDto userInformation);

	String signin(UserLoginDto userLogin);

	String changepassword(ChangePasswordDto changePassword, String userId);

	String deleteUser(String userId);

}
