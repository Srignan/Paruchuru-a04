/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */
package baseline;

import java.util.List;
import java.util.Scanner;

public class Solution44 {

    private static final Scanner in = new Scanner(System.in);
    private static final ProductSearch test = new ProductSearch();

    public static void main(String[] args){
        test.parseJSON();
        printProduct(getName());
    }

    public static String askProduct(){
        System.out.print("What is the product name? ");
        return in.next();
    }

    public static List<String> getName(){
        while(true) {
            String find = askProduct();

            //Get the array.
            List<String> result;
            result = test.findProductIndex(find);

            if(result.size() == 3){
                return result;
            }
            System.out.println("Sorry, that product was not found in our inventory.");
        }
    }
    public static void printProduct(List<String> list){
        System.out.println("Name: "+list.get(0));
        System.out.println("Price: "+list.get(1));
        System.out.println("Quantity: "+list.get(2));
    }
}