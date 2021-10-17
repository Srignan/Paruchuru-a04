/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.util.Scanner;

public class Solution43 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        WebsiteGenerator builder = new WebsiteGenerator();
        builder.setFiles(askForName(),askForAuthor());
        boolean js = askJS();
        boolean css = askCSS();
        builder.makeDirectories(js,css);
        System.out.print(builder.makeHTML());
    }

    public static boolean askJS(){
        System.out.print("Do you want a folder for JavaScript? ");
        String check = in.nextLine();
        return check.equals("y") || check.equals("Y");
    }

    public static String askForName(){
        System.out.print("Site name: ");
        return in.nextLine();
    }

    public static String askForAuthor(){
        System.out.print("Author: ");
        return in.nextLine();
    }

    public static boolean askCSS(){
        System.out.print("Do you want a folder for CSS? ");
        String check = in.nextLine();
        return check.equals("y") || check.equals("Y");
    }
}