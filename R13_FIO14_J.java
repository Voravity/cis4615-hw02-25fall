import java.io.*;
public class R13_FIO14_J {
  public static void main(String[] args) throws Exception {
    File f = File.createTempFile("demo",".tmp");
    Runtime.getRuntime().addShutdownHook(new Thread(() -> { if (f.exists()) f.delete(); }));
    try (FileWriter w = new FileWriter(f)) { w.write("data"); }
  }
}
