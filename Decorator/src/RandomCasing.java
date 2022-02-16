/**
 * Child class of PasswordDecorator. Handles adding random casing 
 * to password Strings.
 * @author Mark Valentino
 */
public class RandomCasing extends PasswordDecorator {

  public Password passwordBeginning;
  public String phrase;

  /**
   * Constructor. Makes half of the chars upper case and the other
   * half lower case.
   * @param passwordBeginning the passwordBeginning to be stored.
   */
  public RandomCasing(Password passwordBeginning) {
    super(passwordBeginning);
    this.phrase = passwordBeginning.getPassword().toLowerCase();
    // Holds modified phrase. Value will overwrite phrase variable at
    // the end of the method.
    String newPhrase = "";
    String tempChar;
    for (int i = 0; i < phrase.length(); i++) {
      tempChar = phrase.charAt(i) + "";
      // i % 2 will be 0 50% of the time.
      if (i % 2 == 0) {
        tempChar = tempChar.toUpperCase();
        newPhrase += tempChar;
      } else {
        newPhrase += tempChar;
      }
    }
    phrase = newPhrase;
  }

  /**
   * Method to return modified password String.
   * @return phrase the modified password String.
   */
  @Override
  public String getPassword() {
    return phrase;
  }
}
