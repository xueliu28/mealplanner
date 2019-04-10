import java.util.ArrayList;

/**
 * This class represents a full recipes that includes the ingredient lists,
 * along with their measures, cooking steps, serving size, and cooking time.
 *
 */
public class Dish {
	
	//instance variables
	private String dishName;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<String> cookingSteps;
	private double cookingTimeInMinutes;
	private int numOfPeopleToServe; //serving size

	//same constructor can be used for API pull or manual input of the recipe
	public Dish (String dishName, ArrayList <Ingredient> ingredients, ArrayList <String> cookingSteps, double cookingTimeInMinutes, int numOfPeopleToServe) {
		this.dishName = dishName;
		this.ingredients = ingredients;
		this.cookingSteps = cookingSteps;
		this.cookingTimeInMinutes = cookingTimeInMinutes;
		this.numOfPeopleToServe = numOfPeopleToServe;	
	}

	//see getter methods below

	/**
	 * getter method
	 * @return the dishName
	 */
	public String getDishName() {
		return dishName;
	}

	/**
	 * getter method
	 * @return the ingredients
	 */
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * getter method
	 * @return the cookingSteps
	 */
	public ArrayList<String> getCookingSteps() {
		return cookingSteps;
	}

	/**
	 * getter method
	 * @return the cookingTimeInMinutes
	 */
	public double getCookingTimeInMinutes() {
		return cookingTimeInMinutes;
	}

	/**
	 * getter method
	 * @return the numOfPeopleToServe
	 */
	public int getNumOfPeopleToServe() {
		return numOfPeopleToServe;
	}
}
