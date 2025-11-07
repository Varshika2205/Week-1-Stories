import java.util.Scanner;

public class LongestSubString {
    public static String longestUniqueSubstring(String s) {
        int left = 0, maxLength = 0, startIndex = 0;

        for (int right = 0; right < s.length(); right++) {
            // Check for duplicate between left and right
            for (int i = left; i < right; i++) {
                if (s.charAt(i) == s.charAt(right)) {
                    left = i + 1; // Move left past the duplicate
                    break;
                }
            }

            // Update maxLength and startIndex if needed
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String longestSubstring = longestUniqueSubstring(input);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        System.out.println("Length: " + longestSubstring.length());
    }
}