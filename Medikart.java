import java.util.ArrayList;
import java.util.List;

public class Medikart {
    private List<MedicalItem> items;

    public Medikart() {
        this.items = new ArrayList<>();
    }

    public void addItem(MedicalItem item) {
        items.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    public void removeItem(String itemName) {
        for (MedicalItem item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public void viewItems() {
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (MedicalItem item : items) {
                System.out.println(item);
            }
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (MedicalItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
}

