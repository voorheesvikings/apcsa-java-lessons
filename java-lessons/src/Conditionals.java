import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

            //Basic Booleans
            System.out.println(" Double equals: " + (3 == 2));
            System.out.println("String equivalent: " + "Hello".equals("Helloz"));
            System.out.println("Not equals: " + (7 != 4));
            System.out.println("Greater than: " + (4 > 5));

            System.out.println();

            // if - then statement
            int num = 11;
            System.out.println(num <= 12);
            if (num <= 12) {
                System.out.println("num is less than or equals to 12");
            }

             // if else statement
             if (num <= 5) {
                System.out.println("num is less than or equals to 5");
            } else {
                System.out.println("yay you did it! num is greater than 5");
            }

            // if... else if .... else
            int temperature = 44;
            if (temperature >= 85) {
                System.out.println("It's hot!");
            } else if (temperature >= 60 ){
                 System.out.println("It's nice!");       
            } else if (temperature < 40) {
                System.out.println("It's cold!"); 
            } else {
                System.out.println("ERROR!");
            }

            // Logical 'and' operator: &&

            int age = 17;
            boolean hasPermit = false;

            if (age >= 17 && hasPermit){
                System.out.println("You can drive");
            } else {
                System.out.println("Can't drive yet");
            }

            // Using 'or' ||

            String day = "Taco";

            if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.println("It's the weekend!");
            } else if (day.equals("Monday") || 
                       day.equals("Tuesday") || 
                       day.equals("Wednesday") || 
                       day.equals("Thursday") || 
                       day.equals("Friday") ) {
                System.out.println("It's the weekday");         
            } else {
                System.out.println("That is not a day");
            }

            

            //challenge 1
            String password = "password@123";
            Scanner input = new Scanner(System.in);
            System.out.println("Enter password: ");
            String pass_input = input.nextLine();

            if (pass_input.equals(password)) {
                System.out.println("You have been granted access!");
            } else {
                System.out.println("You have not been granted access!");
            }

            //challenge 2
            System.out.println("Enter number: ");
            double num_in = Integer.parseInt(input.nextLine());
            if (num_in % 2 == 1) {
                System.out.println("The number is odd");
            } else {
                System.out.println("The number is even");
            }

            //challenge 3
            System.out.println("Enter grade (0-100): ");
            double int_grade = Integer.parseInt(input.nextLine());
            if (int_grade >= 90 && int_grade <= 100) {
                System.out.println("A");
            } else if (int_grade >=80 && int_grade <90 ) {
                System.out.println("B");
            } else if (int_grade >=70 && int_grade <80 ) {
                System.out.println("C");
            } else if (int_grade >=60 && int_grade <70 ) {
                System.out.println("D");
            } else if (int_grade >=0 && int_grade <60 ) {
                System.out.println("F");
            } else {
                System.out.println("Enter a valid grade");
            }


            

                
            







    }

    
}
