package locations;
import obstacles.Bear;
import obstacles.Obstacle;

public class River extends Locations {
    public River(){
        super(new Obstacle[]{new Bear()}, "Water");
    }

    @Override
    void createObstacles() {

    }
}
