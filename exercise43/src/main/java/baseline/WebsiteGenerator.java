/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WebsiteGenerator {
    /*
    State two strings siteName and author
    Set them as files with public void setFiles(String siteName, String authorName)
     */
    private String siteName;
    private String author;

    public void setFiles(String name, String authorName){
        siteName = name;
        author = authorName;
    }
    /*
        Public void makeDirectories(boolean js, boolean css
        Create
         String websiteStr = "./website"
            Path websitePath = Paths.get(websiteStr)
            try {
                Files.createDirectory(websitePath)
            } catch (IOException e) {
                e.printStackTrace()
            }
         */
    public void makeDirectories(boolean js, boolean css){

        String websiteStr = "./website";
        Path websitePath = Paths.get(websiteStr);
        try {
            Files.createDirectory(websitePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    /*
    Copy and paste same code from above but replace "./website/" with "./website/"+siteName
    Do the same for JS and CSS
     */
        String nameStr = "./website/"+siteName;
        Path namePath = Paths.get(nameStr);
        try {
            Files.createDirectory(namePath);
            System.out.println("Created ./website/"+siteName);
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(js){
            String jsDir = "./website/"+siteName+"/js/";
            System.out.println("Created ./website/"+siteName+"/js/");
            Path jsPath = Paths.get(jsDir);
            try {
                Files.createDirectory(jsPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        if(css){
            String cssDir = "./website/"+siteName+"/css/";
            System.out.println("Created ./website/"+siteName+"/css/");
            Path cssPath = Paths.get(cssDir);
            try {
                Files.createDirectory(cssPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*
     public String makeHTML(){
         //Make the file.
         File html = new File("./website/"+siteName+"/index.html");
         try{
             //Output to file.
             BufferedWriter bw = new BufferedWriter(new FileWriter(html));

             bw.close
      */
    public String makeHTML(){
        File html = new File("./website/"+siteName+"/index.html");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(html));
            bw.write("\n" +
                    "<!DOCTYPE html>\n\n<html>\n\t<head>\n" +
                    "<title>"+siteName+"</title>\n"+
                    "<meta name=\"author\" content=\""+author+"\">\n"+ "</head>\n"+
                    "<body>\n" + "<h1>.............</h1>\n" + "</body>\n" + "</html>\n");


            bw.close();


            return "Created ./website/"+siteName+"/index.html";
        }catch(Exception ex){
            return "Could not complete.";
        }
    }
}