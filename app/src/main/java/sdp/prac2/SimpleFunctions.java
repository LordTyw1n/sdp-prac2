package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    
    // Task 5
    public static <T extends Comparable<T>> boolean isSorted(List<T> list) {
        if (list == null || list.size() <= 1) {
            return true; // An empty list or a list with one element is considered sorted
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false; // If an element is greater than the next one, the list is not sorted
            }
        }
        return true; // All elements are in ascending order
    }

}
