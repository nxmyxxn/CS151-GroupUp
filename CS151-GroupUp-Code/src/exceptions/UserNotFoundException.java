package exceptions;

public class UserNotFoundException extends Exception {
	
	public UserNotFoundException()
	{
		super("Incorrect username or password");
	}

}