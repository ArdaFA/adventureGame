public class Archer extends Characters{

    Archer() {
        super(2,7,18, false, false, false);
        System.out.println("Archer has been created");
    }

    @Override
    void goSafeHouse() {
        System.out.println("Your health was: " + this.getHealth());
        System.out.println("the archer sharpens his arrows even more and sleeps");
        setHealth(18);
        System.out.println("Your health is 100% now: " + this.getHealth());
    }
}
