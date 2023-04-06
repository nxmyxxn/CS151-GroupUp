package GroupUp;

import java.util.ArrayList;

public class Creator extends User{
	
	private ArrayList<Schedule> ownedSchedules;

	/**
	 * default constructor. No need for a parameterized constructor since a creator should reference the same object as the linked user.
	 */
	public Creator() 
	{
		super();
	}
	
	/**
	 * removes a user from a schedule
	 * @param target the user to be removed
	 * @param inHere the schedule in which to look for the target
	 * @return true if a user is successfully kicked, false otherwise
	 */
	public boolean kick(User target, Schedule inHere)
	{
		Schedule focus = null;
		if (!this.getUsername().equals(inHere.getCreator().getUsername()))
			return false;				//checks if this is the creator of the inHere schedule, does not allow to kick if not the creator
		for (int i = 0; i < ownedSchedules.size(); i++)
		{
			if (ownedSchedules.get(i).getScheduleName().equals(inHere.getScheduleName()))
			{
				focus = ownedSchedules.get(i);			//finding the specific schedule in the creator's created schedules
				break;
			}
		}
		if (focus.equals(null))
			return false;
		return focus.removeUser(target);
	}
	
	public boolean invite(User target, Schedule inHere)
	{
		Schedule focus = null;
		if (!this.getUsername().equals(inHere.getCreator().getUsername()))
			return false;				//checks if this is the creator of the inHere schedule, does not allow to add user if not the creator
		for (int i = 0; i < ownedSchedules.size(); i++)
		{
			if (ownedSchedules.get(i).getScheduleName().equals(inHere.getScheduleName()))
			{
				focus = ownedSchedules.get(i);			//finding the specific schedule in the creator's created schedules
				break;
			}
		}
		return focus.addUser(target);
		
	}

}
