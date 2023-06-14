import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<InventoryItem> inventory;

    public InventoryManager() {
        inventory = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        // TODO
        // Add hozzá (az ebben az osztályban lévő) inventory változóhoz a paraméterként kapott itemet!
        this.inventory.add(item);
    }

    public void addItem(String name, int quantity, double price) {
        // TODO
        // Hívd meg az InventoryItem kosntruktorát a három paraméterrel és mentsd el egy item változóba!
        InventoryItem item = new InventoryItem(name, quantity, price);
        // Add hozzá az inventoryhoz ezt az item-et!
        this.inventory.add(item);
    }

    public void printItems() {
        // TODO
        for (InventoryItem i : inventory) {
            System.out.println(i);
        }
    }

    public void removeItem(String name) {
        // TODO
        for (int i = 0; i < inventory.size(); i++) {
            if (name.equals(inventory.get(i).getName())) {
                inventory.remove(i);
                break;
            }
        }
    }

    public void updateQuantity(String name, int newQuantity) {
        // TODO
        int index = 0;
        for (int i = 0; i < inventory.size(); i++) {
            if (name.equals(inventory.get(i).getName())) {
                index = i;
                break;
            }
        }
        inventory.get(index).setQuantity(newQuantity);
    }

    public double calculateTotalValue() {
        // TODO
        double sum = 0;
        for (InventoryItem i : inventory) {
            sum += i.calculateValue(i.getQuantity(), i.getPrice());
        }
        return sum;
    }


}
