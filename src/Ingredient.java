import java.util.HashMap;

/**
 * The following class represents an ingredient in a recipe 
 *
 */
public class Ingredient {
	private String ingredientName;
	private int quantity;
	private String quantityUnit;

	public Ingredient (String ingredientName, int quantity, String quantityUnit) {
		this.ingredientName = ingredientName;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
	}

	/**
	 * @return the ingredientName
	 */
	public String getIngredientName() {
		return ingredientName;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the quantityUnit
	 */
	public String getQuantityUnit() {
		return quantityUnit;
	}
}
