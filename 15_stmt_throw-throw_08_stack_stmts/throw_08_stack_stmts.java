public class throw_08_stack_stmts {
  public static void main(String[] args) {
    for(int i=0; i<5; i++) {
      try {
        switch(i) {
          case 0:
          while(true) {
            throw new RuntimeException("while");
          }
          case 1:
          do {
            throw new RuntimeException("do-while");
          } while(true);
          case 2:
          for(;;) {
            throw new RuntimeException("for");
          }
          case 3:
            throw new RuntimeException("switch");
          case 4:
            label: throw new RuntimeException("label");
          default:
          System.out.println("unreachable");
        }
      } catch(RuntimeException e) {
        System.out.println(e.toString());
      }
    }
    System.out.println("Done!");
  }
}
