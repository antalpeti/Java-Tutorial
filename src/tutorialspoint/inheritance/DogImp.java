package tutorialspoint.inheritance;

public class DogImp extends MammalImp {
  public static void main(String args[]) {

    MammalImp m = new MammalImp();
    DogImp d = new DogImp();

    System.out.println(m instanceof AnimalImp);
    System.out.println(d instanceof MammalImp);
    System.out.println(d instanceof AnimalImp);
  }
}
