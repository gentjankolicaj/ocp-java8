package ocp.java8.concurrent;

public class Sample5 {

  private static Sample5 instance;
  private int tickets;

  private Sample5() {
    super();
  }

  public static synchronized Sample5 getInstance() {
    if (instance == null) {
      instance = new Sample5();
    }
    return instance;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public int getTicketCount() {
    return tickets;
  }

  public void makeTicketAvailable(int value) {
    tickets += value;
  }

  public void sellTickets(int value) {
    synchronized (this) {
      tickets -= value;
    }
  }

}
