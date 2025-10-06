import java.util.logging.*;
import java.util.*;
public class R00_IDS03_J {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger("app");
    Scanner sc = new Scanner(System.in);
    String username = sc.nextLine();
    boolean loginSuccessful = username.equals("admin");
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }
  }
}