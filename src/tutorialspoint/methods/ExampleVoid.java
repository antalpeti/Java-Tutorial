package tutorialspoint.methods;

public class ExampleVoid {

  public static void main(String[] args) {
    methodRankPoints(255.7);
    methodRankPoints(130.2);
    methodRankPoints(99.1);
  }

  public static void methodRankPoints(double points) {
    if (points >= 202.5) {
      System.out.println("Rank:A1");
    } else if (points >= 122.4) {
      System.out.println("Rank:A2");
    } else {
      System.out.println("Rank:A3");
    }
  }
}
