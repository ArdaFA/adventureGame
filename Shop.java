public class Shop {

    public static void buyWeapon(Player currentPlayer, Weapon weapon){
        currentPlayer.getInventory().setWeapon(weapon);
        currentPlayer.setHasWeapon(true);
        System.out.println(currentPlayer.getPlayerName() + " has bought a " + weapon.getName());
    }

    public void buyArmor(Player currentPlayer, Armor armor){
        currentPlayer.getInventory().setArmor(armor);
        currentPlayer.setHasArmor(true);
        System.out.println(currentPlayer.getPlayerName() + " has bought a " + armor.getName());
    }
}
