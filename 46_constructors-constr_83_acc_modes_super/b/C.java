/*
- class b.C < A. Instantiate with super(byte).
*/

package b;

import a.*;

public class C extends A {

  public C() {
    super((byte)0);
    System.out.println("C.C()");
  }
}
