package tutorialspoint.polymorphism;

public class Deer extends Animal implements Vegetarian {
  public static void main(String[] args) {
    final Deer d = new Deer();
    Animal a = d;
    Vegetarian v = d;
    Object o = d;
    final Animal a1 = new Animal();
    // a1 = new Deer(); //compile time error
  }
}
