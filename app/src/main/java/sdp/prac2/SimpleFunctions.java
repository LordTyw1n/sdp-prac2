package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public static boolean Task3(String x){
        int count = 0;
        for (int i = 0; i < x.length(); i++){
            char c = x.charAt(i);   
            if (c == '('){
                count++;
            }else if(c == ')'){
                count--;
            }
            if(count < 0){
                return false; //closing brackets > opening brackets
            }
        }
        return count == 0; // opening brackets = closing brackets
    }
    public SimpleFunctions() {}
}
