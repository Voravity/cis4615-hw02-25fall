import java.util.logging.*;
import java.util.*;
import java.util.regex.Pattern;
public class R00_IDS03_J {
  static String sanitizeUser(String u){ return Pattern.matches("[A-Za-z0-9 ]+", u) ? u : "unauthorized user"; }
  public static void main(String[] args){
    Logger logger = Logger.getLogger("app");
    Scanner sc = new Scanner(System.in);
    String username = sc.nextLine();
    boolean loginSuccessful = username.equals("admin");
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
  }
}