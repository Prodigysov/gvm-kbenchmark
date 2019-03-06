// Testing break inside try/catch inside for. Try/catch should not affect
// break behavior, even if both interact with the same stack.

public class break_04_catch_for {

  public static void main(String[] args) {
    int i;
    for(i=0; i<10; i++) {
      try {
        if (i >= 5) break;
      } catch(RuntimeException ex) {
        System.out.print("never reached");
      }
      System.out.print(i); System.out.print(" ");
    }
    System.out.println();
    System.out.print("final i = "); System.out.println( i);
    System.out.println("Done!");
  }
}

// 0 1 2 3 4
// final i = 5
// Done!
