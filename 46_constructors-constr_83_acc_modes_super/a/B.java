/*
- class a.B < A. Instantiate with super(byte).
*/

package a;

public class B extends A {

  public B() {
    super((byte)0);
    System.out.println("B.B()");
  }
}
