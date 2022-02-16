import java.util.Random;

/**
 * Class that implements a password and is a child of Password.
 * @author Mark Valentino
 */
public class EasyPassword extends Password {
  
  Random random = new Random();
  String phrase;
  
  /**
   * Constructor that also removes white space and appends a random
   * int in the range of 0 to 100.
   * @param phrase the phrase to be turned into a password String.
   */
  EasyPassword(String phrase) {
    this.phrase = phrase.replaceAll("\\s+","") + random.nextInt(101);
  }
  
  /**
   * Method to return a password String.
   * @return phrase the String to be returned. 
   */
  public String getPassword() {
    return phrase;
  }
}
