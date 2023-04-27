package exceptions;

public class SpecialCharacterMissing extends PasswordException {
	
	/**
	 * called if an input value contains no special characters
	 */
	public SpecialCharacterMissing()
	{
		super("password should contain a special character");
	}

}
