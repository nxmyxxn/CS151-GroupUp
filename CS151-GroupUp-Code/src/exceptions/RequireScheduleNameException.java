package exceptions;

public class RequireScheduleNameException extends Exception {
	
	/**
	 * called if a user tries to delete themself from a group
	 */
	public RequireScheduleNameException()
	{
		super("please input a schedule name");
	}

}