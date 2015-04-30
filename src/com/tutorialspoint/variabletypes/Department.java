package com.tutorialspoint.variabletypes;

public class Department {
  // salary variable is a private static variable
  private static double salary;

  // DEPARTMENT is a constant
  public static final String DEPARTMENT = "Development ";

  public Department() {
    salary = 1200;
  }

  public static void main(String args[]) {
    System.out.println(DEPARTMENT + "average salary:" + salary);
    salary = 1000;
    System.out.println(DEPARTMENT + "average salary:" + salary);
    @SuppressWarnings("unused")
    Department d = new Department();
    System.out.println(DEPARTMENT + "average salary:" + salary);
  }
}
