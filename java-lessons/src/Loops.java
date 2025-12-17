import java.util.Random;
import java.util.Scanner;

public class Loops {
    

    public static void main(String[] args) {



        // break stops the loop
        // continue skips the iteration
        // return stops the program 
        // for (int i = 0; i < 5; i += 1) {
        //     for (int j = 0; j < 5; j++) {
                
        //             System.out.print(j);
                

        //     }
        //     System.out.print('\n');
        // }

        // while loop
        // while (true) {
        //     System.out.println("True");
        // }

         // for (int i = 0; i < 5; i++)
        // int i = 0;
        // while (i < 5) {
        //     i++;
        // }

        //boolean loop
        // boolean isContinuing = true;

        // int j = 0;

        // while (isContinuing) {
        //     j++;

        //     if (j == 20) {
        //         isContinuing = false;
        //     }
        // }


        //challenge 1
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Foobar");
            } else if (i % 3 == 0) {
                System.out.println("Foo");
            } else if (i % 5 == 0) {
                System.out.println("bar");
            }
        }
        // Print out a multiplication table from 1 -12
        // HINT: use nested for-loops to create rows/columns
        // 1 2 3 ..
        // 2 4 6..
        // 3 6 9...
        //challenge 2

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print((i*j) + " ");
            }
            System.out.print("\n");
        }

        // Design a guessing game between 3 numbers.
        // if you guess the number correctly then you win
        // if not then keep playing the game.
        // Example: answer is 2
        // input: 1 -> "wrong answer"
        // input: 2 -> "correct answer"

        //challenge 3
        Scanner input = new Scanner(System.in);
        boolean answer = true;
        Random rand = new Random();
        int randomNum = rand.nextInt();
        while (answer) {
            System.out.println("Give a guess: ");

            int guess = Integer.parseInt(input.nextLine());
            if (guess == randomNum) {
                answer = false;
            } else {
                System.out.println("Guess again");
            }

        }

        input.close();
    }

     



    
}
