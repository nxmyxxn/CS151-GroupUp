package main;

import java.time.YearMonth;			//keeping this here for now. although its not being used, it could help in the GUI when displaying a month
import java.util.ArrayList;

public class Schedule {

	private int dayAmount;
	private Day[] days;
	protected User creator;
	private ArrayList<User> members;
	private String scheduleName;
	
	public Schedule(int daysCount, User maker)
	{
		dayAmount = daysCount;
		creator = maker;
		days = new Day[dayAmount];
		members = new ArrayList<User>();
	}
	/**
	 * method to remove a user from a schedule's array of members
	 * @param target the User to find and remove
	 * @return true if the user is successfully removed, and false otherwise.
	 */
	public boolean removeUser(User target)
	{
		for (int i = 0; i < members.size(); i++)
		{
			if (members.get(i).getUsername().equals(target.getUsername()))
				{
					members.remove(target);
					return true;
				}
		}
		return false;
	}
	
	/**
	 * method to add a user to a schedule's array of members
	 * (could implement better searching if IDs are used)
	 * @param target the User to add
	 * @return true if the user is successfully added, and false otherwise.
	 */
	public boolean addUser(User addition)
	{
		for (int i = 0; i < members.size(); i++)
		{
			if (members.get(i).getUsername().equals(addition.getUsername()))
			{
				return false;		//already a member, should not add again
			}
		}
		members.add(addition);
		return true;
	}
	/**
	 * @return the dayAmount
	 */
	public int getDayAmount() {
		return dayAmount;
	}
	/**
	 * @param dayAmount the dayAmount to set
	 */
	public void setDayAmount(int dayAmount) {
		this.dayAmount = dayAmount;
	}
	/**
	 * @return the days
	 */
	public Day[] getDays() {
		return days;
	}
	/**
	 * @return the creator
	 */
	public User getCreator() {
		return creator;
	}
	/**
	 * @return the members
	 */
	public ArrayList<User> getMembers() {
		return members;
	}
	/**
	 * @return the scheduleName
	 */
	public String getScheduleName() {
		return scheduleName;
	}
	/**
	 * @param scheduleName the scheduleName to set
	 */
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	
	
}

