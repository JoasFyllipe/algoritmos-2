package entities;

public class Cart {

    public String productName;
    public double price;
    public int quantity;
    public int addQuantity;
    public int removedQuantity;

    public void removedCart(int quantity){
         this.quantity -= quantity;
    }

    public void addCart(int quantity){
        this.quantity += quantity;
    }

    public double totalValueCart(){
        return this.quantity * price;
    }

    public String toString(){
        return "Quantity products: "
                + quantity
                + ", "
                + "Value cart: "
                + String.format("%.2f", totalValueCart(),"%n");
    }
}
