/*
  - class b.C < A:
    - protectedNew: calls new A(byte)
*/

package b;

import a.*;

public class C extends A {

  public C() {}

  public void protectedNew() {
    new A((byte)0);
  }
}
