/*
  - a.A:
    -call(A a): calls a.f(), a.g()
*/

package a;

public class B {

  public void call(A a) {
    System.out.println("Calling from package a:");
    a.f((byte)0);
    a.g((byte)0);
    System.out.println();
  }
}
