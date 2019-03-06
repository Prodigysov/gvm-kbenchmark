/*
  - a.A:
    - private f()
    - package g()
    - protected h()
    - public k()
    - public call() - calls all four other methods.
*/

package a;

public class A {

  private void f() {
    System.out.println("A.f()");
  }

  void g() {
    System.out.println("A.g()");
  }

  protected void h() {
    System.out.println("A.h()");
  }

  public void k() {
    System.out.println("A.k()");
  }

  public void call() {
    System.out.println("Calling from " + getClass().getName());
    f();
    g();
    h();
    k();
    System.out.println();
  }
}
