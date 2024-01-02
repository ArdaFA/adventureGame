import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void askUserName(){

    }

    public static void startGame(){
        System.out.println("--------------------");
        System.out.println("** WELCOME TO THE ADVENTURE GAME **");
        System.out.println("--------------------");
    }

    static void loading() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(800);
        System.out.println("..");
        Thread.sleep(600);
        System.out.println(".");
        Thread.sleep(400);
    }

    static void goCave(Player currentPlayer) throws InterruptedException {
        System.out.println("You are going to the darkest Cave in the world... \n" +
                "Do you getting anxious?");
        Game.loading();
        System.out.println("Oh NOOO! There are Zombies here!!!!");
        Locations cave = new Cave();
        System.out.println("You are going to attack the Zombie...");
        Thread.sleep(1000);
        while (cave.getObstacles()[0].getHealth() > 0 && currentPlayer.getCharacter().getHealth() > 0 ){
            currentPlayer.getCharacter().attack(cave.getObstacles()[0]);
            Thread.sleep(500);
            if (cave.getObstacles()[0].getHealth() <= 0){
                System.out.println("You got the Food, nice work!");
                currentPlayer.setCoins(4);
                currentPlayer.getCharacter().setHasFood(true);
                break;
            }
            System.out.println("Zombie is attacking. It can damage you 3");
            cave.getObstacles()[0].attack(currentPlayer);
            Thread.sleep(500);
            if (currentPlayer.getCharacter().getHealth() <= 0){
                break;
            }
        }
    }

    static void goForest(Player currentPlayer) throws InterruptedException {
        System.out.println("You are going to the deepest and darkest forest in the world... \n" +
                "Do you getting anxious?");
        Game.loading();
        System.out.println("once there were three-headed dogs, poisonous squirrels.");
        Thread.sleep(500);
        System.out.println("let's see what you'll find...");
        System.out.println("Oh NOOO! There are Vampires here!!!!");
        Locations forest = new Forest();
        System.out.println("You are going to attack the Vampire...");
        Thread.sleep(600);
        while (forest.getObstacles()[0].getHealth() > 0 && currentPlayer.getCharacter().getHealth() > 0 ){
            currentPlayer.getCharacter().attack(forest.getObstacles()[0]);
            Thread.sleep(500);
            if (forest.getObstacles()[0].getHealth() <= 0){
                System.out.println("You got the Firewood, nice work!");
                currentPlayer.setCoins(7);
                currentPlayer.getCharacter().setHasFirewood(true);
                break;
            }
            System.out.println("Vampire is attacking. It can damage you 4");
            forest.getObstacles()[0].attack(currentPlayer);
            Thread.sleep(500);
            if (currentPlayer.getCharacter().getHealth() <= 0){
                break;
            }
        }
    }

    static void goRiver(Player currentPlayer) throws InterruptedException {
        System.out.println("You are going to the deepest and longest river in the world... \n" +
                "Do you getting anxious?");
        Game.loading();
        System.out.println("once there were giant snake-fishes, poisonous frogs and lots...");
        Thread.sleep(500);
        System.out.println("let's see what you'll find...");
        System.out.println("Oh NOOO! There are Bears here!!!!");
        Locations river = new River();
        System.out.println("You are going to attack the Bears...");
        Thread.sleep(600);
        while (river.getObstacles()[0].getHealth() > 0 && currentPlayer.getCharacter().getHealth() > 0 ){
            currentPlayer.getCharacter().attack(river.getObstacles()[0]);
            Thread.sleep(500);
            if (river.getObstacles()[0].getHealth() <= 0){
                System.out.println("You got the Water, nice work!");
                currentPlayer.setCoins(12);
                currentPlayer.getCharacter().setHasWater(true);
                break;
            }
            System.out.println("Bear is attacking. It can damage you 7");
            river.getObstacles()[0].attack(currentPlayer);
            Thread.sleep(500);
            if (currentPlayer.getCharacter().getHealth() <= 0){
                break;
            }
        }
    }

    static void goShop(Player currentPlayer) throws InterruptedException {
        System.out.println("You are in the Shop\n" +
                "You can buy Armor or Weapon");
        System.out.println(" ");
        System.out.println("1. Buy Weapon \n" +
                "2. Buy Armor \n" +
                "3. Leave the Store");

        int userSelection;
        userSelection = scanner.nextInt();

        switch (userSelection){
            case 1:
                System.out.println("Show the info of weapons");
                Weapon.showWeapons();
                break;
            case 2:
                System.out.println("Show info of armors");
                break;
            default:

        }
    }

    static void goSafeHouse(Player currentPlayer){
        System.out.println("You are in the Safe house");
        currentPlayer.getCharacter().goSafeHouse();
    }

    static void chooseLocation(Player currentPlayer, boolean shouldStop) throws InterruptedException {
        while (currentPlayer.isAlive()){
            System.out.println("Where do you want to go? \n" +
                    "1. Cave\n" +
                    "2. Forest\n" +
                    "3. River\n" +
                    "4. Shop\n" +
                    "5. Safe House\n" +
                    "6. Leave");
            int locationSelection;

            boolean validLocationSelection = false;

            Thread.sleep(1000);
            while(!validLocationSelection){

                locationSelection = scanner.nextInt();
                switch (locationSelection){
                    case 1:
                        Game.goCave(currentPlayer);
                        validLocationSelection = true;
                        break;
                    case 2:
                        Game.goForest(currentPlayer);
                        validLocationSelection = true;
                        break;
                    case 3:
                        Game.goRiver(currentPlayer);
                        validLocationSelection = true;
                        break;
                    case 4:
                        Game.goShop(currentPlayer);
                        validLocationSelection = true;
                        break;
                    case 5:
                        Game.goSafeHouse(currentPlayer);
                        validLocationSelection = true;
                        break;
                    case 6:
                        currentPlayer.setAlive(false);
                        shouldStop = true;
                        System.out.println("You gave up too early! \n" +
                                "Here is what you got: \n" +
                                "");
                        Thread.sleep(500);
                        System.out.println("You got " + currentPlayer.getCoins() + " coins to spend");
                        System.out.println("You've walked through the Mountains, swam in the darkest oceans... \n" +
                                "See you next time Brave Hero...");
                        break;
                    default:
                        System.out.println("There is no such a location to go");
                }
                System.out.println(" ");
                System.out.println(" ");
            }
        }

    }

    public static void chooseCharacter(){}
}
