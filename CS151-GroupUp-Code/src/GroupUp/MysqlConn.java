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
	private static final String myPassword = "Screw_HW-4";			//programmers are prompted to create a password along with the 'root' username
	private static final String database = "jdbc:mysql://localhost:3306/151projconnector";
	private String allQuery = "select * from account";			//SQL code to retrieve all values from every column in table user
	private static String userInsert = "insert into account values (";			//incomplete SQL code to insert a user's details into the table
	private static String specQuery = "select * from account where username = \'";
	private static String scheduleDelete = "delete from 7dayschedule where scheduleName = \'";
	
	private static ArrayList<String> retrievedUsername = new ArrayList<String>();
	private static ArrayList<String> retrievedFN = new ArrayList<String>();
	private static ArrayList<String> retrievedLN = new ArrayList<String>();
	private static ArrayList<String> retrievedEmail = new ArrayList<String>();
	private static ArrayList<String> retrievedPW = new ArrayList<String>();			//these four array lists are only used to check the contents of the connected database
	
	static Connection sqlConn = null;
	static Statement state = null;
	static ResultSet rs = null;			//results of a query
	
	
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
	public static void findUserPW(String unInput, String pwInput) throws ClassNotFoundException, UserNotFoundException
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
	 * gets the details of a user and returns them in an array
	 * does not include password because it would be unsafe to directly display a user's password
	 * @param focus the user's username
	 * @throws ClassNotFoundException
	 * @return an array of the user's first name, last name, email, and username
	 */
	public static String[] getDetails(String focus) throws ClassNotFoundException
	{
		String[] results = new String[4];
		specQuery += focus + "\'";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			sqlConn = DriverManager.getConnection(database, myUsername, myPassword);
			state = sqlConn.createStatement();
			
			rs = state.executeQuery(specQuery);
			
			while (rs.next())
			{
				results[0] = rs.getString("username");
				results[1] = rs.getString("firstName");
				results[2] = rs.getString("lastName");
				results[3] = rs.getString("email");
			}
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
		return results;
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
	 * to test the contents of the database after running the practice method
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException 
	 * @throws UserAlreadyExistsException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException, UserAlreadyExistsException
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
	}
}