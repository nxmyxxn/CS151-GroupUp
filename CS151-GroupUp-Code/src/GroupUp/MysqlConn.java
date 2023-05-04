package GroupUp;

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
import exceptions.UserNotFoundException;

/**
 * connects the java program to a mysql database on my computer.
 * Various code sections reference the following links:
 * https://www.tutorialspoint.com/jdbc/jdbc-quick-guide.htm#
 * https://www.youtube.com/watch?v=bmv5SLrEQ-M
 * https://www.youtube.com/watch?v=6PvKTg9NXkU
 * much of this code is copied / takes inspiration from Danilo's homework 4 code
 * @author dmaka
 *
 */
public class MysqlConn {
	
	private static final String myUsername = "root";			//default username for mySQL
	private static final String myPassword = "%Msq23Cs151*";			//programmers are prompted to create a password along with the 'root' username
	private static final String database = "jdbc:mysql://localhost:3306/151projconnector";
	private String allQuery = "select * from account";			//SQL code to retrieve all values from every column in table user
	private static String userInsert = "insert into account values (";			//incomplete SQL code to insert a user's details into the table
	private static String specQuery = "select * from account where username = \'";
	private static String scheduleDelete = "delete from 7dayschedule where scheduleName = \'";
	private static String scheduleInsert = "insert into personal_day (scheduleID, dayNum, 12am, 1am, 2am, 3am, 4am, 5am, 6am, 7am, 8am, 9am, 10am, 11am, 12pm, 1pm, 2pm, 3pm, 4pm, 5pm, 6pm, 7pm, 8pm, 9pm, 10pm, 11pm) values (";
	private static String insertPersonalSchedule = "insert into 7dayschedule (creator, scheduleName, accessibility) values (";
	
	private static ArrayList<String> retrievedUsername = new ArrayList<>();
	private static ArrayList<String> retrievedFN = new ArrayList<>();
	private static ArrayList<String> retrievedLN = new ArrayList<>();
	private static ArrayList<String> retrievedEmail = new ArrayList<>();
	private static ArrayList<String> retrievedPW = new ArrayList<>();			//these four array lists are only used to check the contents of the connected database
	
	private final static String[] timeDefinitions = {"12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm"};
	
	static Connection sqlConn = null;
	static Statement state = null;
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
	 * @param focus the input user object
	 * @throws ClassNotFoundException
	 * @throws UserAlreadyExistsException
	 */
	public static void insertUserIntoDB(User focus) throws ClassNotFoundException, UserAlreadyExistsException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			rs = state.executeQuery("select * from account where email = \'" + focus.getEmailAddress() + "\'");
			while (rs.next())
				throw new UserAlreadyExistsException();			//a user's email is a unique identifier; no two users should have the same email
			
			userInsert += "\'" + focus.getUsername() + "\', \'" + focus.getPassword() + "\', \'" + focus.getFirstName() + "\', \'" + focus.getLastName() + "\', \'" + focus.getEmailAddress() + "\')";
			state.execute(userInsert);
			
			
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
		specQuery += focus + "\'";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			rs = state.executeQuery(specQuery);
			
			while (rs.next())
			{
				User.getInstance(rs.getString("firstName"), rs.getString("lastName"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
				//results.setUsername(rs.getString("username"));
				//results.setName(rs.getString("firstName"), rs.getString("lastName"));
				//results.setEmail(rs.getString("email"));
				//results.setPassword(rs.getString("password"));
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
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * a method to return the names of all schedules a user is a member of. This includes both ones they own and ones they were invited to 
	 * @return scheduleIDs an ArrayList of schedule names
	 * @throws ClassNotFoundException
	 */
	public static ArrayList<String> findJoinedSchedules()
	{
		ArrayList<String> schedules = new ArrayList<>();
		ArrayList<Integer> scheduleIDs = new ArrayList<>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			rs = state.executeQuery("select scheduleID from account_schedule where username = \'" + User.getInstance().getUsername() + "\'");
			while (rs.next())
				scheduleIDs.add(rs.getInt("scheduleID"));
			for (int i = 0; i < scheduleIDs.size(); i++)
			{
				rs = state.executeQuery("select scheduleName from 7dayschedule where scheduleID = \'" + scheduleIDs.get(i) + "\' and accessibility = \'group\'");
				while (rs.next())
					schedules.add(rs.getString("scheduleName"));
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
	 * a method which returns the names of the schedules created by a specified user
	 * @param focus the specified user
	 * @return an ArrayList of created schedule names
	 * @throws ClassNotFoundException
	 */
	public static ArrayList<String> findCreatedSchedules()
	{
		ArrayList<String> schedules = new ArrayList<>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			rs = state.executeQuery("select scheduleName from 7dayschedule where creator = \'" + User.getInstance().getUsername() + "\'");
			while (rs.next())
				schedules.add(rs.getString("scheduleID"));
	
			sqlConn.close();
			
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return schedules;
	}
	
	/**
	 * fetches information about a schedule from the database
	 * @return
	 */
	public static ArrayList<Schedule> getPersonalSchedules()
	{
		Integer[][] result = new Integer[7][24];
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
				Schedule returnedSchedule = new Schedule();
				returnedSchedule.setDaysTimes(result);
				returnedSchedule.setScheduleID(tempID.get(s));
				returnedSchedule.setScheduleName(names.get(s));
				schedules.add(returnedSchedule);
			}
	
			sqlConn.close();
			
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		
		return schedules;
	}
	
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
			int tempID = 0;
			rs = state.executeQuery("select scheduleID from 7dayschedule where scheduleName = \'" + schedule.getScheduleName() + "\'");
			while(rs.next())
				tempID = rs.getInt("scheduleID");
			state.execute("delete from personal_day where scheduleID = " + tempID);
			
			while (dayNum < 8)
			{
				scheduleInsert = "insert into personal_day (scheduleID, dayNum, 12am, 1am, 2am, 3am, 4am, 5am, 6am, 7am, 8am, 9am, 10am, 11am, 12pm, 1pm, 2pm, 3pm, 4pm, 5pm, 6pm, 7pm, 8pm, 9pm, 10pm, 11pm) values (" + "\'" + tempID + "\', " + dayNum + "\', ";
				while (counter < 23)
				{
					scheduleInsert +="\'" +  schedule.getDayTimeValue(dayNum - 1, counter) + "\', ";
					counter ++;
				}
				scheduleInsert += schedule.getDayTimeValue(dayNum - 1, 23) + ") where dayNum = " + dayNum + "and scheduleID = " + schedule.getScheduleID();
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
	
	public static Schedule initializePersonalSchedule(String name)
	{
		
		Schedule initialized = new Schedule();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			insertPersonalSchedule += "\'" + User.getInstance().getUsername() + "\', \'" + name + "\', \'personal\')";
			state.execute(insertPersonalSchedule);
		
			rs = state.executeQuery("select scheduleID, creator, scheduleName from 7dayschedule where username = \'" + User.getInstance().getUsername() + "\' and accessibility = \'personal\'");
			while (rs.next())
			{
				initialized.setScheduleID(rs.getInt("scheduleID"));
				initialized.setCreator(rs.getString("creator"));
				initialized.setScheduleName(rs.getString("scheduleName"));
			}
			state.execute("insert into account_schedule values(\'" + User.getInstance().getUsername() + "\', \'" + initialized.getScheduleID() + "\')");
			
			sqlConn.close();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		return initialized;
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
		User.getInstance("Danilo", "Makarewycz", "Dmaka", "danilo.makarewycz@sjsu.edu", "inconspicuous");
		ArrayList<Schedule> scheduleTester = attempt1.getPersonalSchedules();
		Schedule first = scheduleTester.get(0);
		System.out.println(first);
		for (int i = 0; i < scheduleTester.size(); i++)
			scheduleTester.get(i).printScheduleValues();
		
	}
}
