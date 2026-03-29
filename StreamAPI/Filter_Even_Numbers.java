// Problem: Given a list of integers, return a list containing only even numbers.
// Explanation: The filter method is used to apply a condition that keeps only even numbers. The collect method gathers the results into a new list.

package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Filter_Even_Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenNums = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(evenNums);
    }
    
}
