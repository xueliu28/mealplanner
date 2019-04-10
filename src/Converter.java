/**
 * This class represents a converter that can convert ingredients from one to
 * another and change the serving size.
 *
 */
public class Converter {
	private String UnitToChangeFrom;
	private String UnitToChangeTo;
	private int ingredientQuantity;
	private Dish dishToConvertBasedOnServingSize;
	
	/**
	 * Constructor to change quantities of an ingredient based on measurement unit
	 * @param ingredientUnitChangeFrom name of the unit to change from
	 * @param Quantity quantity of an ingredient
	 * @param ingredientUnitChangeTo name of the unit to change to
	 */
	public Converter (String ingredientUnitChangeFrom, int Quantity, String ingredientUnitChangeTo) {
		// TODO 
	}

	/**
	 * Constructor to changes a dish's ingrentient quantities and cooking time based on service size change
	 * @param servingSizeToChangeFrom serving size to change from
	 * @param Quantity quantity of an ingredient
	 * @param servingSizeToChangeTo serving size to change to
	 */
	public Converter (int servingSizeToChangeFrom, int Quantity, int servingSizeToChangeTo) {
		// TODO 
	}

	
	/**
	 * The following method changes a dish's ingredient quantities and cooking time based 
	 * on service size change
	 * 
	 * @return updated dish with updated ingredient quantities and cooking time
	 */
	
	public Dish convert () {
		Dish d = null;
		//TODO
		return d;
	}
}
