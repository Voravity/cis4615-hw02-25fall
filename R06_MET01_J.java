public class R06_MET01_J {
  static int getAbsAdd(int x, int y){
    if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) throw new IllegalArgumentException();
    int ax = Math.abs(x);
    int ay = Math.abs(y);
    if (ax > Integer.MAX_VALUE - ay) throw new IllegalArgumentException();
    return ax + ay;
  }
  public static void main(String[] args){ System.out.println(getAbsAdd(1,2)); }
}