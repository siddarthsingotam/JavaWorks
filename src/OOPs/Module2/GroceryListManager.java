package OOPs.Module2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, cost);
            System.out.println("Added \"" + item + "\" to the grocery list with a cost of $" + cost);
        } else {
            System.out.println("\"" + item + "\" is already in the grocery list.");
        }
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println("Removing \"" + item + "\" from the list...");
        } else {
            System.out.println("\"" + item + "\" is not in the grocery list.");
        }
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }

    public boolean checkItem(String item) {
        boolean isPresent = groceryList.containsKey(item);
        System.out.println("Is \"" + item + "\" in the grocery list? " + isPresent);
        return isPresent;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Double cost : groceryList.values()) {
            totalCost += cost;
        }
        System.out.println("Total Cost: $" + totalCost);
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items with costs
        manager.addItem("Apples", 2.5);
        manager.addItem("Milk", 1.5);
        manager.addItem("Bread", 1.0);

        // Display the grocery list
        manager.displayList();

        // Check if a specific item is present
        manager.checkItem("Milk");

        // Remove an item
        manager.removeItem("Milk");

        // Display the updated grocery list
        manager.displayList();

        // Calculate and display the total cost
        manager.calculateTotalCost();
    }
}


