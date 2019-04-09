import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class contains the grocery list and related methods and properties.
 */
public class GroceryList {
	
	private String ingredient;
	private int quantity;
	private HashMap<String, Integer> ingredientAndQuantity = new HashMap<String, Integer>();

	
	public GroceryList (String ingredient, int quantity){
		this.ingredient = ingredient;
		this.quantity = quantity;
	}
	
	public HashMap<String, Integer> getIngredientAndQuantityHashMap (ArrayList <String> ingredients, ArrayList <Integer> quantities) {
		for (int i = 0; i < ingredients.size(); i++) {
			ingredientAndQuantity.put(ingredients.get(i), quantities.get(i));
		}
		return ingredientAndQuantity;
	}
}
