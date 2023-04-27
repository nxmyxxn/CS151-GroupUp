package exceptions;

public class Minimum8CharactersRequired extends PasswordException {
	
	
	/**
	 * called if an input is less than 8 characters long
	 */
	public Minimum8CharactersRequired()
	{
		super("password should contain at least 8 chartacters");
	}

}
