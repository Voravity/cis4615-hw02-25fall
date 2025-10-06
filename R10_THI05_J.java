public class R10_THI05_J {
  public static void main(String[] args) throws Exception {
    Thread t = new Thread(() -> { for(;;){} });
    t.start();
    t.stop();
  }
}