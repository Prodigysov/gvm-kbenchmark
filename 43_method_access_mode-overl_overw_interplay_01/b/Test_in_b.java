/*
  Performs call: ((A)C).f, ((B)C).f, ((C)C).f , from package b
*/
package b;

import a.*;

public class Test_in_b {

  public Test_in_b() {
    System.out.println("Call: ((A)C).f, ((B)C).f, ((C)C).f , from "+getClass().getName()+":");

    C c = new C();
    ((A)c).f(0);
    ((B)c).f(0);
    ((C)c).f(0);

    System.out.println();
  }
}
