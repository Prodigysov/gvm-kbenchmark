public class throw_01_try_catch {
  public static void main(String[] args) {
    try {
      if (true) throw new RuntimeException();
      System.out.println("unreachable");
    } catch(RuntimeException e) {
      System.out.println(e.toString());
    }
    System.out.println("Done!");
  }
}
