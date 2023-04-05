package GroupUp;

import java.awt.Color;
import java.util.ArrayList;

public class Day {

	
	
	
	enum Availability {
		PreferredDay, 
		OkayDay,
		NotTheBestDay,
		OccupiedDay
	}
	private Boolean blackout;
	private ArrayList<Integer> availabilityScores;
	//private Availability medianAvailability; not exactly needed if we can ust calculate it
	private Color color;
	
	public Day()
	{
		blackout = false;
		availabilityScores = new ArrayList<Integer>();		//did not preset availability nor color cuz methods should calculate them
	}
	
	/**
	 * getter for blackout quality
	 * @return blackout Boolean variable
	 */
	public Boolean getBlackout() {
		return blackout;
	}
	/**
	 * setter for blackout day
	 * @param blackout
	 */
	public void setBlackout(Boolean blackout) {
		this.blackout = blackout;
	}

	/**
	 * method to add a score to the availability scores array
	 * @param input, expected to be from 1 to 4
	 */
	public void addScore(int input)
	{
		availabilityScores.add(input);
	}
	/**
	 * getter for the average availability score, calculated from the array
	 * @return total availability score count / number of scores
	 */
	public double getAvgAvailabilityScore() {
		double result = 0;
		for (int i = 0; i < availabilityScores.size(); i++)
		{
			result += availabilityScores.get(i);
		}
		return result / availabilityScores.size();
	}
	
	/**
	 * getter for the median availability
	 * @return the median availability described through an enum ye with four different descriptors
	 */
	public Availability getMedianAvailability() {
		double average = getAvgAvailabilityScore();
		if (average < 3)
			return Availability.PreferredDay;
		else if (average < 2)
			return Availability.OkayDay;
		else if (average < 1)
			return Availability.NotTheBestDay;
		else
			return Availability.OccupiedDay;
	}
	
	/**
	 * getter for a day's color
	 * @return the day's color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * setter for a days color, should not be changed by user (to do later once we decide what color is good for each Availability enum.
	 * @param color
	 */
	public void setColor(Color color) {				//be sure to edit here
		this.color = color;
	}
	
	
}

