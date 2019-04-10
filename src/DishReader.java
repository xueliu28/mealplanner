import java.util.ArrayList;

/**
 * The following class reads a dish from the parsed API information provided in
 * an ArrayList format (or it may be in JSON/XML format)
 *
 */
public class DishReader {
	private ArrayList<String> parsedInfo;
	private ArrayList<Dish> dishes;

	public DishReader(ArrayList<String> parsedInfo) {
		this.parsedInfo = parsedInfo;
		createDish();
	}

	/**
	 * The following method returns an ArrayList of dish objects from the parsed
	 * info
	 */
	public void createDish() {
		ArrayList<Dish> dishes = new ArrayList<Dish>();
		// TODO add code here
		this.dishes = dishes;
	}

}
