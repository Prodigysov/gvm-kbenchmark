/*
  - b.C < A:
    - public f()
    - public g()
    - public h()
    - public k()
*/

package b;

import a.*;

public class C extends A {

  public void f() {
    System.out.println("C.f()");
  }

  public void g() {
    System.out.println("C.g()");
  }

  public void h() {
    System.out.println("C.h()");
  }

  public void k() {
    System.out.println("C.k()");
  }
}
