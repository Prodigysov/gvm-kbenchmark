/*
  - a.B:
    - public call(a.A): calls f(byte) on a.A object
*/

package a;

public class B {

  public void call(A a) {
    System.out.println("Calling from B on argument");
    a.f((byte)0);

    System.out.println();
  }
}
