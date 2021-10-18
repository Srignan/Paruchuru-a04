/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.util.*;

public class Solution41
{
    public static void main(String[] args) throws Exception
    {
        List<String> names;
        names = Read.collectNames();

        int count = Read.numberOfNames();
        Collections.sort(names);
        Write.fileWriter(names,count);
    }
}