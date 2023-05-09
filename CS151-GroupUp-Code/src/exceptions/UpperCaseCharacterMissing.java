package exceptions;

public class UpperCaseCharacterMissing extends PasswordException {

	/**
	 * called if a parameter contains no upper case letters
	 */
	public UpperCaseCharacterMissing()
	{
		super("Password should contain an upper case letter");
	}
	
}
