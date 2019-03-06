/*
  - a.A:
    - private f(short)
    - package f(byte)
    - protected f(int)
    - public f(long)

    - private g(short)
    - package g(int)
    - protected g(byte)
    - public g(long)

    - private h(short)
    - package h(int)
    - protected h(long)
    - public h(byte)

    - public call(a.A): calls f(byte), g(byte), h(byte) on a.A object
    - public call(): calls f(byte), g(byte), h(byte) locally
*/

package a;

public class A {

  private void f(short a) {
    System.out.print("private A.f(short)  ");
  }

  void f(byte a) {
    System.out.print("package A.f(byte)   ");
  }

  protected void f(int a) {
    System.out.print("protected A.f(int)  ");
  }

  public void f(long a) {
    System.out.print("public A.f(long)    ");
  }


  private void g(short a) {
    System.out.print("private A.g(short)  ");
  }

  void g(int a) {
    System.out.print("package A.g(int)    ");
  }

  protected void g(byte a) {
    System.out.print("protected A.g(byte) ");
  }

  public void g(long a) {
    System.out.print("public A.g(long)    ");
  }


  private void h(short a) {
    System.out.print("private A.h(short)  ");
  }

  void h(int a) {
    System.out.print("package A.h(int)    ");
  }

  protected void h(long a) {
    System.out.print("protected A.h(long) ");
  }

  public void h(byte a) {
    System.out.print("public A.h(byte)    ");
  }

  public void call(A a) {
    System.out.print("Calling from A on argument:  ");
    a.f((byte)0);
    a.g((byte)0);
    a.h((byte)0);

    System.out.println();
  }

  public void call() {
    System.out.print("Calling from A locally:      ");
    f((byte)0);
    g((byte)0);
    h((byte)0);

    System.out.println();
  }
}
