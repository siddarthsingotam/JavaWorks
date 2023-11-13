package OOPs.Module2;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
            System.out.println("Added \"" + item + "\" to the grocery list.");
        } else {
            System.out.println("\"" + item + "\" is already in the grocery list.");
        }
    }

    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Removing \"" + item + "\" from the list...");
        } else {
            System.out.println("\"" + item + "\" is not in the grocery list.");
        }
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public boolean checkItem(String item) {
        boolean isPresent = groceryList.contains(item);
        System.out.println("Is \"" + item + "\" in the grocery list? " + isPresent);
        return isPresent;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        // Display the grocery list
        manager.displayList();

        // Check if a specific item is present
        manager.checkItem("Milk");

        // Remove an item
        manager.removeItem("Milk");

        // Display the updated grocery list
        manager.displayList();
    }
}

