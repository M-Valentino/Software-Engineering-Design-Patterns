import java.util.Random;

/**
 * Child class of PasswordDecorator. Handles adding special chars 
 * to password Strings.
 * @author Mark Valentino
 */
public class SpecialChars extends PasswordDecorator {

  public Password passwordBeginning;
  public String phrase;

  /**
   * Constructor. Adds certain random chars next to other chars
   * 30% of the time randomly.
   * @param passwordBeginning the passwordBeginning to be stored.
   */
  public SpecialChars(Password passwordBeginning) {
    super(passwordBeginning);
    this.phrase = passwordBeginning.getPassword();
    Random random = new Random();
    // Holds modified phrase. Value will overwrite phrase variable at
    // the end of the method.
    String newPhrase = "";
    String tempChar;
    // Used in determining when to add special char 30% of the time.
    int randomPercent;
    // Used in randomly determining which character will be added.
    int specialCharNum;
    for(int i = 0; i < phrase.length(); i++) {
      tempChar = phrase.charAt(i) + "";
      randomPercent = random.nextInt(101);
      if (randomPercent < 30) {
        specialCharNum = random.nextInt(7);
        switch (specialCharNum) {
          case 0:
            newPhrase += "*";
            break;
          case 1:
            newPhrase += "!";
            break;
          case 2:
            newPhrase += "%";
            break;
          case 3:
            newPhrase += "+";
            break;
          case 4:
            newPhrase += ".";
            break;
          case 5:
            newPhrase += "{";
            break;
          case 6:
            newPhrase += "}";
            break;
        }
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
