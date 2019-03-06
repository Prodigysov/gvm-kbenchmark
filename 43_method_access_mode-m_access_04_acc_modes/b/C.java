/*
  - b.C < A:
    - public call(a.A): calls f(byte) on a.A object
    - public call(): calls f(byte) locally
*/

package b;

import a.*;

public class C extends A {

  public void call(A a) {
    System.out.print("Calling from C on argument:  ");
    a.f((byte)0);
    a.g((byte)0);
    a.h((byte)0);

    System.out.println();
  }

  public void call() {
    System.out.print("Calling from C locally:      ");
    f((byte)0);
    g((byte)0);
    h((byte)0);

    System.out.println();
  }
}
