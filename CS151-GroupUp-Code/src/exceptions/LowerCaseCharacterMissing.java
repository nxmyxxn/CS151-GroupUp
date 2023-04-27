package exceptions;

public class LowerCaseCharacterMissing extends PasswordException {
	
	/**
	 * called if an input value contains no lower case letters
	 */
	public LowerCaseCharacterMissing()
	{
		super("password should contain a lower case letter");
	}

}
