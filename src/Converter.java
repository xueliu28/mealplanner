/**
 * This class represents a converter that can convert ingredients from one to
 * another and change the serving size.
 *
 */
public class Converter {
	private String unitToChangeFrom;
	private String unitToChangeTo;
	private double ingredientQuantity;
	private Dish dishToConvertBasedOnServingSize;

	/**
	 * Constructor to change quantities of an ingredient based on measurement unit
	 * This will be used for grocery list ingredient accumulation process
	 * 
	 * @param ingredientUnitChangeFrom name of the unit to change from
	 * @param quantity                 quantity of an ingredient
	 * @param ingredientUnitChangeTo   name of the unit to change to
	 */
	public Converter(String ingredientUnitChangeFrom, int quantity, String ingredientUnitChangeTo) {
		ConvertIngredientQuantity();
		// TODO add code here
	}

	/**
	 * The following constructor creates a converter that converts a dish based on
	 * serving size change
	 * 
	 * @param dishToConvert        dish to convert
	 * @param servingSizeToConvert serving size to convert from
	 * @param desiredServingSize   desired serving size
	 */
	public Converter(Dish dishToConvert, int servingSizeToConvert, int desiredServingSize) {
		convertDish();
		// TODO add code here
	}

	/**
	 * The following method changes a dish's ingredient quantities and cooking time
	 * based on service size change
	 * 
	 * @return quantity
	 */
	public double ConvertIngredientQuantity() {
		double updatedQuantity = 0;
		// TODO
		return updatedQuantity;
	}

	/**
	 * The following method changes a dish's ingredient quantities and cooking time
	 * based on service size change
	 * 
	 * @return updated dish with updated ingredient quantities and cooking time
	 */

	public Dish convertDish() {
		Dish d = null;
		// TODO add the body
		return d;
	}
}
