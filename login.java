import java.util.Map;

public class LoginService {
    public boolean login(String username, String password, Map<String, String> userDatabase) {
        if (username == null || username.isEmpty() || password == null) {
            return false;
        }

        for (Map.Entry<String, String> entry : userDatabase.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(username) && entry.getValue().equals(password)) {
                // Found user and password matches
                if (username.equals("admin")) {
                    System.out.println("Admin login successful.");
                }
                return true; // Login successful
            }
        }

        return false; // User not found or password incorrect
    }
}
