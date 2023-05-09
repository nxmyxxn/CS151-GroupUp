package exceptions;

public class DontDeleteYourselfException extends Exception {
	
	/**
	 * called if a user tries to delete themself from a group
	 */
	public DontDeleteYourselfException()
	{
		super("You own this schedule, you cannot delete yourself from it");
	}

}