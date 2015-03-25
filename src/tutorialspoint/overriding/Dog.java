package tutorialspoint.overriding;

class Dog extends Animal {

  @Override
  public void move() {
    super.move();
    System.out.println("Dogs can walk and run");
  }

  public void bark() {
    System.out.println("Dogs can bark");
  }

  @Override
  public B calucalte() {
    return new B();
  }

  @Override
  public void restrict() {
    super.restrict();
  }
}
