package arrays;
import java.util.Scanner;
import java.lang.String;

public class computeAvg {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / 10;
        System.out.println("The average is: " + average);
        scanner.close();
        
    }
}
