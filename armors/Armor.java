package armors;

public abstract class Armor {

    private String name;
    private final int ID;
    private final int block;
    private final int price;

    public Armor(int ID, int block, int price) {
        this.ID = ID;
        this.block = block;
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

    public int getBlock() {
        return block;
    }

    public int getPrice() {
        return price;
    }
}
