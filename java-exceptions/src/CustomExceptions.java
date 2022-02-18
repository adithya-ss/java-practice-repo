import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        System.out.print("Enter the number of players in your team: ");
        int playerCount = numScan.nextInt();

        try {
            checkPlayerCount(playerCount);
        } catch (Exception e) {
            System.out.println("Whoops! There seems to be a problem.");
            System.out.println(e);
        } finally {
            numScan.close();
        }
    }

    static void checkPlayerCount(int count) throws PlayerLimitException {
        if (count < 15 || count > 25) {
            throw new PlayerLimitException("\nA minimum of 15 players are supposed to be registered for a match." +
            "A maximum of 25 players can be listed in the squad." +
            "\nPlease select a number in that range (15 < NUMBER_OF_PLAYERS < 25)" + 
            "\n\nGiven player count: " + count + "\n");
        } else {
            System.out.println("Your team is registered! Good luck.");
        }
    }
}
