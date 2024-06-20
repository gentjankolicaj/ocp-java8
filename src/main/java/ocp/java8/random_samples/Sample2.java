package ocp.java8.random_samples;

class Game {

  public Game() {
  }

  public void play() throws Exception {
    System.out.println("Playing a game");
  }

  void display() throws RuntimeException {
    System.out.println("Displaying at a game");

  }
}

class Soccer extends Game {

  public Soccer() {
  }

  public void play() {
    System.out.println("Playing soccer.");
  }

  void display() {
    System.out.println("Displaying at soccer");
  }
}

public class Sample2 {

  public static void main(String[] args) {

    Game game = new Soccer();
    try {
      game.play();
    } catch (Exception e) {
      e.printStackTrace();
    }
    game.display();

    Soccer soccer = new Soccer();
    soccer.play();
    soccer.display();

  }

}
