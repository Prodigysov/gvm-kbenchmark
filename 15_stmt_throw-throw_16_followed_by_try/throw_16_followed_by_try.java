//throw statement immediately followed by an unrelated try/catch
//- to expose a temporary error during refactoring
public class throw_16_followed_by_try {
  public static void main(String[] args) {
    try {
      if (true) throw new RuntimeException();
      System.out.println("unreachable");
      try {
        System.out.println("unreachable try 2");
      } catch(RuntimeException e) {
        System.out.println("unreachable catch 1");
      } finally {
        System.out.println("unreachable finally");
      }
    } catch(RuntimeException e) {
      System.out.println(e.toString());
    }
    System.out.println("Done!");
  }
}
