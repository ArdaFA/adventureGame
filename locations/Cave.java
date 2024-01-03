package locations;

import obstacles.Obstacle;
import obstacles.Zombie;

public class Cave extends Locations {

    public Cave(){
        super(new Obstacle[]{new Zombie()}, "Food");
    }

    @Override
    void createObstacles() {

    }
}
