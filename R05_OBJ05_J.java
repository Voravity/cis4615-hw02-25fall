public class R05_OBJ05_J {
  private int[] data = {1,2,3};
  public int[] getData(){ return data.clone(); }
  public static void main(String[] a){ R05_OBJ05_J x=new R05_OBJ05_J(); int[] d=x.getData(); d[0]=99; System.out.println(x.getData()[0]); }
}