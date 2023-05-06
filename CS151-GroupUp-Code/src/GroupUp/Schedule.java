package GroupUp;

import java.time.YearMonth;			//keeping this here for now. although its not being used, it could help in the GUI when displaying a month
import java.util.ArrayList;

public class Schedule {

	private int dayAmount;
	protected User creator;
	private ArrayList<User> members;
	private String scheduleName;
	private Integer[][] daysTimes;
	private int scheduleID;
	
	public static Schedule focusSchedule;
	
	public Schedule(int daysCount, User maker)
	{
		dayAmount = daysCount;
		creator = maker;
		members = new ArrayList<User>();
		daysTimes = new Integer[7][24];
	}
	
	/**
	 * default constructor
	 */
	public Schedule() {
		// TODO Auto-generated constructor stub
		members = new ArrayList<User>();
		daysTimes = new Integer[7][24];
	}
	
	public Schedule(Integer[][] dayTimes, int id, String name)
	{
		this.daysTimes = dayTimes; 
		this.scheduleID = id;
		this.scheduleName = name;
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
		this.daysTimes = times;
	}
	
	/**
	 * returns the integer value held in the schedule at day index a and time index b
	 * @param a
	 * @param b
	 * @return
	 */
	public Boolean getDayTimeBool(int a, int b)
	{
		if (daysTimes[a][b] == 1)
			return true;
		return false;
	}
	
	
	public int getDayTimeValue(int a, int b)
	{
		return daysTimes[a][b];
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
		
		for (int i = 0; daysTimes.length > i; i++) {
            for (int j = 0; daysTimes[0].length > j; j++) 
            {
                col = daysTimes[i][j];
                System.out.println("Row " + i + ":  Col " + j + ": " + col);
            }
		}
	}
	
	public static void setFocusSchedule(Schedule refocus)
	{
		focusSchedule = refocus;
	}
	
	public Integer[][] getDaysTimes()
	{
		return daysTimes;
	}
	
	
	
	
}


