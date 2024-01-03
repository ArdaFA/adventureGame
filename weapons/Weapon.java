package weapons;

public abstract class Weapon {

    private String name;
    private final int ID;
    private final int damage;
    private final int price;

    public Weapon(int ID, int damage, int price) {
        this.ID = ID;
        this.damage = damage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public int getDamage() {
        return damage;
    }

    public int getPrice() {
        return price;
    }

    public static void showWeapons() {
        String[][] weaponInfo = {
                {"Weapon | ID | Damage | Price "},
                {"-----------------------------"},
                {"Pistol | 1  |   2    |   25  "},
                {"-----------------------------"},
                {"Sword  | 2  |   3    |   35  "},
                {"-----------------------------"},
                {"Rifle  | 3  |   7    |   45  "},
        };

        for (String[] row : weaponInfo) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

}
