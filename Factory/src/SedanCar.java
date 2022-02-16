/**
 * Child class of Car. Has a different frame and list of accessories than other Cars.
 * @author Mark Valentino
 */
public class SedanCar extends Car{

  /**
   * Constructor
   * @param make the make of the Car to be built.
   * @param model the model of the Car to be built.
   */
  public SedanCar(String make, String model) {
    super(make, model);
  }

  /**
   * Method to display "Adding a three part frame"
   */
  @Override
  public void addFrame() {
    System.out.println("Adding a three part frame");
  }

  /**
   * Method to add accessories from Accessories enum.
   */
  @Override
  public void addAccessories() {
    accessories.add(Accessories.FLOOR_MATTS);
    accessories.add(Accessories.PHONE_CHARGER);
    accessories.add(Accessories.BACK_UP_CAMERA);
    accessories.add(Accessories.EXTRA_CUP_HOLDERS);
    accessories.add(Accessories.HEATED_SEATS);
  }
}
