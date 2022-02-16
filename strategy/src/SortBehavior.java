import java.util.ArrayList;

/**
 * This interface interfaces with the BubbleSort and InsertionSort method. 
 * @author Mark Valentino
 */
public interface SortBehavior {
	
	/**
	 * Abstract method for sort methods in BubbleSort and InsertionSort
	 * methods. 
	 * @param data the array list of unsorted Strings
	 * @return the sorted array list of Strings.
	 */
	public ArrayList<String> sort(ArrayList<String> data);
}
