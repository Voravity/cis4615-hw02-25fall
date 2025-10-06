public class R06_MET01_J {
  static int getAbsAdd(int x, int y){
    assert x != Integer.MIN_VALUE;
    assert y != Integer.MIN_VALUE;
    int ax = Math.abs(x);
    int ay = Math.abs(y);
    assert ax <= Integer.MAX_VALUE - ay;
    return ax + ay;
  }
  public static void main(String[] args){ System.out.println(getAbsAdd(1,2)); }
}