package OOPs.Module2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();
    private HashMap<String, String> itemCategories = new HashMap<>();

    public void addItem(String item, double cost, String category) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, cost);
            itemCategories.put(item, category);
            System.out.println("Added \"" + item + "\" to the grocery list with a cost of $" + cost + " in the category: " + category);
        } else {
            System.out.println("\"" + item + "\" is already in the grocery list.");
        }
    }

    public void addItemWithCategory(String item, String category) {
        // Assume default cost is 0.0 when adding an item with a category
        addItem(item, 0.0, category);
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            itemCategories.remove(item);
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
            System.out.println(item + " - $" + entry.getValue() + " (Category: " + category + ")");
        }
    }

    public boolean checkItem(String item) {
        boolean isPresent = groceryList.containsKey(item);
        System.out.println("Is \"" + item + "\" in the grocery list? " + isPresent);
        return isPresent;
    }

    public void displayByCategory(String category) {
        System.out.println("Items in Category \"" + category + "\":");
        for (Map.Entry<String, String> entry : itemCategories.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(category)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items with costs and categories
        manager.addItem("Apples", 2.5, "Fruits");
        manager.addItem("Milk", 1.5, "Dairy");
        manager.addItem("Bread", 1.0, "Bakery");

        // Add items with categories only (assume default cost is 0.0)
        manager.addItemWithCategory("Bananas", "Fruits");
        manager.addItemWithCategory("Cheese", "Dairy");

        // Display the grocery list
        manager.displayList();

        // Display items in a specific category
        manager.displayByCategory("Fruits");
    }
}



