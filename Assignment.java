import java.util.*;

public class Assignment  {

    // Task 1
    public static int farthestCity(int[] arr, int initial) {
        for (int i = 0; i < arr.length; i++) {
            initial -= arr[i];
            if (initial < 0) {
                return i;
            }
        }
        return arr.length - 1;
    }

    // Task 2
    public static void equality(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int prefixSum = 0, suffixSum = 0;
            for (int j = 0; j < i; j++) prefixSum += arr[j];
            for (int s = i + 1; s < n; s++) suffixSum += arr[s];
            if (prefixSum == suffixSum) {
                System.out.println("Equal prefix and suffix sum at index: " + i);
                return;
            }
        }
        System.out.println("Prefix and suffix are not equal at any index.");
    }

    // Task 3
    public static void switchBinary(int[] arr) {
        int count0 = 0, count1 = 0;
        for (int num : arr) {
            if (num == 0) count0++;
            else count1++;
        }
        System.out.println("Minimum flips needed: " + Math.min(count0, count1));
    }

    // Task 4
    public static void findUniqueElements(int[] arr) {
        boolean found = false;
        System.out.print("Unique element(s): ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if (!found) System.out.println("No unique element found");
        else System.out.println();
    }

    // Task 5
    public static void findPairs(int[] arr, int targetSum) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No pairs found with the given sum.");
    }

    // Task 6
    public static void timeCost(int[] arr) {
        Arrays.sort(arr);
        int time = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            time += arr[i];
        }
        System.out.println("Total time cost: " + time);
    }

    // Input method
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option from 0-6 0 for exit:");
        int option =-1;

        while(option!=0){

                System.out.println("\nChoose an option from 0-6 (0 to exit):");
                System.out.println("1. Farthest City");
                System.out.println("2. Equality Check");
                System.out.println("3. Switch Binary");
                System.out.println("4. Find Unique Elements");
                System.out.println("5. Find Pairs with Target Sum");
                System.out.println("6. Time Cost");
                System.out.print("Enter your choice: ");
                option = sc.nextInt();

                switch (option) {
                case 0:
                    System.out.println("Exiting program.");
                    break;

                case 1:
                    arr = input();
                    System.out.print("Enter initial energy: ");
                    int initial = sc.nextInt();
                    System.out.println("Farthest city index: " + farthestCity(arr, initial));
                    break;
                case 2:
                    equality(input());
                    break;
                case 3:
                    System.out.println("enter 0 or 1 only:");
                    switchBinary(input());
                    break;
                case 4:
                    findUniqueElements(input());
                    break;
                case 5:
                    arr = input();
                    System.out.print("Enter target sum: ");
                    int target = sc.nextInt();
                    findPairs(arr, target);
                    break;
                case 6:
                    timeCost(input());
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

    }
}