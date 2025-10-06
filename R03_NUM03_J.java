import java.io.*;
public class R03_NUM03_J {
  static long getInteger(DataInputStream is) throws IOException { return is.readInt() & 0xFFFFFFFFL; }
  public static void main(String[] args) throws Exception {
    byte[] bytes = {(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF};
    DataInputStream dis = new DataInputStream(new ByteArrayInputStream(bytes));
    System.out.println(getInteger(dis));
  }
}