/*
  - a.A:
    - f(short)
    - public f(long)
    - final g(short)
    - public g(long)
*/

package a;

public class A {

  void f(short a) {
    System.out.println("package A.f(short)");
  }

  public void f(long a) {
    System.out.println("public A.f(long)");
  }

  final void g(short a) {
    System.out.println("package A.g(short)");
  }

  public void g(long a) {
    System.out.println("public A.g(long)");
  }
}
