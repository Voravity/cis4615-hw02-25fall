import java.io.*;
public class R02_XP00_J {
  static void deleteFile() throws IOException {
    File f = new File("someFileName.txt");
    f.createNewFile();
    f.delete();
  }
  public static void main(String[] args) throws Exception { deleteFile(); }
}