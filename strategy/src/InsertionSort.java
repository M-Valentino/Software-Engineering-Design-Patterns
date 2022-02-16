import java.util.ArrayList;

/**
 * Child class of SortBehavior interface. 
 * @author Mark Valentino
 */
public class InsertionSort implements SortBehavior{
  
	/**
	 * Method to sort a String array using the Insertion Sort algorithm alphabetically.
	 * @param Unsorted String array to be sorted.
	 * @return The sorted String array.
	 */
	@Override
	public ArrayList<String> sort(ArrayList<String> data) {
		// Code referenced from here: https://www.geeksforgeeks.org/insertion-sort/
		// Current item to be compared to previous item.
		String key;
		// Variable that is a secondary index to data array.
		int j;
		for (int i = 1; i < data.size(); i++) {
			key = data.get(i);
			j = i - 1;
			while (j >=0 && data.get(j).charAt(0) > key.charAt(0)) {
				data.set(j + 1, data.get(j));
				j--;
			}
			data.set(j + 1, key);
		}
		return data;
	}
}
