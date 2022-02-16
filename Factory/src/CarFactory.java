/**
 * Class that handles creating Car objects which can be of the type SmallCar,
 * SedanCar, or LuxuryCar.
 * @author Mark Valentino
 */
public class CarFactory {
  
  /**
   * Method to create a Car. When a Car is created it is assembled by having
   * the assemble() method called.
   * @param type the type of Car to be made.
   * @param make the make of the Car to be made.
   * @param model the model of the Car to be made.
   * @return car the finished Car to be returned.
   */
  public static Car createCar(String type, String make, String model) {
    Car car = null;
    System.out.println("Creating a " + make + " " + model);
    // The type parameter is not in all upper case values.
    // It needs to be converted to all upper case to be compared with enums.
    type = type.toUpperCase();
    if(type.equals(CarType.SMALL.toString())) {
        car = new SmallCar(make, model);
        car.assemble();
    } else if(type.equals(CarType.SEDAN.toString())) {
      car = new SedanCar(make, model);
      car.assemble();
    } else {
      car = new LuxuryCar(make, model);
      car.assemble();
    }
    return car;
  }
}
