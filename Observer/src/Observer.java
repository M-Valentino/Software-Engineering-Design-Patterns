import java.util.HashMap;
/**
 * Parent class of TallyDisplay and PercentageDisplay
 * @author Mark Valentino
 */
public interface Observer {

  /**
   * Abstract method to pass master HashMap from StudentGovPoll
   * to observers.
   * @param votes the HashMap to be passed.
   */
  public void update(HashMap<String, Integer> votes);
}
