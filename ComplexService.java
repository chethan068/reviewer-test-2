import java.util.List;
import java.util.ArrayList;

public class UserManager {

    // FORCE_RISK
    // This comment guarantees your bot flags this file as HIGH RISK for the demo.

    public void processUserBatch(List<String> users, int retryCount) {
        if (users != null && !users.isEmpty()) {
            for (int i = 0; i < users.size(); i++) {
                String user = users.get(i);
                // Deeply nested logic increases complexity score
                if (user.startsWith("admin")) {
                    for (int j = 0; j < retryCount; j++) {
                        try {
                            if (user.length() > 50) {
                                // Potential bug: Substring might be out of bounds
                                System.out.println("Processing: " + user.substring(0, 100));
                            }
                        } catch (Exception e) {
                            // Critical Code Smell: Empty catch block silently ignores errors
                        }
                    }
                } else {
                    // Bad practice: Using '==' for string comparison instead of .equals()
                    if (user == "guest") {
                        System.out.println("Guest access");
                    }
                }
            }
        }
    }
}
