/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */


package baseline;

import java.util.List;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;


/*

public class Write
{
    public static void write_to_file(List<String> namelist, int count) {
        try {
            BufferedWriter f_writer = new BufferedWriter(new FileWriter("D:\\Java related\\Assignment04\\exercise41\\data\\exercise41_output.txt"));
            String newline = "\r\n";
            String ct = Integer.toString(count);
            String firstLine = "Total of "+ ct +" names \r\n";
            f_writer.write(firstLine);
            f_writer.write("----------------- \r\n");

            for(String counter: namelist){
                System.out.println(counter);
                f_writer.write(counter);
                f_writer.write(newline);
            }
            System.out.print("File is created successfully with the content.");
            f_writer.close();
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}

 */