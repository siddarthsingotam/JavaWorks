package OOPs.Module2.Part2;

import java.util.ArrayList;

public class ShoppingList {
    private String purpose;
    private ArrayList<String> items;

    public ShoppingList(String purpose) {
        this.purpose = purpose;
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println("Added \"" + item + "\" to the " + purpose + " shopping list.");
    }

    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Removing \"" + item + "\" from the " + purpose + " shopping list...");
        } else {
            System.out.println("\"" + item + "\" is not in the " + purpose + " shopping list.");
        }
    }

    public void displayList() {
        System.out.println("Shopping List for " + purpose + ":");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }
}
