package exceptions;

public class UserScheduleNotFoundException extends Exception {
	
	/**
	 * called if no user-schedule input pair is found in the database when trying to add a user to a group
	 */
	public UserScheduleNotFoundException()
	{
		super("Username-schedule information cannot be found; please make sure your inputs are valid");
	}

}