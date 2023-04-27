package exceptions;

public class UserAlreadyExistsException extends Exception {

	public UserAlreadyExistsException()
	{
		super("A use with this email already exists");
	}
}
