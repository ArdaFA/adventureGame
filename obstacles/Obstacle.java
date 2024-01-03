package obstacles;
import play.Player;

public abstract class Obstacle {

    private final String name;
    private final int ID;
    private final int damage;
    private int health;
    private final int victoryCoins;

    public Obstacle(String name,int ID, int damage, int health, int victoryCoins) {
        this.ID = ID;
        this.damage = damage;
        this.health = health;
        this.victoryCoins = victoryCoins;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getDamage() {
        return damage;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getVictoryCoins() {
        return victoryCoins;
    }


    public void attack(Player player){
        int newCharacterHealth = player.getCharacter().getHealth() - this.getDamage();
        if (newCharacterHealth <= 0){
            System.out.println("You are DEAD, GAME OVER");
            player.getCharacter().setHealth(0);
            player.setAlive(false);
        }
        else {
            player.getCharacter().setHealth(newCharacterHealth);
            System.out.println("You were attacked by Zombie. Your health is: " + player.getCharacter().getHealth());
        }
    }
}
