/*
  - b.C < A:
    - private f11()
    - package f12()
    - protected f13()
    - private g21()
    - package g22()
    - protected g23()
    - protected h33()
*/

package b;

import a.*;

public class C extends A {

  private void f11() {
    System.out.println("C.f11()");
  }

  void f12() {
    System.out.println("C.f12()");
  }

  protected void f13() {
    System.out.println("C.f13()");
  }

  private void g21() {
    System.out.println("C.g21()");
  }

  void g22() {
    System.out.println("C.g22()");
  }

  protected void g23() {
    System.out.println("C.g23()");
  }

  protected void h33() {
    System.out.println("C.h33()");
  }
}
