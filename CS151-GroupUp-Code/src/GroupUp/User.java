package GroupUp;

import java.util.ArrayList;

public class User {

	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String password;
	private Schedule[] ownedSchedules;		//keeping it as a list in case we want to set a maximum number of owned schedules
	private ArrayList<User> friendList;
	
	public static User instance;
	
	/**
	 * default constructor
	 */
	private User()
	{
		
	}
	/**
	 * constructor for the user object
	 * @param name
	 * @param username
	 * @param email
	 */
	private User(String fname, String lname, String username, String email, String password)		//havent added icon yet
	{
		this.firstName = fname;
		this.lastName = lname;
		this.username = username;
		this.email = email;
		this.password = password;
		ownedSchedules = new Schedule[10];
		friendList = new ArrayList<User>();
	}
	/**
	 * method to add a friend (User object) to this user's friend list
	 * @param friendly
	 */
	public void addFriend(User friendly)
		{
			friendList.add(friendly);
		}
	
	public void deleteFriend(User unfriendly)
	{
		for (int i = 0; i < friendList.size(); i++)
		{
			if (unfriendly.firstName.equals(friendList.get(i).firstName))
				friendList.remove(i);
		}
	}
	
	/**
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @return the email
	 */
	public String getEmailAddress() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * @return the ownedSchedules
	 */
	public Schedule[] getOwnedSchedules() {
		return ownedSchedules;
	}
	
	/**
	 * @return the friendList
	 */
	public ArrayList<User> getFriendList() {
		return friendList;
	}
	
	/**
	 * Creates an instance for the user upon signup or login, given their first and last name, username, password, and email.
	 * 
	 * @param fname 	user's first name
	 * @param lname     user's last name
	 * @param username  user's username
	 * @param email     user's email
	 * @param pw 		user's password
	 * 
	 */
	public static User getInstance(String fname, String lname, String username, String email, String password)
	{
		if (instance == null)
			instance = new User(fname, lname, username, email, password);
		return instance;
	}
	
	
	/**
	 * default getInstance for the instance singleton
	 * @return the class's instance
	 */
	public static User getInstance()
	{
		if (instance == null)
			instance = new User();
		return instance;
	}
	public static void nullifyInstance()
	{
		if (instance != null)
			instance = null;
	}
	
	
}
