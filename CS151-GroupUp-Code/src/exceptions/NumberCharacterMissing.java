package exceptions;

public class NumberCharacterMissing extends PasswordException {
	
	
	/**
	 * called if an input contains no numerical characters
	 */
	public NumberCharacterMissing()
	{
		super("Password should contain a number");
	}

}
