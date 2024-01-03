package locations;
import obstacles.Obstacle;

public abstract class Locations {
    // Every location has obstacles.Obstacle(s) and item
    private Obstacle[] obstacles;
    private String itemName;

    Locations(Obstacle[] obstacles, String itemName){
        this.obstacles = obstacles;
        this.itemName = itemName;
    }

    abstract void createObstacles();


    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
