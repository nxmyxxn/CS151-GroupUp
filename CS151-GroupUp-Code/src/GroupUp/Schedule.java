package GroupUp;

import java.time.YearMonth;			//keeping this here for now. although its not being used, it could help in the GUI when displaying a month
import java.util.ArrayList;

public class Schedule {

	private int dayAmount;
	private Day[] days;
	protected User creator;
	private ArrayList<User> members;
	private String scheduleName;
	private Integer[][] DaysTimes;
	private int scheduleID;
	
	public Schedule(int daysCount, User maker)
	{
		dayAmount = daysCount;
		creator = maker;
		days = new Day[dayAmount];
		members = new ArrayList<User>();
		DaysTimes = new Integer[7][24];
	}
	
	/**
	 * default constructor
	 */
	public Schedule() {
		// TODO Auto-generated constructor stub
		members = new ArrayList<User>();
		DaysTimes = new Integer[7][24];
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

	public void setDaysTimes(Integer[][] times) {
		// TODO Auto-generated method stub
		this.DaysTimes = times;
	}
	
	/**
	 * returns the integer value held in the schedule at day index a and time index b
	 * @param a
	 * @param b
	 * @return
	 */
	public int getDayTimeValue(int a, int b)
	{
		return DaysTimes[a][b];
	}

	public int getScheduleID() {
		// TODO Auto-generated method stub
		return scheduleID;
	}

	public void setScheduleID(int id) {
		// TODO Auto-generated method stub
		this.scheduleID = id;
		
	}

	public void setCreator(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		this.creator = MysqlConn.getDetails(name);
		
	}
	
	public void printScheduleValues()
	{
		int col;
		
		for (int i = 0; DaysTimes.length > i; i++) {
            for (int j = 0; DaysTimes[0].length > j; j++) 
            {
                col = DaysTimes[i][j];
                System.out.println("Row " + i + ":  Col " + j + ": " + col);
            }
		}
	}
	
	
}


