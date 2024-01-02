public class River extends Locations{
    River(){
        super(new Obstacle[]{new Bear()}, "Water");
    }

    @Override
    void createObstacles() {

    }
}
