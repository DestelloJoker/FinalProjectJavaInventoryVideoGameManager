/*Program Name: VideoGameInventoryManager.java
 * Authors: Austin P
 * Date last Updated: 9/21/2024
 * Purpose: This program is part of my video game inventory manager final project.
 * This is the program that controls the game inventory management system.
 */
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Item> items;
    private int capacity;

    public InventoryManager(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    // This method is for adding an item to the inventory
    public boolean addItem(Item item) {
        if (items.size() < capacity) {
            items.add(item);
            System.out.println(item.getName() + " added to inventory.");
            return true;
        } else {
            System.out.println("Inventory is full! Cannot add " + item.getName());
            return false;
        }
    }

    // This method for getting the current list of items in the inventory
    public List<Item> getItems() {
        return items;
    }

    // This method is for getting the inventory capacity
    public int getCapacity() {
        return capacity;
    }

    // This method is meant to check if the inventory is full
    public boolean isFull() {
        return items.size() >= capacity;
    }

    // This method is meant to check if the inventory is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }
    // This Method is meant to remove all items from the inventory
    public void removeAllItems() {
        items.clear();
        System.out.println("All items magically vanished without a trace!");
    }
}
