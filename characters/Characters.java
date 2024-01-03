package characters;

import obstacles.Obstacle;

public abstract class Characters {

    private final int ID;
    private final int damage;
    private int health;
    private boolean hasFood;
    private boolean hasFirewood;
    private boolean hasWater;

    public Characters(int ID, int damage, int health, boolean hasFood, boolean hasFirewood, boolean hasWater) {
        this.ID = ID;
        this.damage = damage;
        this.health = health;
        this.hasFood = hasFood;
        this.hasFirewood = hasFirewood;
        this.hasWater = hasWater;
    }

    public boolean isHasFood() {
        return hasFood;
    }

    public void setHasFood(boolean hasFood) {
        this.hasFood = hasFood;
    }

    public boolean isHasFirewood() {
        return hasFirewood;
    }

    public void setHasFirewood(boolean hasFirewood) {
        this.hasFirewood = hasFirewood;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
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

    public void attack(Obstacle obstacle){
        int newObstacleHealth = obstacle.getHealth() - this.getDamage();
        if (newObstacleHealth <= 0 ){
            System.out.println(obstacle.getName() + " is DEAD...");
            System.out.println("You have earned " + obstacle.getVictoryCoins() + " coins. Money Baby :) ");
            obstacle.setHealth(0);
        }
        else {
            obstacle.setHealth(newObstacleHealth);
            System.out.println("You attacked to the " + obstacle.getName() + " and its health is: " + newObstacleHealth);
        }
    }

    public abstract void goSafeHouse();

}

