import java.util.Scanner;

public class NumberToWordsConverter {

    // Arrays for number words
    private static final String[] units = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
        "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };

    // Method to convert number to words
    public static String convert(int num) {
        if (num == 0) return "zero";
        if (num < 0 || num > 999) return "Number out of supported range (0–999)";

        StringBuilder words = new StringBuilder();

        if (num >= 100) {
            words.append(units[num / 100]).append(" hundred");
            num %= 100;
            if (num > 0) words.append(" ");
        }

        if (num >= 20) {
            words.append(tens[num / 10]);
            num %= 10;
            if (num > 0) words.append(" ");
        }

        if (num > 0 && num < 20) {
            words.append(units[num]);
        }

        return words.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (0–999): ");
        int input = scanner.nextInt();

        String result = convert(input);
        System.out.println("Output: \"" + result + "\"");
    }
}