/*
  - b.D:
    - public call(a.A): calls f(byte) on a.A object
*/

package b;

import a.*;

public class D {

  public void call(A a) {
    System.out.print("Calling from D on argument:  ");
    a.f((byte)0);
    a.g((byte)0);
    a.h((byte)0);

    System.out.println();
  }
}
