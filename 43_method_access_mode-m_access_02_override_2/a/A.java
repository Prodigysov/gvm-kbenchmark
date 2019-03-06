/*
  - a.A:
    - private f11()
    - private f12()
    - private f13()
    - package g21()
    - package g22()
    - package g23()
    - protected h33()
    - public call() - calls all the methods.
*/

package a;

public class A {

  private void f11() {
    System.out.println("A.f11()");
  }

  private void f12() {
    System.out.println("A.f12()");
  }

  private void f13() {
    System.out.println("A.f13()");
  }

  void g21() {
    System.out.println("A.g21()");
  }

  void g22() {
    System.out.println("A.g22()");
  }

  void g23() {
    System.out.println("A.g23()");
  }

  protected void h33() {
    System.out.println("A.h33()");
  }

  public void call() {
    System.out.println("Calling from " + getClass().getName());
    f11();
    f12();
    f13();
    g21();
    g22();
    g23();
    h33();

    System.out.println();
  }
}
