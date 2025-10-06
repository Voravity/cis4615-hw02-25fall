import java.math.BigInteger;
public class R04_STR03_J {
  public static void main(String[] args){
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString();
    byte[] b = s.getBytes();
    String ns = new String(b);
    x = new BigInteger(ns);
    System.out.println(x);
  }
}