import java.util.List;

public class ComplexService {

    // This method is designed to look "risky" to the AI
    public void processData(List<String> inputs) {
        // High cyclomatic complexity (nested loops and ifs)
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i) != null) {
                for (int j = 0; j < 10; j++) {
                    if (j > 5) {
                        try {
                            System.out.println(inputs.get(i).substring(0, 5));
                        } catch (Exception e) {
                            // Empty catch block - Checkstyle will hate this
                        }
                    }
                }
            }
        }
    }
}
