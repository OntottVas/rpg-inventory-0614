import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<InventoryItem> inventory;

    public InventoryManager() {
        inventory = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        // Add hozzá (az ebben az osztályban lévő) inventory változóhoz a paraméterként kapott itemet!
        inventory.add(item);
    }

    public void addItem(String name, int quantity, double price) {
        // Hívd meg az InventoryItem kosntruktorát a három paraméterrel és mentsd el egy item változóba!
        InventoryItem item = new InventoryItem(name, quantity, price);
        // Add hozzá az inventoryhoz ezt az item-et!
        inventory.add(item);
        // --> Ezt lehet egy sorban is: inventory.add(new InventoryItem(name, quantity, price));
    }

    public void printItems() {
        System.out.println("*** Inventory Items ***");
        for (InventoryItem item : inventory) {
            System.out.println("Name: " + item.getName());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Price: " + item.getPrice());
            System.out.println("-".repeat(10));
        }
    }

    public void removeItem(String name) {
        InventoryItem itemToRemove = null;
        for (InventoryItem item : inventory) {
            if (item.getName().equals(name)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            inventory.remove(itemToRemove);
        }
    }

    public void updateQuantity(String name, int newQuantity) {
        for (InventoryItem item : inventory) {
            if (item.getName().equals(name)) {
                item.setQuantity(newQuantity);
                break;
            }
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (InventoryItem item : inventory) {
            totalValue += item.calculateValue();
        }
        return totalValue;
    }


}
