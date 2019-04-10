/**
 * This class represents a calendar to display and/or to be printed
 *
 */
public class Calendar {
	private String [] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	private String [] meal = {"Breakfast", "Lunch", "Snack", "Dinner"};
	private String[][] calendar = new String [8][5];// 7 days + 1 heading and 4 meals + 1 label
	
	/**
	 * The following constructor creates a 2D string Array with days of the week as
	 * columns and meals as rows. For example,
	 * 
	 * Meal Name	Mon		Tues	Wed		Thur	Fri		Sat		Sun
	 * Breakfast	Meal	Meal	Meal	Meal	Meal	Meal	Meal
	 * Lunch		Meal	Meal	Meal	Meal	Meal	Meal	Meal
	 * Snack		Meal	Meal	Meal	Meal	Meal	Meal	Meal
	 * Dinner		Meal	Meal	Meal	Meal	Meal	Meal	Meal
	 */
	public Calendar () {
		String[][] calendar = new String [8][5];
		//write a loop to create a 2D array
	}
	
	/**
	 * The following method modifies the calendar instance variable based on the
	 * day and meal selected and adds the dish name instead of "meal" string
	 * @param mealName
	 * @param dayOfTheWeek
	 * @return updated calendar
	 */
	public String[][] addADishToCalendar (String mealName, String dayOfTheWeek) {
		//TODO update the calendar to replace "meal" with the dish name
		return calendar;
	}

	/**
	 * The following method removes a meal from the calendar and places the word "meal"
	 * as a placeholder
	 * @param mealName
	 * @param dayOfTheWeek
	 * @return updated calendar
	 */
	public String[][] removeADishFromTheCalendar (String mealName, String dayOfTheWeek){
		//TODO update the calendar to replace "meal" with the dish name
		return calendar;
	}

	/**
	 * The following method replaces a meal on the calendar with another meal 
	 * from the calendar
	 * @param mealNameToBeReplaced
	 * @param dayOfTheWeekToBeReplaced
	 * @param mealNameReplacedWith
	 * @param dayOfTheWeekReplacedWith
	 * @return updated calendar
	 */
	public String[][] replaceAMealWithAnother (String mealNameToBeReplaced, String dayOfTheWeekToBeReplaced, String mealNameReplacedWith, String dayOfTheWeekReplacedWith){
		//TODO update the calendar to replace the old dish with the new dish on the appropriate day
		return calendar;
	}

	
}
