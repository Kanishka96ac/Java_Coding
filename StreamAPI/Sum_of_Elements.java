// Problem: Calculate the sum of elements in a list of integers.

package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Sum_of_Elements {
    public static void main(String[] args) {
        List<Integer>  nums = Arrays.asList(1,2,3,4,5,6,7,8);
        
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
