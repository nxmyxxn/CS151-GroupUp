package groupup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import exceptions.UserAlreadyExistsException;
import exceptions.UserIsAlreadyAMemberException;
import exceptions.UserIsNotAMemberException;
import exceptions.UserNotFoundException;
import gui.ErrorPopup;

/**
 * connects the java program to a mysql database on my computer.
 * Various code sections reference the following links:
 * https://www.tutorialspoint.com/jdbc/jdbc-quick-guide.htm#
 * https://www.youtube.com/watch?v=bmv5SLrEQ-M
 * https://www.youtube.com/watch?v=6PvKTg9NXkU
 * a segment of this code is copied from Danilo's homework 4 code, and most expands upon it
 * @author dmaka
 *
 */
public class MysqlConn {
	
	private static final String myUsername = "root";			//default username for mySQL
	private static final String myPassword = "Screw_HW-4";			//programmers are prompted to create a password along with the 'root' username
	private static final String database = "jdbc:mysql://localhost:3306/151projconnector";
	private String allQuery = "select * from account";			//SQL code to retrieve all values from every column in table user
	private static String scheduleDelete = "delete from 7dayschedule where scheduleName = \'";
	private static String scheduleInsert = "insert into personal_day (scheduleID, dayNum, 12am, 1am, 2am, 3am, 4am, 5am, 6am, 7am, 8am, 9am, 10am, 11am, 12pm, 1pm, 2pm, 3pm, 4pm, 5pm, 6pm, 7pm, 8pm, 9pm, 10pm, 11pm) values (";
	private static ArrayList<String> retrievedUsername = new ArrayList<>();
	private static ArrayList<String> retrievedFN = new ArrayList<>();
	private static ArrayList<String> retrievedLN = new ArrayList<>();
	private static ArrayList<String> retrievedEmail = new ArrayList<>();
	private static ArrayList<String> retrievedPW = new ArrayList<>();			//these four array lists are only used to check the contents of the connected database
	
	private final static String[] timeDefinitions = {"12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm"};
	
	static Connection sqlConn = null;
	static Statement state = null;
	static PreparedStatement preparedState = null;
	static ResultSet rs = null;			//results of a query
	
	/**
	 * default constructor
	 */
	public MysqlConn()
	{
		
	}

	/**
	 * an experimental method to practice connecting with a mysql database. 
	 * This method first creates a connection to the database, then makes a query and puts the queried items into appropriate arrays, then closes the connection.
	 * @throws ClassNotFoundException
	 */
	public void getDB() throws ClassNotFoundException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			rs = state.executeQuery(allQuery);
			
			while (rs.next())
			{
				retrievedUsername.add(rs.getString("username"));
				retrievedFN.add(rs.getString("firstName"));
				retrievedLN.add(rs.getString("lastName"));
				retrievedEmail.add(rs.getString("email"));
				retrievedPW.add(rs.getString("password"));
			}
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	/**
	 * inserts a user into the database by adding their attributes into the userInsert String, which results in a complete SQL code
	 * It will not add a user's details to the database if their email can already be found in it
	 * @param user user's username
	 * @param f the first name
	 * @param l the last name
	 * @param email the email
	 * @param pass the password
	 * @throws ClassNotFoundException
	 * @throws UserAlreadyExistsException
	 */
	public static void insertUserIntoDB(String user, String f, String l, String email, String pass) throws ClassNotFoundException, UserAlreadyExistsException
	{
		String tempUserInput = "insert into account values (";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			rs = state.executeQuery("select * from account where username = \'" + user + "\'");
			while (rs.next())
				throw new UserAlreadyExistsException();			//a user's username is a unique identifier; no two users should have the same username
			
			tempUserInput += "\'" + user + "\', \'" + pass + "\', \'" + f + "\', \'" + l + "\', \'" + email + "\')";
			state.execute(tempUserInput);
			
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Checks the user's input username and password when logging in.
	 * This is done by first finding the username supplied by the user login, and if applicable, then recording the associated password from the database.
	 * It then compares the input password with the password found in the database.
	 * If no exceptions are thrown, that means the user was found.
	 * If either the specified username was not found or its corresponding password does not match the input, an exception is thrown
	 * @param unInput the username typed in by the user
	 * @param pwInput the password typed in by the user
	 * @throws ClassNotFoundException
	 * @throws UserNotFoundException
	 */
	public static User findUserPW(String unInput, String pwInput) throws ClassNotFoundException, UserNotFoundException
	{
		String pwFound = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			rs = state.executeQuery("select password from account where username = \'" + unInput + "\'");
			while (rs.next())
				pwFound = rs.getString("password");
			if (pwFound == null)
				throw new UserNotFoundException();
			if (!(pwFound.equals(pwInput)))
				throw new UserNotFoundException();
			
			
			sqlConn.close();
			return getDetails(unInput);
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * gets the details of a user and returns them in an array
	 * does not include password because it would be unsafe to directly display a user's password
	 * @param focus the user's username
	 * @throws ClassNotFoundException
	 * @return an array of the user's first name, last name, email, and username
	 */
	public static User getDetails(String focus) throws ClassNotFoundException
	{
		String specQuery = "select * from account where username = \'" + focus + "\'";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			rs = state.executeQuery(specQuery);
			
			while (rs.next())
			{
				User.getInstance(rs.getString("firstName"), rs.getString("lastName"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
			}
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return User.getInstance();
	}
	
	/**
	 * deletes the schedule with the specified name from the database
	 * @param scheduleName
	 * @param username
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void deleteSchedule(String scheduleName, String username) throws SQLException, ClassNotFoundException {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			state.execute(scheduleDelete + scheduleName + "\' and creator = \'" + username + "\'");
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		} 	
	}
	
	/**
	 * a method to return the names of all schedules a user is a member of. This includes both ones they own and ones they were invited to 
	 * @return scheduleIDs an ArrayList of schedule names
	 * @throws ClassNotFoundException
	 */
	public static ArrayList<Schedule> findJoinedSchedules()
	{
		ArrayList<Schedule> schedules = new ArrayList<>();
		ArrayList<Integer> allscheduleIDs = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> tempID = new ArrayList<>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			rs = state.executeQuery("select scheduleID from account_schedule where username = \'" + User.getInstance().getUsername() + "\'");
			while (rs.next())
				allscheduleIDs.add(rs.getInt("scheduleID"));
			for (int i = 0; i < allscheduleIDs.size(); i++)
			{
				rs = state.executeQuery("select scheduleID, scheduleName from 7dayschedule where creator <> \'" + User.getInstance().getUsername() + "\' and accessibility = \'group\' and scheduleID = " + allscheduleIDs.get(i));
				while (rs.next())
				{
					names.add(rs.getString("scheduleName"));
					tempID.add(rs.getInt("scheduleID")); 
				}
			}
			for (int s = 0; s < tempID.size(); s++)
			{
				Integer[][] result = new Integer[7][24];
				for (int a = 0; a < 7; a++)
				{
					for (int b = 0; b < 24; b++)
					{
						result[a][b] = 0;
					}
				}
				for (int j = 1; j < 8; j++)
				{	
					rs = state.executeQuery("select * from group_day where scheduleID = \'" + tempID.get(s) + "\' and dayNum = \'" + j + "\'");
					while (rs.next())
					{
						for (int counter = 0; counter < 24; counter++)
						{
							result[j - 1][counter] += rs.getInt(timeDefinitions[counter]);
						}
						
					}
				}
				schedules.add(new Schedule(result, tempID.get(s), names.get(s), User.getInstance()));
			}
	
			sqlConn.close();
			
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return schedules;
	}
	
	/**
	 * a method which returns the schedule groups created by a specified user
	 * @return an ArrayList of created schedule names
	 * @throws ClassNotFoundException
	 */
	public static ArrayList<Schedule> findCreatedSchedules()
	{
		ArrayList<Integer> tempID = new ArrayList<>();
		ArrayList<Schedule> schedules = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			rs = state.executeQuery("select scheduleID, scheduleName from 7dayschedule where creator = \'" + User.getInstance().getUsername() + "\' and accessibility = \'group\'");
			while (rs.next())
			{
				names.add(rs.getString("scheduleName"));
				tempID.add(rs.getInt("scheduleID")); 
			}
			for (int s = 0; s < tempID.size(); s++)
			{
				Integer[][] result = new Integer[7][24];
				for (int a = 0; a < 7; a++)
				{
					for (int b = 0; b < 24; b++)
					{
						result[a][b] = 0;
					}
				}
				for (int i = 1; i < 8; i++)
				{	
					rs = state.executeQuery("select * from group_day where scheduleID = \'" + tempID.get(s) + "\' and dayNum = \'" + i + "\'");
					while (rs.next())
					{
						for (int counter = 0; counter < 24; counter++)
						{
							result[i - 1][counter] += rs.getInt(timeDefinitions[counter]);
						}
						
					}
				}
				schedules.add(new Schedule(result, tempID.get(s), names.get(s), User.getInstance()));
			}
	
			sqlConn.close();
			
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return schedules;
	}
	
	/**
	 * fetches information about the current user's personal schedules from the database
	 * @return
	 */
	public static ArrayList<Schedule> getPersonalSchedules()
	{
		ArrayList<Integer> tempID = new ArrayList<>();
		ArrayList<Schedule> schedules = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			rs = state.executeQuery("select scheduleID, scheduleName from 7dayschedule where creator = \'" + User.getInstance().getUsername() + "\' and accessibility = \'personal\'");
			while (rs.next())
			{
				names.add(rs.getString("scheduleName"));
				tempID.add(rs.getInt("scheduleID")); 
			}
			for (int s = 0; s < tempID.size(); s++)
			{
				Integer[][] result = new Integer[7][24];
				for (int i = 1; i < 8; i++)
				{	
					rs = state.executeQuery("select * from personal_day where scheduleID = \'" + tempID.get(s) + "\' and dayNum = \'" + i + "\'");
					while (rs.next())
					{
						for (int counter = 0; counter < 24; counter++)
						{
							result[i - 1][counter] = rs.getInt(timeDefinitions[counter]);
						}
						
					}
				}
				schedules.add(new Schedule(result, tempID.get(s), names.get(s), User.getInstance()));
			}
	
			sqlConn.close();
			
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return schedules;
	}
	
	/**
	 * updates the current user's personal schedule by first deleting the original schedule's day-time data from 
	 * the database, then inserts the new day-time data in its place
	 * @param schedule the schedule object containing the new schedule information
	 */
	public static void updatePersonalSchedule(Schedule schedule)
	{
		int counter = 0;
		int dayNum = 1;
		int soughtID = 0;
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			int tempID = schedule.getScheduleID();
			state.execute("delete from personal_day where scheduleID = " + tempID);
			
			while (dayNum < 8)
			{
				scheduleInsert = "insert into personal_day (scheduleID, dayNum, 12am, 1am, 2am, 3am, 4am, 5am, 6am, 7am, 8am, 9am, 10am, 11am, 12pm, 1pm, 2pm, 3pm, 4pm, 5pm, 6pm, 7pm, 8pm, 9pm, 10pm, 11pm) values (" + "\'" + tempID + "\', \'" + dayNum + "\', ";
				counter = 0;
				while (counter < 23)
				{
					scheduleInsert +="\'" +  schedule.getDayTimeValue(dayNum - 1, counter) + "\', ";
					counter ++;
				}
				scheduleInsert += schedule.getDayTimeValue(dayNum - 1, 23) + ")";
				state.execute(scheduleInsert);
				dayNum ++;
				
			}
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	/**
	 * initializes a personal schedule in the database according to the current user
	 * @param name the current user's username
	 * @return the newly-initialized scheule object, which has yet to contain day-time data
	 */
	public static Schedule initializePersonalSchedule(String name)
	{
		
		Schedule initialized = new Schedule();
		String tempInsertStatement = "insert into 7dayschedule (creator, scheduleName, accessibility) values (";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			tempInsertStatement += "\'" + User.getInstance().getUsername() + "\', \'" + name + "\', \'personal\')";
			state.execute(tempInsertStatement);
			Statement state2 = sqlConn.createStatement();
			ResultSet temprs = state2.executeQuery("select scheduleID, creator, scheduleName from 7dayschedule where creator = \'" + User.getInstance().getUsername() + "\' and accessibility = \'personal\' and scheduleName = \'" + name + "\'");
			while (temprs.next())
			{
				initialized.setScheduleID(temprs.getInt("scheduleID"));
				initialized.setCreator(temprs.getString("creator"));
				initialized.setScheduleName(name);
			}
			insertIntoAccountSchedule(User.getInstance().getUsername(), initialized);
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		return initialized;
	}
	
	/**
	 * inserts a row in the account_schedule table in the database to show that a certain user is connected to a certain schedule
	 * @param username the username of the user to be added
	 * @param schedule the schedule whose ID is to be added alongside the usename
	 */
	public static void insertIntoAccountSchedule(String username, Schedule schedule)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			state.execute("insert into account_schedule values(\'" + username + "\', \'" + schedule.getScheduleID() + "\')");
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * initializes a schedule group according to user information
	 * @param name the name of the new schedule group
	 * @return the newly-initialized schedule group, which has yet to contain any day-time data
	 */
	public static Schedule initializeGroupSchedule(String name)
	{
		
		Schedule initialized = new Schedule();
		String tempInsertStatement = "insert into 7dayschedule (creator, scheduleName, accessibility) values (";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			tempInsertStatement += "\'" + User.getInstance().getUsername() + "\', \'" + name + "\', \'group\')";
			state.execute(tempInsertStatement);
			Statement state2 = sqlConn.createStatement();
			ResultSet temprs = state2.executeQuery("select scheduleID, creator, scheduleName from 7dayschedule where creator = \'" + User.getInstance().getUsername() + "\' and accessibility = \'group\' and scheduleName = \'" + name + "\'");
			while (temprs.next())
			{
				initialized.setScheduleID(temprs.getInt("scheduleID"));
				initialized.setCreator(temprs.getString("creator"));
				initialized.setScheduleName(name);
			}
			insertIntoAccountSchedule(User.getInstance().getUsername(), initialized);
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		return initialized;
	}
	
	/**
	 * adds another user to a schedule group, as long as the parameters match a user and their personal schedule, and as long as they are not already a member
	 * @param username the username of the user to be added
	 * @param addedSchedule the name of the personal schedule to be added
	 * @param schedule the schedule that the user is being added to 
	 */
	public static void inviteMemberSchedule(String username, String addedSchedule, Schedule schedule)
	{
		int tempID = 0;
		int dayNum = 1;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			try
			{
				String userHere = null;
				rs = state.executeQuery("select member from group_day where scheduleID = \'" + schedule.getScheduleID() + "\' and member = \'" + username + "\' and dayNum = \'1\'");
				while (rs.next())
				{
					userHere = rs.getString("member");
				}
				if (userHere != null)
					throw new UserIsAlreadyAMemberException();
			}
			catch (UserIsAlreadyAMemberException e)
			{
				ErrorPopup.makePopup(e.getMessage());
				return;
			}
			
			rs = state.executeQuery("select scheduleID from 7dayschedule where creator = \'" + username + "\' and scheduleName = \'" + addedSchedule + "\' and accessibility = \'personal\'");
			while (rs.next())
				tempID = rs.getInt("scheduleID");
			if (tempID == 0)
				throw new UserNotFoundException();
			
			state.execute("insert into account_schedule values(\'" + username + "\', \'" + schedule.getScheduleID() + "\')");
			
			Integer[][] result = new Integer[7][24];
			
			for (int j = 1; j < 8; j++)
			{	
				rs = state.executeQuery("select * from personal_day where scheduleID = \'" + tempID + "\' and dayNum = \'" + j + "\'");
				while (rs.next())
				{
					for (int counter = 0; counter < 24; counter++)
					{
						result[j - 1][counter] = rs.getInt(timeDefinitions[counter]);
					}
					
				}
			}
			
			
			while (dayNum < 8)
			{
				scheduleInsert = "insert into group_day (scheduleID, dayNum, member, 12am, 1am, 2am, 3am, 4am, 5am, 6am, 7am, 8am, 9am, 10am, 11am, 12pm, 1pm, 2pm, 3pm, 4pm, 5pm, 6pm, 7pm, 8pm, 9pm, 10pm, 11pm) values (" + "\'" + schedule.getScheduleID() + "\', \'" + dayNum + "\', \'" + username + "\', ";
				int counter2 = 0;
				while (counter2 < 23)
				{
					scheduleInsert +="\'" +  result[dayNum - 1][counter2] + "\', ";
					counter2 ++;
				}
				scheduleInsert += result[dayNum - 1][23] + ")";
				state.execute(scheduleInsert);
				dayNum ++;
				
			}
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (UserNotFoundException e)
		{
			ErrorPopup.makePopup(e.getMessage());
			return;
		}
	}
	
	/**
	 * adds the current user's own personal schedule to the schedule group
	 * @param schedule the current user's schedule to be added
	 */
	public static void addOwnScheduleToGroup(Schedule schedule)
	{
		int counter = 0;
		int dayNum = 1;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			while (dayNum < 8)
			{
				scheduleInsert = "insert into group_day (scheduleID, dayNum, member, 12am, 1am, 2am, 3am, 4am, 5am, 6am, 7am, 8am, 9am, 10am, 11am, 12pm, 1pm, 2pm, 3pm, 4pm, 5pm, 6pm, 7pm, 8pm, 9pm, 10pm, 11pm) values (" + "\'" + Schedule.focusSchedule.getScheduleID() + "\', \'" + dayNum + "\', \'" + User.getInstance().getUsername() + "\', ";
				counter = 0;
				while (counter < 23)
				{
					scheduleInsert +="\'" +  schedule.getDayTimeValue(dayNum - 1, counter) + "\', ";
					counter ++;
				}
				scheduleInsert += schedule.getDayTimeValue(dayNum - 1, 23) + ")";
				state.execute(scheduleInsert);
				dayNum ++;
				
			}
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	/**
	 * removes a user from a schedule group, as long as they are a member of the group already
	 * @param schedule the schedule the user is being kicked from 
	 * @param username the username of the user to be removed
	 */
	public static void kickMember(Schedule schedule, String username) {
		
		try
		{
			String userInGroupDay = null;
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			rs = state.executeQuery("select * from group_day where scheduleID = " + schedule.getScheduleID() + " and member = \'" + username + "\' and dayNum = \'1\'");
			while(rs.next())
			{
				userInGroupDay = rs.getString("member");
			}
			if (userInGroupDay != null)
			{
				state.execute("delete from group_day where scheduleID = " + schedule.getScheduleID() + " and member = \'" + username + "\'");
				state.execute("delete from account_schedule where username = \'" + username + "\' and scheduleID = \'" + schedule.getScheduleID() + "\'");
			}
			else
				throw new UserIsNotAMemberException();
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		} 	
		catch (UserIsNotAMemberException e)
		{
			ErrorPopup.makePopup(e.getMessage());
		}
	}
	
	/**
	 * to test the contents of the database after running the practice method
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException 
	 * @throws UserAlreadyExistsException 
	 */
	public static void main(String[] args) throws ClassNotFoundException
	{
		MysqlConn attempt1 = new MysqlConn();
		attempt1.getDB();
		System.out.println(retrievedUsername.toString());
		System.out.println(retrievedFN.toString());
		System.out.println(retrievedLN.toString());
		System.out.println(retrievedEmail.toString());
		System.out.println(retrievedPW.toString());
		//attempt1.deleteSchedule("2022Meet", "MrMister");
		//attempt1.insertUserIntoDB(new User("Prthi", "Mohan", "prmo", "prthi.mohan@sjsu.edu", "passord"));
		//User.getInstance("Danilo", "Makarewycz", "Dmaka", "danilo.makarewycz@sjsu.edu", "inconspicuous");
		//ArrayList<Schedule> scheduleTester = attempt1.getPersonalSchedules();
		//Schedule first = scheduleTester.get(0);
		//System.out.println(first);
		//for (int i = 0; i < scheduleTester.size(); i++)
		//	scheduleTester.get(i).printScheduleValues();
		
		User.getInstance("one", "Sammysam", "two", "email", "Password8)");
		ArrayList<Schedule> allCreatedGroups = new ArrayList<>();
    	allCreatedGroups.addAll(MysqlConn.getPersonalSchedules());
    	for (int i = 0; i < allCreatedGroups.size(); i++)
        {
    		System.out.println(allCreatedGroups.get(i).getScheduleName());
    		if (allCreatedGroups.get(i).getScheduleName().equals("tryAdd"))
    		{
    			MysqlConn.addOwnScheduleToGroup(allCreatedGroups.get(i));
    			break;
    		}
    			
        }
		
	}
}
