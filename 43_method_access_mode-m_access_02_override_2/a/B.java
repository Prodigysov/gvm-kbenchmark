/*
  - a.B < A:
    - private f11()
    - package f12()
    - protected f13()
    - package g22()
    - protected g23()
    - protected h33()
*/

package a;

public class B extends A {

  private void f11() {
    System.out.println("B.f11()");
  }

  void f12() {
    System.out.println("B.f12()");
  }

  protected void f13() {
    System.out.println("B.f13()");
  }

  void g22() {
    System.out.println("B.g22()");
  }

  protected void g23() {
    System.out.println("B.g23()");
  }

  protected void h33() {
    System.out.println("B.h33()");
  }
}
