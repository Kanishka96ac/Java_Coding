// Problem: Convert all strings in a list to uppercase.

// Explanation: The map function applies String::toUpperCase to each element, transforming them to uppercase.

package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names_to_Uppercase {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> uppercaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(uppercaseNames);
    }
}
