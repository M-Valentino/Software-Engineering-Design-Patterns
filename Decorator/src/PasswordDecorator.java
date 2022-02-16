/**
 * Abstract class that handles decorations of password strings.
 * @author Mark Valentino
 */
public abstract class PasswordDecorator extends Password{
  
  protected Password passwordBeginning;
  
  /**
   * Constructor.
   * @param passwordBeginning the passwordBegining to be stored.
   */
  public PasswordDecorator(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }
  
  /**
   * Abstract method to return a password String.
   * @return phrase the password String to be returned.
   */
  public abstract String getPassword();
}
