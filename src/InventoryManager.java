import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<InventoryItem> inventory;

    public InventoryManager() {
        inventory = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        // TODO
        // Add hozzá (az ebben az osztályban lévő) inventory változóhoz a paraméterként kapott itemet!
    }

    public void addItem(String name, int quantity, double price) {
        // TODO
        // Hívd meg az InventoryItem kosntruktorát a három paraméterrel és mentsd el egy item változóba!
        // Add hozzá az inventoryhoz ezt az item-et!
    }

    public void printItems() {
        // TODO
    }

    public void removeItem(String name) {
        // TODO
    }

    public void updateQuantity(String name, int newQuantity) {
        // TODO
    }

    public double calculateTotalValue() {
        // TODO
        return 0;
    }




}
