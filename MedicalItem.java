public class MedicalItem {
        private String name;
        private double price;
        private int quantity;
    
        public MedicalItem(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    
        public String getName() {
            return name;
        }
    
        public double getPrice() {
            return price;
        }
    
        public int getQuantity() {
            return quantity;
        }
    
        public double getTotalPrice() {
            return price * quantity;
        }
    
        @Override
        public String toString() {
            return name + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalPrice();
        }
    }
    
