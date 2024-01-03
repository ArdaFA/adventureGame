package locations;
import obstacles.Obstacle;
import obstacles.Vampire;

public class Forest extends Locations {

    public Forest(){
        super(new Obstacle[]{new Vampire()}, "Firewood");
    }

    @Override
    void createObstacles(){

    }
}
