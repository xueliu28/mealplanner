import java.util.ArrayList;

/**
 * The following class pulls information from a public API and stores in the
 * appropriate data structure (Temporarily, I used ArrayList, but we may use
 * JSON object as a data type to store or gather info.)
 */
public class APIHandlerAndParser {
	private ArrayList<String> infoFromAPI;

	/**
	 * The following constructor creates an API handler that works with a public API
	 * and pulls the information from it.
	 */
	public APIHandlerAndParser() {
		pullInfo();
	}

	/**
	 * The following method pulls information from an API and stores it in ArrayList
	 * @return updated ArrayList of information
	 */
	public ArrayList<String> pullInfo() {
		// TODO Auto-generated method stub
		return infoFromAPI;
	}

	/**
	 * @return the infoFromAPI
	 */
	public ArrayList<String> getInfoFromAPI() {
		return infoFromAPI;
	}
}
