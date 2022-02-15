public class driver{
    public static void main(String[] args){
        Inventory cheeseburger = new Inventory("entree", "cheeseburger", 4.50, 10);
        Inventory fries = new Inventory("side", "fries", 1.00, 20);
        Inventory soda = new Inventory("drink", "soda", 1.00, 25);
        Inventory iceCream = new Inventory("dessert", "ice cream", 1.25, 25);

        ArrayList<Inventory> inventory = ArrayList<>();

        inventory.add(cheeseburger);
        inventory.add(fries);
        inventory.add(soda);
        inventory.add(iceCream);

        inventory.add(new Inventory("entree", "chicken nuggets", 4.00, 10));
        inventory.add(new Inventory("side", "salad", 2.75, 5));
        inventory.add(new Inventory("drink", "milk", 1.25, 25));
        inventory.add(new Inventory("dessert", "cookie", .75, 10));
    }//end main
}//end driver class
