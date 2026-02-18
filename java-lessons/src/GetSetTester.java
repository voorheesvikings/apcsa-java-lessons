import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();
        GetSet player3 = new GetSet();

        System.out.println(player1.getUsername());
        player1.setUsername("pineappleghost333"); 
        player1.setID(12345);
        player1.setRank("Hacker");
        System.out.println(player1.getUsername()); 
        System.out.println(player1.getID());
        System.out.println(player1.getRank());

        System.out.println(player2.getUsername()); 
        player2.setUsername("ironmouse6741"); 
        player2.setID(54321);
        player2.setRank("Noob");
        System.out.println(player2.getUsername());
        System.out.println(player2.getID());
        System.out.println(player2.getRank());

        System.out.print("Enter a username: ");
        String userInput = input.nextLine();
        player3.setUsername(userInput);
        

        System.out.print("Enter user ID: ");
        int userID = Integer.parseInt(input.nextLine());
        player3.setID(userID);

        System.out.print("Enter a rank: ");
        String userRank = input.nextLine();
        player3.setRank(userRank);

        System.out.println("username: " + player3.getUsername());
        System.out.println("playerID: " + player3.getID());
        System.out.println("Player rank: " + player3.getRank());

        System.out.println("The Battle Begins...");
        System.out.println("Would you like to battle " + player1.getUsername() + " or " + player2.getUsername() + "? (Choose 1 or 2)");
        int battleChoice = Integer.parseInt(input.nextLine());

        if (battleChoice == 1) {
            System.out.println("You have chosen to battle " + player1.getUsername() + "!");
            System.out.println("Player 1 stats: \nRank: " + player1.getRank() + "\n");
            if (player3.getRank().equalsIgnoreCase("God")) {
                System.out.println("You have defeated " + player1.getUsername() + "!");
            } else if (player3.getRank().equalsIgnoreCase("Pro")) {
                System.out.println("You have been defeated by " + player1.getUsername() + "!");
            } else if (player3.getRank().equalsIgnoreCase("Noob")) {
                System.out.println("You have been defeated by " + player1.getUsername() + "!");
            } else {
                System.out.println("The battle is inconclusive.");
            }

        } else if (battleChoice == 2) {
            System.out.println("You have chosen to battle " + player2.getUsername() + "!");
            System.out.println("Player 2 stats: \nRank: " + player2.getRank() + "\n");
            if (player3.getRank().equalsIgnoreCase("God")) {
                System.out.println("You have defeated " + player2.getUsername() + "!");
            } if (player3.getRank().equalsIgnoreCase("Hacker")) {
                System.out.println("You have defeated " + player2.getUsername() + "!");
            } else if (player3.getRank().equalsIgnoreCase("Pro")) {
                System.out.println("You have defeated " + player2.getUsername() + "!");
            } else {
                System.out.println("The battle is inconclusive.");
            }
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }



    }
}

class GetSet{
    //attributes
    private String username;
    private int ID;
    private String rank;

    // GETTERS:
    public String getUsername(){
        return username;
    }

    public int getID(){
        return ID;
    }

    public String getRank(){
        return rank;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setID(int newID){
        this.ID = newID;
    }

    public void setRank(String newRank){
        this.rank = newRank;
    }

}