/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Public class findAndReplace
    private static final path filepath = path.get("exercise45_input.txt")

    public String getFile(){
        String fileText;
            try{
                fileText = Files.readString(filePath)
                }catch ( Exception ex){
                    fileText = "Cannot find file."
                    }
            return fileText;
           }
 */
/*
public String replace(String fileText){
    fileText = fileText.replaceAll(utilize, use)
    return fileText;
    }
 */
public class ReplaceWord {
    private static final Path filePath = Paths.get("D:\\Java related\\Assignment04\\exercise45\\data\\exercise45_input.txt");

    public String getFile(){
        String fileText;

        //Turn the file text into a string.
        try {
            fileText = Files.readString(filePath);
        }catch(Exception ex){
            fileText = "Cannot find file.";
        }

        return fileText;
    }

    public String replace(String fileText){
        fileText = fileText.replaceAll("utilize","use");

        return fileText;
    }
}