package Definations;

import java.util.regex.Pattern;

public class EmailValidator {
	
    //taking input from the main class and validating the email 	
	public boolean isValid(String email)
	{
	     String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                         "[a-zA-Z0-9_+&*-]+)*@" +
	                         "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                         "A-Z]{2,7}$";
	   
	     //using system inbuilt Regex method to validate the email and sending output to main method                        
	     Pattern emailpattern = Pattern.compile(emailRegex);
	     if (email == null)
	         return false;
	    
	     return emailpattern.matcher(email).matches();
	} 


}
