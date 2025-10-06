import java.io.*;
public class R07_ERR00_J {
  public static void main(String[] args){
    try (BufferedReader r = new BufferedReader(new FileReader("missing.txt"))) { r.readLine(); }
    catch (IOException e) { }
  }
}