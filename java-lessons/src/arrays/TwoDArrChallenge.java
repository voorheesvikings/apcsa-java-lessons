package arrays;

import java.util.Random;

public class TwoDArrChallenge {
    public static void main(String[] args) {
        Random random = new Random();
        int x_count = 0;
        int o_count = 0;
        char[][] tictactoe = new char[3][3];
        for (int i = 0; i < tictactoe.length; i++) {
            for (int j = 0; j < tictactoe[i].length; j++) {


                if (random.nextBoolean()) {
                    if (x_count > 4) {
                        tictactoe[i][j] = 'O';
                        o_count++;
                        continue;
                    } else {
                        tictactoe[i][j] = 'X';
                        x_count++;
                    }
                } else {
                    if (o_count >= x_count) {
                        tictactoe[i][j] = 'X';
                        x_count++;
                        continue;
                    } else {
                        tictactoe[i][j] = 'O';
                        o_count++;
                    }
                    
                }

                if (j == 2 && tictactoe[i][j] == tictactoe[i][j-1] && tictactoe[i][j] == tictactoe[i][j-2]) {
                    System.out.println("Winner in row " + (i + 1));
                    break;
                }

            }
            if (i == 2) { 
                for (int j = 0; j < 3; j++) {
                    if (tictactoe[0][j] == tictactoe[1][j] && tictactoe[1][j] == tictactoe[2][j]) {
                        System.out.println("Winner in column " + (j + 1));
                    }
                }
            }
            if (tictactoe[0][0] == tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][2]) {
                System.out.println("Winner on diagonal (top-left to bottom-right)");
            }
            if (tictactoe[0][2] == tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][0]) {
                System.out.println("Winner on diagonal (top-right to bottom-left)");
            }

        }
        for (int i = 0; i < tictactoe.length; i++) {
            for (int j = 0; j < tictactoe[i].length; j++) {
                System.out.print(tictactoe[i][j] + " ");
            }
            System.out.println();
        }
    }
}
