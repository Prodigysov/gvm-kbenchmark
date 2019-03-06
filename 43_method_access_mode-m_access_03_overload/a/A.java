/*
  - a.A:
    - private f(byte)
    - package f(short)
    - protected f(int)
    - public f(long)
    - public call(a.A): calls f(byte) on a.A object
    - public call(): calls f(byte) locally
*/

package a;

public class A {

  private void f(byte a) {
    System.out.println("private A.f(byte)");
  }

  void f(short a) {
    System.out.println("package A.f(short)");
  }

  protected void f(int a) {
    System.out.println("protected A.f(int)");
  }

  public void f(long a) {
    System.out.println("public A.f(long)");
  }

  public void call(A a) {
    System.out.println("Calling from A on argument");
    a.f((byte)0);

    System.out.println();
  }

  public void call() {
    System.out.println("Calling from A locally");
    f((byte)0);

    System.out.println();
  }
}
