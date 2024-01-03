package characters;

public class Samurai extends Characters {

    public Samurai() {
        super(1,5,21, false, false, false);
        System.out.println("Archer has been created");
    }

    @Override
    public void goSafeHouse() {
        System.out.println("Your health was: " + this.getHealth());
        System.out.println("samurai resting in traditional Japanese attire");
        setHealth(21);
        System.out.println("Your health is 100% now: " + this.getHealth());
    }
}
