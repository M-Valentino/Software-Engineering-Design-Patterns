/**
 * Child class of Car. Has a different frame and list of accessories than other Cars.
 * Also has a different engine than other Cars.
 * @author Mark Valentino
 */
public class LuxuryCar extends Car{

  /**
   * Constructor
   * @param make the make of the Car to be built.
   * @param model the model of the Car to be built.
   */
  public LuxuryCar(String make, String model) {
    super(make, model);
  }

  /**
   * Method to display "Adding a beautiful frame"
   */
  @Override
  public void addFrame() {
    System.out.println("Adding a beautiful frame");
  }
  
  /**
   * Method to display "Adding a Supped Up Engine"
   */
  @Override
  protected void addEngine() {
    System.out.println("Adding a Supped Up Engine");
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
    accessories.add(Accessories.SPORTS_SEATS);
    accessories.add(Accessories.WINDOW_TINT);
    accessories.add(Accessories.HIGH_END_SOUND);
    accessories.add(Accessories.TRUNK_ORGANIZER);
    accessories.add(Accessories.BLUE_TOOTH);
  }
}
