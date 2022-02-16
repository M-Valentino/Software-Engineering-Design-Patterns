import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * Child class of Observer. This class handles the display of vote percentages.
 * @author Mark Valentino
 */
public class PercentageDisplay implements Observer {
  
  private Subject poll;
  private HashMap<String, Integer> votes;
  private int numVotes;
  
  /**
   * Constructor
   * @param poll the Subject to be set.
   */
  public PercentageDisplay(Subject poll) {
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
    for (String i : votes.keySet()) {
      numVotes += votes.get(i);
    }
    display();
  }
  
  /**
   * Method to display vote percentages for each candidate.
   */
  private void display() {
    DecimalFormat df = new DecimalFormat("#.#%");
    System.out.println("\nCurrent Percent of Votes:");
    for (String i : votes.keySet()) {
      System.out.println(i + ": " + df.format((double)(votes.get(i))/numVotes));
    }
  }
}
