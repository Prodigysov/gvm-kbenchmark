/*
  - class a.A with constructors:
    - public A(): calls this(byte)
    - private A(byte)
    - package A(short)
    - protected A(int)
    - public A(long)
*/

package a;

public class A {

  public A() {
    this((byte)0);
    System.out.println("A.A()");
  }

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
}
