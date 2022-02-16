import java.util.ArrayList;

/**
 * This class is to handle the main functions of a shopping list. It is instantiated
 * in the ListDriver class which modifies this class. This class depends upon the
 * SortBehavior interface to determine what sorting method to use. 
 * @author Mark Valentino
 */
public class Listing {
	// Holds title of a listing, such as "Grocery List".
	private String title;
	// Holds names of items in list such as "Apples".
	private ArrayList<String> items;
	// Holds method to sort items which can either be Bubble or Insertion sort.
	private SortBehavior sortBehavior;
	
	/**
	 * Constructor of the Listing class.
	 */
	public Listing(String title) {
		this.title = title;
		this.items = new ArrayList<String>();
		// BubbleSort instantiated here because it was not instantiated in driver
		sortBehavior = new BubbleSort();
	}
	
	/**
	 * Method to add items to ArrayList<String> items.
	 * @param item the String to be added.
	 */
	public void add(String item) {
		items.add(item);
	}
	
	/**
	 * Method to remove items from ArrayList<String> items.
	 * @param item the String to be removed.
	 */
	public void remove(String item) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equals(item)) {
				items.remove(i);
				// If item is removed, there is no need to iterate more. 
				break;
			}
		}
	}
	
	/**
	 * Method to get title of Listing. 
	 * @return title of the Listing.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Method to set what sorting algorithm to use in sortBehavior
	 * @param sortBehavior the algorithm to be set which can be BubbleSort or
	 * InsertionSort.
	 */
	public void setSortBehavior(SortBehavior sortBehavior) {
		this.sortBehavior = sortBehavior;
	}
	
	/**
	 * Method to call sorting class and return sorted String array list. 
	 * @return the sorted String array of items.
	 */
	public ArrayList<String> getSortedList() {
		return sortBehavior.sort(items);
	}
	
	/**
	 * Method to get unsorted array list of Strings.
	 * @return the local array list of items. 
	 */
	public ArrayList<String> getUnSortedList() {
		return items;
	} 
}
