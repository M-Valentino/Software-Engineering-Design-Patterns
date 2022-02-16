import java.util.ArrayList;

/**
 * Class that handles main data and methods of Car child classes. 
 * @author Mark Valentino
 */
public abstract class Car {
  
  private String make;
  private String model;
  
  protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();
  
  /**
   * Constructor
   * @param make the make of the Car to be made.
   * @param model the model of the Car to be made.
   */
  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }
  
  /**
   * Method to assemble a car by calling multiple methods depending on order.
   */
  public void assemble() {
    addFrame();
    addWheels();
    addEngine();
    addWindows();
    addAccessories();
    displayAccessories();
  }
  
  /**
   * Abstract method that displays the type of frame to be added.
   */
  public abstract void addFrame();
  
  /**
   * Method to display adding wheels to a Car.
   */
  protected void addWheels() {
    System.out.println("Adding the Wheels");
  }
  
  /**
   * Method to display adding an engine to a Car.
   */
  protected void addEngine() {
    System.out.println("Adding a Standard Engine");
  }
  
  /**
   * Method to display adding a window to a Car.
   */
  protected void addWindows() {
    System.out.println("Adding Windows");
  }
  
  /**
   * Abstract method that adds accessories from Accessories enum.
   */
  public abstract void addAccessories();
  
  /**
   * Method to display all accessories of a Car from accessories ArrayList.
   */
  protected void displayAccessories() {
    System.out.println("Accessories:");
    for (int i = 0; i < accessories.size(); i++) {
      System.out.println("- " + accessories.get(i).toString());
    }
  }
}
