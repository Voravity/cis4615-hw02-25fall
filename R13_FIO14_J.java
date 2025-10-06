import java.io.*;
public class R13_FIO14_J {
  public static void main(String[] args) throws Exception {
    File f = File.createTempFile("demo",".tmp");
    try (FileWriter w = new FileWriter(f)) { w.write("data"); }
  }
}