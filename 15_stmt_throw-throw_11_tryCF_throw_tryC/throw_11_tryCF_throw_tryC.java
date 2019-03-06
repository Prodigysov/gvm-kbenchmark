class ExA extends RuntimeException {
  ExA() {
    super();
  }
}

class ExB extends RuntimeException {
  ExB() {}
}

public class throw_11_tryCF_throw_tryC {
  public static void main(String[] args) {
    try {
      try {
        if (true) throw new RuntimeException();
        System.out.println("unreachable");
      } catch(ExA e) {
        System.out.print("caught: "); System.out.println( e.toString());
      } finally {
        System.out.println("finally");
        if (true) throw new ExB();
      }
      System.out.println("unreachable");
    } catch (RuntimeException e) {
      System.out.print("caught 2: "); System.out.println( e.toString());
    }
    System.out.println("Done!");
  }
}
