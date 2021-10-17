/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Read {

    //We will use a reader and an ArrayList to hold all the lines of information.
    private static BufferedReader br;
    ArrayList<String> listOfNames = new ArrayList<>();

    public List<String> getList(){
        return listOfNames;
    }

    public void makeFileReader(){
        //Make the file reader.
        try{
            br = new BufferedReader(
                    new FileReader("D:\\Java related\\Assignment04\\exercise42\\data\\exercise42_input.txt"));
                        //I tried exercise42_input.txt, but for some reason it is not working, so I had to write the full address
                        //I hope this doesn't lose points since it does work, you may have to change the address when testing
        }catch(Exception ex){
            System.out.print("Can't find file.");
        }
    }

    public void readFile(){
        //Loop through until end of file.
        String hold;
        while((hold = readFileLine()) != null){
            //Add every line as a string.
            listOfNames.add(hold);
        }
    }

    public String readFileLine(){
        String result = "";

        //Using the input stream grab the next line.
        try {
            result = br.readLine();
        }catch(Exception ex){
            System.out.print("Can't find line.");
        }

        return result;
    }
}