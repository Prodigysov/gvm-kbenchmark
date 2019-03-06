/*
  - class a.A with:
    - public A()
    - private A(byte)
    - package A(short)
    - protected A(int)
    - public A(long)
    - privateNew - calls new A(byte)
*/

package a;

public class A {

  public A() {}

  private A(byte a) {
    System.out.println("A.A(byte)");
  }

  A(short a) {
    System.out.println("A.A(short)");
  }

  protected A(int a) {
    System.out.println("A.A(int)");
  }

  public A(long a) {
    System.out.println("A.A(long)");
  }

  public void privateNew() {
    new A((byte)0);
  }
}
