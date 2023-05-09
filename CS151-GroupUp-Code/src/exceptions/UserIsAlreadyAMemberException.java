package exceptions;

public class UserIsAlreadyAMemberException extends Exception {

	public UserIsAlreadyAMemberException()
	{
		super("This user is already a member. If you wish to change their schedule, please delete them first");
	}
}
