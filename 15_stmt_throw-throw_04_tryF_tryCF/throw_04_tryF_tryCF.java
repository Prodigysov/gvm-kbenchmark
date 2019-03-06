class ExA extends RuntimeException {
  ExA() {
  }
}

public class throw_04_tryF_tryCF {
  public static void main(String[] args) {
    try {
      try {
        if (true) throw new ExA();
        System.out.println("unreachable");
      } finally {
        System.out.println("finally");
      }
      System.out.println("unreachable");
    } catch (ExA e) {
      System.out.println("caught ExA: " + e.toString());
    } finally {
      System.out.println("finally 2");
    }
    System.out.println("Done!");
  }
}
