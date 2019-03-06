/*
  - b.D:
    - public call(a.A): calls f(byte) on a.A object
*/

package b;

import a.*;

public class D {

  public void call(A a) {
    System.out.println("Calling from D on argument A");
    a.f((byte)0);

    System.out.println();
  }

  public void call(C c) {
    System.out.println("Calling from D on argument C");
    c.f((byte)0);

    System.out.println();
  }
}
