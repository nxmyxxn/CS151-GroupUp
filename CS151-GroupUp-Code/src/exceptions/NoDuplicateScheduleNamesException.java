package exceptions;

public class NoDuplicateScheduleNamesException extends Exception {
	
	/**
	 * called if a user tries to make a schedule with a duplicated name
	 */
	public NoDuplicateScheduleNamesException()
	{
		super("Please select a unique schedule name");
	}

}