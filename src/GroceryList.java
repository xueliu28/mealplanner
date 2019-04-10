import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class contains the grocery list and related methods and properties.
 */
public class GroceryList {

	private ArrayList<Ingredient> listOfIngredients = new ArrayList<Ingredient>();
	private ArrayList<Ingredient> groceryListUnsorted;
	private ArrayList<Ingredient> groceryList;

	/**
	 * The following constructor creates a grocery list item
	 */
	public GroceryList() {
		ArrayList<Ingredient> listOfIngredients = new ArrayList<Ingredient>();
	}

	/**
	 * The following method loops through the ArrayList of ingredients and creates
	 * an ArrayList of grocery list with the repeated items being added up for their
	 * quantities. This list remains unsorted.
	 */
	private void getGroceryListFromListOfIngredients() {
		// TODO Auto-generated method stub

	}

	/**
	 * The following method takes in unsorted grocery list and sorts it
	 * alphabetically
	 */
	private void getSortedGroceryList() {
		// TODO Auto-generated method stub

	}

	/**
	 * Given a list of ingredients, the following method adds them to the grocery
	 * list
	 * 
	 * @param groceryList       to be modified
	 * @param listOfIngredients to be added
	 */
	public void addIngredientsToGroceryList(ArrayList<Ingredient> groceryList,
			ArrayList<Ingredient> listOfIngredients) {
		// TODO Auto-generated method stub
	}

	/**
	 * Given a grocery list, the following method removed an item based on the
	 * item's index number
	 * 
	 * @param groceryList               to be modified
	 * @param indexOfTheItemToBeRemoved index of the item
	 */
	public void removeIngredientsFromGroceryList(ArrayList<Ingredient> groceryList, int indexOfTheItemToBeRemoved) {
		// TODO Auto-generated method stub
	}

	/**
	 * The following method displays the grocery list, along with an index starting
	 * with 1 1. Apples 2. Bananas
	 */
	public void displayGroceryList() {
		// TODO add the display method
	}
}
