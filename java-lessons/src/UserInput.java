import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // System.out.println("Enter your name");
        // String name = input.nextLine();
        // System.out.println(name);

        // System.out.println("Enter your age");
        // String age = input.nextLine();

        // int ageConverted = Integer.parseInt(age);
        // System.out.println("Next year " + name + " will be: " + (ageConverted + 1));

        // System.out.println("What is your height in meters?");
        // double height = Double.parseDouble(input.nextLine());
        // System.out.println("You are " + height + " meters tall.");

        //challenge 1

        // System.out.println("Enter a number");
        // String number1 = input.nextLine();
        // System.out.println("Enter another number");
        // String number2 = input.nextLine();
        // System.out.println("Enter a word:");
        // String word1 = input.nextLine();
        // System.out.println("Enter another word:");
        // String word2 = input.nextLine();

        // if (Integer.parseInt(number1) + Integer.parseInt(number2) > 100) {
        //     System.out.println("Your numbers are greater than a hundred");
        // } else {
        //     System.out.println(word1 + word2 + (Integer.parseInt(number1) + Integer.parseInt(number2)) + "@gmail.com");
        // }

        //challenge 2
        System.out.println("Enter two numbers");
        System.out.println("Enter number 1:");
        String num1 = input.nextLine();
        System.out.println("Enter number 1:");
        String num2 = input.nextLine();

        System.out.println(Double.parseDouble(num1)/Double.parseDouble(num2));

    }
}

