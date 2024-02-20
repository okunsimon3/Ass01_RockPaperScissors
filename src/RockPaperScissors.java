import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String playerA = "";
        String playerB = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;

        do {
            System.out.print("Player A, enter your move [Must be either R for rock, P for paper, or S for Scissors]: ");
            playerA = in.nextLine();
            if(playerA.equalsIgnoreCase("R")) {
                done = true;
            }
            else if(playerA.equalsIgnoreCase("P")) {
                done = true;
            }
            else if(playerA.equalsIgnoreCase("S")) {
                done = true;
            }
            else {
                System.out.println("You entered " + playerA + " as your move");
                System.out.println("Please enter a valid move");
            }
        }while (!done);
        done = false;
        do {
            System.out.print("Player B, enter your move [Must be either R for rock, P for paper, or S for Scissors]: ");
            playerB = in.nextLine();
            if(playerB.equalsIgnoreCase("R")) {
                done = true;
            }
            else if(playerB.equalsIgnoreCase("P")) {
                done = true;
            }
            else if(playerB.equalsIgnoreCase("S")) {
                done = true;
            }
            else {
                System.out.println("You entered " + playerB + " as your move");
                System.out.println("Please enter a valid move");
            }
        }while (!done);
    }
}