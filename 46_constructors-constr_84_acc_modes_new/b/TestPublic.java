/*
  - class b.TestPublic:
    - method publicNew: calls new A(byte)
*/

package b;

import a.*;

public class TestPublic {

  public void publicNew() {
    new A((byte)0);
  }
}
