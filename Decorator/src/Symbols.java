/**
 * Child class of PasswordDecorator. Handles adding symbols
 * to password Strings.
 * @author Mark Valentino
 */
public class Symbols extends PasswordDecorator {

  public Password passwordBeginning;
  public String phrase;

  /**
   * Constructor. Replaces certain chars with other chars.
   * @param passwordBeginning the passwordBeginning to be stored.
   */
  public Symbols(Password passwordBeginning) {
    super(passwordBeginning);
    this.phrase = passwordBeginning.getPassword();
    this.phrase = phrase.replace("a","@");
    this.phrase = phrase.replace("b","8");
    this.phrase = phrase.replace("e","3");
    this.phrase = phrase.replace("g","9");
    this.phrase = phrase.replace("i","!");
    this.phrase = phrase.replace("a","@");
    this.phrase = phrase.replace("o","0");
    this.phrase = phrase.replace("s","$");
    this.phrase = phrase.replace("t","7");
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
