package arrays;

public class TwoDPractice {
    public static void main(String[] args) {
        // Practice 1, Problem 2
        // It prints out the contents of the 2D array in a matrix format

        //Practice 1, Problem 3
        //It prints out 2, which is the 3rd element of the second array

        // Practice 2, Problem 4
        // 0 3 6
        // 1 4 7 

        // Practice 2, Problem 5
        // 7 14 11 11 5

        // Practice 2, Problem 6
        // 3 3 3
        // 4 4 4

        // Practice 2, Problem 7
        // 3 3 3
        // 7 6 5

        //Practice 4, Problem 1
        double[] winners = new double[18];

        //Practice 4, Problem 2

        //initialize array with first 8 prime numbers
        int[] first_array = {2, 3, 5, 7, 11, 13, 17, 19};

        //Practice 4, Problem 3
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = 2 * i;
        }

        //Practice 4, Problem 4
        int[][] maze = new int[30][40];

        //Practice 4, Problem 5
        int[][] data = new int[16][32];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 32; j++) {
                System.out.print(data[i][j] + " "); 
            }
            System.out.println();
        }
        //Practice 4, Problem 6
        //231
        //221
        //023
        //104

        //Practice 4, Problem 7
        //0

        //Practice 4, Problem 8
        //1286864
    }
}
