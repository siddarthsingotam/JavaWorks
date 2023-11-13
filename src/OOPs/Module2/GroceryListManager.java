package OOPs.Module2;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();
    private HashMap<String, String> itemCategories = new HashMap<>();
    private HashMap<String, Integer> itemQuantities = new HashMap<>();

    public void addItem(String item, double cost, String category, int quantity) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, cost);
            itemCategories.put(item, category);
            itemQuantities.put(item, quantity);
            System.out.println("Added \"" + item + "\" to the grocery list with a cost of $" + cost +
                    " in the category: " + category + " and quantity: " + quantity);
        } else {
            System.out.println("\"" + item + "\" is already in the grocery list.");
        }
    }

    public void addItemWithQuantity(String item, int quantity) {
        // Assume default cost is 0.0 and default category is "Uncategorized"
        addItem(item, 0.0, "Uncategorized", quantity);
    }

    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            itemQuantities.put(item, newQuantity);
            System.out.println("Updated quantity of \"" + item + "\" to " + newQuantity);
        } else {
            System.out.println("\"" + item + "\" is not in the grocery list.");
        }
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            itemCategories.remove(item);
            itemQuantities.remove(item);
            System.out.println("Removing \"" + item + "\" from the list...");
        } else {
            System.out.println("\"" + item + "\" is not in the grocery list.");
        }
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            String category = itemCategories.get(item);
            int quantity = itemQuantities.get(item);
            System.out.println(item + " - $" + entry.getValue() + " (Category: " + category + ", Quantity: " + quantity + ")");
        }
    }

    public boolean checkItem(String item) {
        boolean isPresent = groceryList.containsKey(item);
        System.out.println("Is \"" + item + "\" in the grocery list? " + isPresent);
        return isPresent;
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        for (Map.Entry<String, Integer> entry : itemQuantities.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (quantity > 0) {
                System.out.println(item + " - Quantity: " + quantity);
            }
        }
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items with costs, categories, and quantities
        manager.addItem("Apples", 2.5, "Fruits", 5);
        manager.addItem("Milk", 1.5, "Dairy", 2);
        manager.addItem("Bread", 1.0, "Bakery", 3);

        // Add items with quantities only (assume default cost, category, and quantity is 0)
        manager.addItemWithQuantity("Bananas", 4);
        manager.addItemWithQuantity("Cheese", 1);

        // Display the grocery list
        manager.displayList();

        // Update quantity of an item
        manager.updateQuantity("Apples", 8);

        // Display available items (quantity > 0)
        manager.displayAvailableItems();
    }
}




