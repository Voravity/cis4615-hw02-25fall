import java.math.BigInteger;
public class R04_STR03_J {
  public static void main(String[] args){
    BigInteger x = new BigInteger("530500452766");
    byte[] b = x.toByteArray();
    String s = new String(b);
    b = s.getBytes();
    x = new BigInteger(b);
    System.out.println(x);
  }
}