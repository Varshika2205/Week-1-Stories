import java.util.Scanner;
public class ExpandToString {
    public static void Expand(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            char ch = str.charAt(i);
            //to count numeric value of character
            int count = Character.getNumericValue(str.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        System.out.println("Output: " + result);
    }
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str=scan.nextLine();
    Expand(str);

        

    }
}