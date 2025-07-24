package com.example.JWT_TOKEN_AUTHORIZATION;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserInformationRepository userRepo;

	@Override
	public String signUpUser(UserInformationDto userInformation) {
		// entity

		if (userRepo.findById(userInformation.getEmailId()).isPresent()) {
			return "Email Already Existed";
		} else {
			UserInformation userInfo = new UserInformation(userInformation.getEmailId(), userInformation.getPassword(),
					userInformation.getUserName(), userInformation.getMobileNumber());
			userRepo.save(userInfo);
			return "User Created successfully";
		}

	}

	@Override
	public String signin(UserLoginDto userLogin) {
		// TODO Auto-generated method stub
		UserInformation user = userRepo.findByEmailIdAndPassword(userLogin.getEmailId(),userLogin.getPassword());
		if(user!=null) {
			return "User Login Success, Welcome "+ user.getUserName();
		}else
			return "Invalid Credentials, please Try Again";
		
	}

	@Override
	public String changepassword(ChangePasswordDto changePassword, String userId) {
		
		Optional<UserInformation> info = userRepo.findById(userId);
		if(info.isPresent()) {
			UserInformation userInfo = info.get();
			userInfo.setPassword(changePassword.getNewPassword());
			userRepo.save(userInfo);
			return "Password Changed SuccessFull";
		}else
			return "User Not Found with Email "+ userId;
	}

	@Override
	public String deleteUser(String userId) {
		Optional<UserInformation> info = userRepo.findById(userId);
		if(info.isPresent()) {
			userRepo.deleteById(userId);
			return "User SuccessFully Deleted";
		}
		return "User Not Found to Delete";
			
	}

}
