package exceptions;

public class NoDuplicateScheduleNamesException extends Exception {
	
	/**
	 * called if a user tries to make a schedule with a duplicated name
	 */
	public NoDuplicateScheduleNamesException()
	{
		super("please select a unique schedule name");
	}

}