package arrays;
import java.util.Scanner;
public class TwoDTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Enter value for nums[" + i + "][" + j + "]: ");
                nums[i][j] = input.nextInt();
            }
        }
        input.close();
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
