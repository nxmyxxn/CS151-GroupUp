package exceptions;

public class PasswordTester {
	
	private static String specialChars = "!@#$%^&*()-_=+,<.>/?[{]}\\|";
	
	/**
	 * tests the validity of an input password by using five tests, as commented below
	 * Throws an appropriate exception if any condition is not met
	 * @param entry the password to be tested
	 * @throws LowerCaseCharacterMissing
	 * @throws Minimum8CharactersRequired
	 * @throws NumberCharacterMissing
	 * @throws SpecialCharacterMissing
	 * @throws UpperCaseCharacterMissing
	 */
	public static void isValid(String entry) throws LowerCaseCharacterMissing, Minimum8CharactersRequired, NumberCharacterMissing, SpecialCharacterMissing, UpperCaseCharacterMissing
	{
		
		//testing for lower case letters
		boolean lowerCaseResult = false;
		char focus;
		for (int i = 0; i < entry.length(); i++)
		{
			focus = entry.charAt(i);
			if (Character.isLowerCase(focus))
			{
				lowerCaseResult = true;
				break;
			}
		}
		if (!lowerCaseResult)
			throw new LowerCaseCharacterMissing();
		
		//testing for at least 8 characters
		if (entry.length() < 8)
			throw new Minimum8CharactersRequired();
		
		//testing for number characters
		boolean numResult = false;
		for (int i = 0; i < entry.length(); i++)
		{
			focus = entry.charAt(i);
			if (Character.isDigit(focus))
			{
				numResult = true;
				break;
			}
		}
		if (!numResult)
			throw new NumberCharacterMissing();
		
		//testing for special characters
		//reference: https://www.geeksforgeeks.org/java-program-to-check-whether-the-string-consists-of-special-characters/
		boolean specialResult = false;
		for (int i = 0; i < entry.length(); i++)
		{
			if (!Character.isDigit(entry.charAt(i)) && !Character.isLetter(entry.charAt(i)) && !Character.isWhitespace(entry.charAt(i)))
			{
				specialResult = true;
				break;
			}
		}
		if (!specialResult)
		{
			throw new SpecialCharacterMissing();
		}
		
		//testing for upper case letters
		boolean upperCaseResult = false;
		for (int i = 0; i < entry.length(); i++)
		{
			focus = entry.charAt(i);
			if (Character.isUpperCase(focus))
			{
				upperCaseResult = true;
				break;
			}
		}
		if (!upperCaseResult)
			throw new UpperCaseCharacterMissing();
		
	}

}
