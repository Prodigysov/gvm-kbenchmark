public class throw_09_try_rethrow_try {
  public static void main(String[] args) {
    try {
      try {
        if (true) throw new RuntimeException();
        System.out.println("unreachable");
      } catch(RuntimeException e) {
        System.out.println("rethrowing: " + e.toString());
        throw e;
      }
      System.out.println("unreachable");
    } catch (RuntimeException e) {
      System.out.println("caught again: " + e.toString());
    }
    System.out.println("Done!");
  }
}
