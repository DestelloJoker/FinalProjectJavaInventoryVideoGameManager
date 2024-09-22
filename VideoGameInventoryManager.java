/*Program Name: VideoGameInventoryManager.java
 * Authors: Austin P
 * Date last Updated: 9/21/2024
 * Purpose: This program is my final project that will be updated to include javaFX code
 * and be a fully fleshed out version of an low level inventory manager based on video game inventories.
 * Currently this is the driver class that pulls from inventorymanager.java and item.java
 */
public class VideoGameInventoryManager {
        public static void main(String[] args) {
            // Creates a new instance of InventoryManager with a default max capacity of 10 for testing purposes
            InventoryManager inventory = new InventoryManager(10); 
    
            // Add a couple Weapons
            Weapon sword = new Weapon("Iron Sword", "Starting iron blade", 1, false, "Common", 60, 3.5, "Melee", 5);
            Weapon bow = new Weapon("Tangu Bow", "Enchanted with the power of wind", 1, false, "Uncommon", 50, 2.0, "Ranged", 7);
            Weapon shield = new Weapon("Iron Studded Shield", "Starting iron studded wooden shield", 1, false, "Common", 10, 5.0, "Defensive", 8);
            
            // Add a couple Potions
            Potion healthPotion = new Potion("Health Potion", "Restores your health", 3, true, "Common", "Heal", 30, 10);
            Potion manaPotion = new Potion("Mana Potion", "Restores your mana", 2, true, "Rare", "Mana Restore", 30, 5);
            Potion strengthPotion = new Potion("Strength Potion", "Increases your strength", 1, true, "Rare", "Strength Boost", 45, 15);
    
            // Add a couple pieces of Armor
            Armor helmet = new Armor("Iron Helmet", "Protects the users head from low amounts of strike damage", 1, false, "Common", 15, 2.0, "Head", 10);
            Armor chestplate = new Armor("Iron Chestplate", "Protects the users torso from stabs and slashes", 1, false, "Common", 35, 5.5, "Torso", 15);
            Armor leggings = new Armor("Iron Leggings", "Protects the users legs from strikes stabs and slashes", 1, false, "Uncommon", 50, 3.0, "Legs", 12);
            
            // Adds all items to the inventory
            inventory.addItem(sword);
            inventory.addItem(bow);
            inventory.addItem(shield);
            inventory.addItem(healthPotion);
            inventory.addItem(manaPotion);
            inventory.addItem(strengthPotion);
            inventory.addItem(helmet);
            inventory.addItem(chestplate);
            inventory.addItem(leggings);
    
            // Calls the test method to display all items
            displayItemsBySubclass(inventory);

            // Calls the test method to remove all items
            testRemoveAllItems(inventory);
        }
    
        // Test method to output all current items in each subclass
        public static void displayItemsBySubclass(InventoryManager inventory) {
            System.out.println("\nAll currently owned Weapons:");
            for (Item item : inventory.getItems()) {
                if (item instanceof Weapon) {
                    System.out.println(item.getName() + " - " + item.getDescription());
                }
            }
    
            System.out.println("\n All currently owned Potions:");
            for (Item item : inventory.getItems()) {
                if (item instanceof Potion) {
                    System.out.println(item.getName() + " - " + item.getDescription());
                }
            }
    
            System.out.println("\n All currently owned pieces of Armor:");
            for (Item item : inventory.getItems()) {
                if (item instanceof Armor) {
                    System.out.println(item.getName() + " - " + item.getDescription());
                }
            }
        }
        // Test case to remove all items from the inventory
        public static void testRemoveAllItems(InventoryManager inventory) {
            System.out.println("\nRemoving all items from the inventory...");
            inventory.removeAllItems();  // This will clear the inventory and print the message
        }

    } 

