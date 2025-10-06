public class R10_THI05_J {
  public static void main(String[] args) throws Exception {
    Thread t = new Thread(() -> {
      while (!Thread.currentThread().isInterrupted()) { }
    });
    t.start();
    t.interrupt();
    t.join();
  }
}