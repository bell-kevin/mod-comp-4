public class Inventory{
    private String name;//stores the name of the item
    private String catagory; //stores the catagory of the item
    private double price;//stores the price of the item
    private int quantity; //stores the quantity of the item

    public Inventory(String name, String catagory, double price, int quantity){
        this.name = name;
        this.catagory = catagory;
        this.price = price;
        this.quantity = quantity;
    }

    public void display(){
        System.out.printf("%10s Item: %10s Price: $%10.2f Quantity: %d%n", this.name, this.catagory, this.price, this.quantity);
    }
} //end Inventory class
