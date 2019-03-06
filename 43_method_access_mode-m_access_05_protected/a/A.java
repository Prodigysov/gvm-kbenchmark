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

  protected void f(int a) {
    System.out.println("protected A.f(int)");
  }

  public void f(long a) {
    System.out.println("public A.f(long)");
  }
}
