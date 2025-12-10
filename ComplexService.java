import java.util.List;

public class ComplexService {

    // This method is designed to look "risky" to the AI
    public void processUserData(String[] data) {
        // High nesting depth and multiple control structures
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                try {
                    // Potential IndexOutOfBounds or NullPointer risk here
                    if (data[i].length() > 5) {
                        for (int j = 0; j < 10; j++) {
                            System.out.println(data[i].substring(0, 10)); 
                        }
                    }
                } catch (Exception e) {
                    // Empty catch block - This is a bad practice Checkstyle will catch
                }
            }
        }
    }
        }
    }
}
