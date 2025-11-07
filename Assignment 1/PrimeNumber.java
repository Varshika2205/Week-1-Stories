import java.util.Scanner;

public class PrimeNumber {
    public static void  Prime( int num){
            if (num <= 1) {
            System.out.println("The given number is NOT prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("The given number is PRIME");
        else
            System.out.println("The given number is NOT prime");
    }
    public static void main(String[] args) {
        System.out.print("Enter number to check for prime number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Prime(num);
       
    }
}