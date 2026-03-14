package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.dao.ResetPasswordDAO;
import com.amazon.entity.PasswordLog;
import com.amazon.exception.PassowordResetFailException;
import com.amazon.request.ResetPassword;

@Service
public class ResetPasswordServiceImple implements ResetPasswordService {
	@Autowired
	ResetPasswordDAO resetPasswordDAO;
	
	public String resetPassword(ResetPassword resetPassword) {
		String currentEmail = resetPassword.getEmailId();
		
		 PasswordLog passwordLog =resetPasswordDAO.getPasswordLog(currentEmail);
		String newPassword = resetPassword.getNewPassword();
        String currentPassword = passwordLog.getCurrentPassword();
        String oldPassword = passwordLog.getOldPassword();
        String oldestPassword = passwordLog.getOldestPassword();
        
        if(newPassword.equalsIgnoreCase(currentPassword))
        {
       	 throw new PassowordResetFailException("New password same as current password");
        }
        else 
        {
       	 if(oldPassword==null)
       	 {
       		 return resetPasswordDAO.swapPassword(newPassword, passwordLog);
       	 }
       	 else if(newPassword.equalsIgnoreCase(oldPassword))
       	 {
       		 throw new PassowordResetFailException("Your password can not be same as previous 3 password");
       	 }
       	 else
       	 {
       		 if(oldestPassword==null)
       		 {
       			 return resetPasswordDAO.swapPassword(newPassword, passwordLog);
       		 }
       		 else if(newPassword.equalsIgnoreCase(oldestPassword))
       		 {
       			 throw new PassowordResetFailException("Your password can not be same as previous 3 password");
       		 }
       		 else
       		 {
       			 return resetPasswordDAO.swapPassword(newPassword, passwordLog);
       		 }
       	 }
        }
		
	}
	
	

}
