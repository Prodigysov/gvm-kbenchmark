/*
  - class a.B < A:
    - packageProtectedNew: calls new A(byte)
*/

package a;

public class B extends A {

  public B() {}

  public void packageProtectedNew() {
    new A((byte)0);
  }
}
