public class throw_02_try_catch_finally {
  public static void main(String[] args) {
    try {
      if (true) throw new RuntimeException();
      System.out.println("unreachable");
    } catch(RuntimeException e) {
      System.out.println(e.toString());
    } finally {
      System.out.println("finally");
    }
    System.out.println("Done!");
  }
}
