import java.util.HashMap;

/**
 * Child class of Observer. This class handles the display of vote tallies.
 * @author Mark Valentino
 */
public class TallyDisplay implements Observer{
  
  private Subject poll;
  private HashMap<String, Integer> votes;

  /**
   * Constructor
   * @param poll the Subject to be set.
   */
  public TallyDisplay(Subject poll) {
    this.poll = poll;
    poll.registerObserver(this);
    this.votes = new HashMap<String, Integer>();
  }
  
  /**
   * Method to make the local variable votes be the same
   * as StudentGovPoll's copy of votes.
   * @param votes the updated HashMap.
   */
  @Override
  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    display();
  }
  
  /**
   * Method to display total votes for each candidate.
   */
  private void display() {
    System.out.println("\nCurrent Tallies:");
    for (String i : votes.keySet()) {
      System.out.println(i + ": " + votes.get(i));
    }
  }
}
