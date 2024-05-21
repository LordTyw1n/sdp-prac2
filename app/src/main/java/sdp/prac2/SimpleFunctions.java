package sdp.prac2;
import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static List<Integer> tasksix(List<Integer> numbers){   //method name "tasksix"
        List<Integer> roundednum = new ArrayList<>();     //A new arraylist is created
        for (int num : numbers) {          //for loop goes through each number in provided integer list called "numbers"
            roundednum.add(roundUp(num,100));  //this adds each new number that has been added to the new list
        }
        return roundednum;
    }

    private static int roundUp(int num, int divisor){
        int remainder = num % divisor;

        int roundedUp;     //new int variable
        if (remainder > 0) {
            roundedUp = num + (divisor - remainder) ;   //rounds up num to the highest multiple of divisor ex. roundednum = 213 + (100 - 13), roundednum = 300 which is divisible by 100
        }else{
            roundedUp = num;  //if number is divisble, 
        }
        return roundedUp;
    }

    
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

    public List<Integer> Task4(List<Integer> a, List<Integer> b) {   
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

