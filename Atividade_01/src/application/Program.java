package application;

import entities.Cart;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("Enter the quantity of products: ");
        cart.quantity = sc.nextInt();
        System.out.println("Enter the value per unit: ");
        cart.price = sc.nextDouble();

        System.out.println(cart.totalValueCart());

        System.out.println("Do you want to add quantity of products? (y/n)");
        char resp = sc.next().charAt(0);

        if (resp == 'y') {
            System.out.println("Enter the quantity of products: ");
            cart.addQuantity = sc.nextInt();
            cart.addCart(cart.addQuantity);
        }
        else{
            System.out.println();
        }

        System.out.println("Do you want to reduce the quantity of products? (y/n)");
        resp = sc.next().charAt(0);

        if (resp == 'y') {
            System.out.println("Enter the quantity of products: ");
            cart.removedQuantity = sc.nextInt();
            cart.removedCart(cart.removedQuantity);
            System.out.print(cart);
        }
        else{
            System.out.print(cart);
        }

        sc.close();
    }
}
