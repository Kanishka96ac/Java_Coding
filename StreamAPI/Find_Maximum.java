// Problem: Find the maximum value in a list of integers.
// Explanation: The max method takes a comparator and returns the maximum element wrapped in an Optional.

package StreamAPI;

import java.util.*;

public class Find_Maximum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> max = nums.stream().max(Integer::compare);
        System.out.println(max.orElse(0));
    }
}
