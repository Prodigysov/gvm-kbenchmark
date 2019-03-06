/*
  - a.A:
    - package f(short)
    - protected f(int)
    - public f(long)
    - package g(short)
    - protected final g(int)
    - public g(long)
    - package h(short)
    - final protected h(int)
    - public h(long)
*/

package a;

public class A {

  void f(short a) {
    System.out.println("package A.f(short)");
  }

  protected void f(int a) {
    System.out.println("protected A.f(int)");
  }

  public void f(long a) {
    System.out.println("public A.f(long)");
  }

  void g(short a) {
    System.out.println("package A.g(short)");
  }

  protected final void g(int a) {
    System.out.println("protected final A.g(int)");
  }

  public void g(long a) {
    System.out.println("public A.g(long)");
  }

  void h(short a) {
    System.out.println("package A.h(short)");
  }

  final protected void h(int a) {
    System.out.println("final protected A.h(int)");
  }

  public void h(long a) {
    System.out.println("public A.h(long)");
  }
}
