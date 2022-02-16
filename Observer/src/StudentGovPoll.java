import java.util.ArrayList;
import java.util.HashMap;

/**
 * This is a child class of Subject. StudentGovPoll handles the main functions in
 * a voting poll and passes off data to Observers.
 * @author Mark Valentino
 */
public class StudentGovPoll implements Subject {
  
  private ArrayList<Observer> observers;
  private HashMap<String, Integer> votes;
  private String school;
  private int numUpdates;
  
  /**
   * Constructor 
   * @param school the name of the School doing the poll.
   */
  public StudentGovPoll(String school) {
    this.school = school;
    this.observers = new ArrayList<Observer>();
    this.votes = new HashMap<String, Integer>();
  }
  
  /**
   * Method to add an Observer to observers ArrayList.
   * @param observer the Observer to be added.
   */
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }
  
  /**
   * Method to remove an Observer to observers ArrayList.
   * @param observer the Observer to be removed.
   */
  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /**
   * Method to pass votes to all observers in observers array.
   */
  @Override
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
        observers.get(i).update(votes);
    }
  }
  
  /**
   * Method to add presidential candidate to votes.
   * @param president the presidential candidate to be added.
   */
  public void addCandidate(String president) {
    votes.put(president, 0);
  }
  
  /**
   * Mutator method that adds new votes to the vote count of presidential 
   * candidates. Calls notifyObservers method after every 4th update.
   * @param president the key to have its value updated
   * @param num the value to increment the votes of a candidate by. 
   */
  public void enterVotes(String president, int num) {
    votes.put(president, votes.get(president) + num);
    numUpdates++;
    if(numUpdates % 4 == 0) {
      this.notifyObservers();
    }
  }
  
  /**
   * Method that returns the name of a school doing a poll.
   * @return the name of school
   */
  public String getSchool() {
    return school;
  }
}
