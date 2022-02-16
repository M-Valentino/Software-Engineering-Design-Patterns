import java.util.ArrayList;

/**
 * Child class of SortBehavior interface. 
 * @author Mark Valentino
 */
public class BubbleSort implements SortBehavior{
  
	/**
	 * Method to sort a String array using the Bubble Sort algorithm alphabetically.
	 * @param Unsorted String array to be sorted.
	 * @return The sorted String array.
	 */
	@Override
	public ArrayList<String> sort(ArrayList<String> data) {
		// Used to hold item temporarily so item positions can be swapped.
		String tempItem;
		for (int i = 0; i < data.size(); i++) {
			for (int j = 0; j < data.size(); j++) {
				if (data.get(i).charAt(0) < data.get(j).charAt(0)) {
					tempItem = data.get(j);
					data.set(j, data.get(i));
					data.set(i, tempItem);
				}
			}
		}
		return data;
	}
}