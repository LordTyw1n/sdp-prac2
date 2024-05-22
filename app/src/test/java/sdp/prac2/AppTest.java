/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AppTest {
    

    @Test 
    public void testTask6(){
        List<Integer> x = List.of(101,303,404,202,505);
        List<Integer> result = List.of(200 ,400 , 500 , 300 , 600);
        assertEquals(result , SimpleFunctions.tasksix(x) , "Make sure function rounds up correctly");

    }

    @Test 
    public void testTask6_2(){
        List<Integer> x = List.of(100 , 200 , 300 ,576);
        List<Integer> result = List.of(100 , 200 , 300 , 600);
        assertEquals(result , SimpleFunctions.tasksix(x) , "If a number is already a multiple it does not rounding");
    }
    @Test
    public void Task4_EqualSizeLists_CorrectResult() {
        // Arrange
        SimpleFunctions sf = new SimpleFunctions();
        List<Integer> a = Arrays.asList(1, 2, 3, 4);
        List<Integer> b = Arrays.asList(5, 6, 7, 8);
        List<Integer> expected = Arrays.asList(8, 14, 18, 20);
        
        // Act
        List<Integer> result = sf.Task4(a, b);

        // Assert
        assertIterableEquals(expected, result);
    }

    @Test
    public void Task4_DifferentSizeLists() {
        // Arrange
        SimpleFunctions sf = new SimpleFunctions();
        List<Integer> a = Arrays.asList(1, 2, 3, 4);
        List<Integer> b = Arrays.asList(5, 6, 7);

        // Act
        List<Integer> result = sf.Task4(a, b);

        // Assert
        assertNull(result);
    }
}
