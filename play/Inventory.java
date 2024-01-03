package play;

import armors.Armor;
import weapons.Weapon;

public class Inventory {

    private Weapon weapon;
    private Armor armor;

    public Inventory() {}

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
