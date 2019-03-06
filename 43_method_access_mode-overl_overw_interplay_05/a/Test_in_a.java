/*
  Performs call: ((A)C).f, ((B)C).f, ((C)C).f , from package a
*/
package a;

import b.*;

public class Test_in_a {

  public Test_in_a() {
    System.out.println("Call: ((A)C).f, ((B)C).f, ((C)C).f , from "+getClass().getName()+":");

    C c = new C();
    ((A)c).f((short)0);
    ((B)c).f((short)0);
    ((C)c).f((short)0);

    System.out.println();
  }
}
