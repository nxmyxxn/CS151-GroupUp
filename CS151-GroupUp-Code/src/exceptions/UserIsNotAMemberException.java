package exceptions;

public class UserIsNotAMemberException extends Exception {
	
	public UserIsNotAMemberException()
	{
		super("Member deletion failed; this user is not a member of this group");
	}

}