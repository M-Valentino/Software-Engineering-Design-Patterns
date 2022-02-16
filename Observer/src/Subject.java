/**
 * Interface class that is the parent of StudentGovPoll class. 
 * @author Mark Valentino
 */
public interface Subject {

  /**
   * Abstract method to add an Observer to observers ArrayList.
   * @param observer the Observer to be added.
   */
  public void registerObserver(Observer observer);
  
  /**
   * Abstract method to remove an Observer to observers ArrayList.
   * @param observer the Observer to be removed.
   */
  public void removeObserver(Observer observer);
  
  /**
   * Abstract method to pass votes to all observers in observers array.
   */
  public void notifyObservers();
}
