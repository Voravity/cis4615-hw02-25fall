import java.io.*;
public class R02_XP00_J {
  static void deleteFile() throws IOException {
    File f = new File("someFileName.txt");
    if (!f.exists()) f.createNewFile();
    if (!f.delete()) throw new IOException("delete failed");
  }
  public static void main(String[] args) throws Exception { deleteFile(); }
}