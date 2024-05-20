package sdp.prac2;
import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public List<Integer> Task4 (List<Integer> a, List<Integer> b) {   
        if (a.size() != b.size()) {   
            return null;
        }

        List<Integer> finalResult = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int product = a.get(i) * b.get(b.size() - 1 - i);
            finalResult.add(product);
        }

        return finalResult;
    }
}
