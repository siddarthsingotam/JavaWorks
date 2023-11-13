package OOPs.Module2.Part2;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();
    private HashMap<String, String> itemCategories = new HashMap<>();
    private HashMap<String, Integer> itemQuantities = new HashMap<>();
    private ShoppingList backyardBBQList;
    private ShoppingList weekendCampingList;

    public GroceryListManager() {
        this.backyardBBQList = new ShoppingList("Backyard BBQ");
        this.weekendCampingList = new ShoppingList("Weekend Camping");
    }

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

    public void addToBackyardBBQList(String item) {
        backyardBBQList.addItem(item);
    }

    public void addToWeekendCampingList(String item) {
        weekendCampingList.addItem(item);
    }

    public void removeFromBackyardBBQList(String item) {
        backyardBBQList.removeItem(item);
    }

    public void removeFromWeekendCampingList(String item) {
        weekendCampingList.removeItem(item);
    }

    public void displayBackyardBBQList() {
        backyardBBQList.displayList();
    }

    public void displayWeekendCampingList() {
        weekendCampingList.displayList();
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items to specific shopping lists
        manager.addToBackyardBBQList("Burgers");
        manager.addToBackyardBBQList("Hot Dogs");
        manager.addToWeekendCampingList("Tent");
        manager.addToWeekendCampingList("Marshmallows");

        // Display specific shopping lists
        manager.displayBackyardBBQList();
        manager.displayWeekendCampingList();
    }
}




