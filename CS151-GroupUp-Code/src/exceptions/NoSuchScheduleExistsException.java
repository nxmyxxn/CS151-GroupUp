package exceptions;

/**
 * called if a user tries to add to a group a schedule they do not have
 * @author dmaka
 *
 */
public class NoSuchScheduleExistsException extends Exception {
	
	public NoSuchScheduleExistsException()
	{
		super("You do not have a schedule under this name");
	}

}