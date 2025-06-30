public class GameInventory {
    public static void main(String[] args) {
        ItemDatabase database = new ItemDatabase();
        PlayerInventory playerInventory = new PlayerInventory();

        Item sword = database.getItemByName("Sword");
        Item potion = database.getItemByName("Potion");

        playerInventory.addItem(sword);
        playerInventory.addItem(potion);
        playerInventory.displayInventory();

        playerInventory.removeItem(sword);
        playerInventory.displayInventory();
    }
}
