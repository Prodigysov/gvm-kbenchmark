class ExA extends RuntimeException {
  ExA() {
    super();
  }
}

public class throw_10_tryC_throw_F_tryC {
  public static void main(String[] args) {
    try {
      try {
        if (true) throw new ExA();
        System.out.println("unreachable");
      } catch(ExA e) {
        System.out.println("caught: " + e.toString());
        throw new RuntimeException();
      } finally {
        System.out.println("finally");
      }
      System.out.println("unreachable");
    } catch (RuntimeException e) {
      System.out.println("caught 2: " + e.toString());
    }
    System.out.println("Done!");
  }
}
