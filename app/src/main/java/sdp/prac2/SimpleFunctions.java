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

}

