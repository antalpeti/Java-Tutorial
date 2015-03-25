package tutorialspoint.inheritance;

public class DogExt extends MammalExt {
  public static void main(String args[]) {

    AnimalExt a = new AnimalExt();
    MammalExt m = new MammalExt();
    DogExt d = new DogExt();

    System.out.println(m instanceof AnimalExt);
    System.out.println(d instanceof MammalExt);
    System.out.println(d instanceof AnimalExt);
  }
}
