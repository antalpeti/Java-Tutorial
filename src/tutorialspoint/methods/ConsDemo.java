package tutorialspoint.methods;

public class ConsDemo {

  public static void main(String args[]) {
    MyClass t1 = new MyClass();
    MyClass t2 = new MyClass();
    System.out.println(t1.x + " " + t2.x);

    MyClass t3 = new MyClass(10);
    MyClass t4 = new MyClass(20);
    System.out.println(t3.x + " " + t4.x);
  }
}
