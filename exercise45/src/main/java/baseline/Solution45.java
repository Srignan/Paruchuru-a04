/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

public class Solution45 {
    /*
    void main(String[] args){
        findAndReplace run = new findAndReplace();
        String text = run.getFile();
        text = run.replace(text);

        outputToFile write = new outputToFile()
        writer.writeOut(text);
     */
    public static void main(String[] args){
        ReplaceWord run = new ReplaceWord();
        String text = run.getFile();
        text = run.replace(text);
        CreateFile writer = new CreateFile();
        writer.writeOut(text);
    }
}