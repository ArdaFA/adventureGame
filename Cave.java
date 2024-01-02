public class Cave extends Locations{

    Cave(){
        super(new Obstacle[]{new Zombie()}, "Food");
    }

    @Override
    void createObstacles() {

    }
}
