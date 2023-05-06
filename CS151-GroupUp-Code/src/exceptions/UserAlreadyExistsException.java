package exceptions;

public class UserAlreadyExistsException extends Exception {

	public UserAlreadyExistsException()
	{
		super("A user with this username already exists");
	}
}
