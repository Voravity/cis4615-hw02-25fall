public class R49_MSC03_J {
  public static void main(String[] args){
    String password = System.getenv("APP_PASSWORD");
    if (password == null) throw new IllegalStateException("set APP_PASSWORD");
    System.out.println(password.length());
  }
}