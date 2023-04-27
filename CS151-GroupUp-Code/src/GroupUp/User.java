package GroupUp;

import java.util.ArrayList;

public class User {

	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String password;
	//private icon;
	private Schedule[] ownedSchedules;		//keeping it as a list in case we want to set a maximum number of owned schedules
	private ArrayList<User> friendList;
	
	/**
	 * default constructor
	 */
	public User()
	{
		
	}
	/**
	 * constructor for the user object
	 * @param name
	 * @param username
	 * @param email
	 */
	public User(String fname, String lname, String email, String password)		//havent added icon yet
	{
		this.firstName = fname;
		this.lastName = lname;
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
	 * Creates an account for the user, given their first and last name, password, and email.
	 * 
	 * @param fname 	user's name
	 * @param lname     user's username
	 * @param email     user's email
	 * @param pw 		user's password
	 * 
	 */
	public void createAccount(String fname, String lname, String email, String pw)
	{
		this.firstName = fname;
		this.firstName = lname;
		this.email = email;
		this.password = pw;
	}
	
	
	
}
