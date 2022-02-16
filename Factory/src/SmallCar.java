/**
 * Child class of Car. Has a different frame and list of accessories than other Cars.
 * @author Mark Valentino
 */
public class SmallCar extends Car{

  /**
   * Constructor
   * @param make the make of the Car to be built.
   * @param model the model of the Car to be built.
   */
  public SmallCar(String make, String model) {
    super(make, model);
  }

  /**
   * Method to display "Adding a small frame"
   */
  @Override
  public void addFrame() {
    System.out.println("Adding a small frame");
  }

  /**
   * Method to add accessories from Accessories enum.
   */
  @Override
  public void addAccessories() {
    accessories.add(Accessories.FLOOR_MATTS);
    accessories.add(Accessories.PHONE_CHARGER);
  }
}
