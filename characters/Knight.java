package characters;

public class Knight extends Characters {

    public Knight() {
        super(3,8,24, false, false, false);
        System.out.println("Knight has been created");
    }

    @Override
    public void goSafeHouse() {
        System.out.println("Your health was: " + this.getHealth());
        System.out.println("the knight returns to the Castle and rests");
        setHealth(24);
        System.out.println("Your health is 100% now: " + this.getHealth());
    }
}
