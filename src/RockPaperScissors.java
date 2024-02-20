import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String playerA = "";
        String playerB = "";
        String doneResponse = ""; // Should be either Y or N
        Scanner in = new Scanner(System.in);
        boolean done = false;

        do {
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
                    System.out.println("Please enter a valid move" + "\n");
                }
            }while (!done);
            done = false;
            do {
                System.out.print("\n" + "Player B, enter your move [Must be either R for rock, P for paper, or S for Scissors]: ");
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
            done = false;
            if(playerA.equalsIgnoreCase("R") && (playerB.equalsIgnoreCase("R"))) {
                System.out.println("\n" + "Rock vs Rock. It's a tie!");
            } else if(playerA.equalsIgnoreCase("R") && (playerB.equalsIgnoreCase("S"))) {
                System.out.println("\n" + "Rock breaks Scissors. Player A wins!");
            } else if(playerA.equalsIgnoreCase("R") && (playerB.equalsIgnoreCase("P"))) {
                System.out.println("\n" + "Paper covers Rock. Player B wins!");
            } else if(playerA.equalsIgnoreCase("P") && (playerB.equalsIgnoreCase("P"))) {
                System.out.println("\n" + "Paper vs Paper. It's a tie!");
            } else if(playerA.equalsIgnoreCase("P") && (playerB.equalsIgnoreCase("R"))) {
                System.out.println("\n" + "Rock covers Paper. Player A wins!");
            } else if(playerA.equalsIgnoreCase("P") && (playerB.equalsIgnoreCase("S"))) {
                System.out.println("\n" + "Scissors cuts Paper. Player B wins!");
            } else if(playerA.equalsIgnoreCase("S") && (playerB.equalsIgnoreCase("S"))) {
                System.out.println("\n" + "Scissors vs Scissors. It's a tie!");
            } else if(playerA.equalsIgnoreCase("S") && (playerB.equalsIgnoreCase("P"))) {
                System.out.println("\n" + "Scissors cuts Paper. Player A wins!");
            } else {
                System.out.println("\n" + "Rock breaks Scissors. Player B wins!");
            }
            System.out.print("\n" + "Would you like to play again? [Y/N]: ");
            doneResponse = in.nextLine();
            if(doneResponse.equalsIgnoreCase("N")) {
                System.out.println("\n" + "Thank you for playing!");
                done = true;
            }
        }while (!done);
    }
}