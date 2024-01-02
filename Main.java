import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String userName;
        System.out.print("Enter your name: ");
        userName = scanner.next();

        Player currentPlayer = new Player(userName,0);
        Game.startGame();

        Thread.sleep(1000);

        System.out.print("Choose your character!\n" +
                "1. Samurai\n" +
                "2. Archer\n" +
                "3. Knight\n" +
                "Number: ");


        int characterSelection;
        characterSelection = scanner.nextInt();

        // save the name of character to use it below
        String selectedCharacter = "";

        Thread.sleep(1000);
        boolean validSelection = false;
        while(!validSelection){
            switch (characterSelection){
                case 1:
                    currentPlayer.setCharacter(new Samurai());
                    System.out.println(currentPlayer.getPlayerName() + ", you are a japanese Samurai right now!");
                    validSelection = true;
                    selectedCharacter = "Samurai";
                    break;
                case 2:
                    currentPlayer.setCharacter(new Archer());
                    System.out.println(currentPlayer.getPlayerName() + ", you are a mongolian Archer right now!");
                    validSelection = true;
                    selectedCharacter = "Archer";
                    break;
                case 3:
                    currentPlayer.setCharacter(new Knight());
                    System.out.println(currentPlayer.getPlayerName() + ", you are a medieval Knight right now!");
                    validSelection = true;
                    selectedCharacter = "Knight";
                    break;
                default:
                    System.out.println("Invalid number\n" +
                            "Enter again 1, 2 or 3: ");
                    characterSelection = scanner.nextInt();
            }
        }

        boolean shouldStop = false;
        while (!shouldStop && currentPlayer.isAlive()){
            Game.chooseLocation(currentPlayer, shouldStop);
        }


    }
}