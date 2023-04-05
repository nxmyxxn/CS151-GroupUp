package GroupUp;

import java.util.ArrayList;

public class User {

	private String name;
	private String username;
	private String email;
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
	public User(String name, String username, String email)		//havent added icon yet
	{
		this.name = name;
		this.username = username;
		this.email = email;
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
			if (unfriendly.name.equals(friendList.get(i).name))
				friendList.remove(i);
		}
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	
	
}
