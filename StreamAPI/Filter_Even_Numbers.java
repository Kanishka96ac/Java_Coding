// Problem: Given a list of integers, return a list containing only even numbers.

package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Filter_Even_Numbers {
    // public List filterEvenNums(){
    //     List<Integer> evenNums = new List<>();
    // }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenNums = numbers.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println(evenNums);
    }
    
}
