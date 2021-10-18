/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */
package baseline;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;



public class Solution44 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ParseException {
        List<Product> products =  Parser.loadProducts();

        String output = "";

        while (output.contentEquals("")) {
            String search = getString();
            output = searchProducts(products,search);
            if(!output.contentEquals(""))
                break;

            System.out.println("Sorry, that product was not found in our inventory.");
        }

        System.out.println(output);
    }
    private static String getString() {
        System.out.print("What is the product name? ");
        return in.nextLine();
    }

    public static String searchProducts(List<Product> products, String query) {
        String output = "";
        for	(Product item : products) {
            if(item.getName().equalsIgnoreCase(query)) {
                output = "Name: " + item.getName() +
                        "\nPrice: " + String.format("$%.2f", item.getPRICE()) +
                        "\nQuantity: " + item.getQUANTITY();
            }
        }
        return output;
    }
}