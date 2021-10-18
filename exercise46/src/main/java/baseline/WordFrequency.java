package baseline;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
    /*
    private static final path filePath = Paths.get(exercise46input.txt)
        turn file text into string
        Public string parseFile(){
        String fileText;
            try{ fileText  Files.file path->catch exception and then return it
     */
    /*
    public Map<String,Integer> countWords(List<String> words){
        Map<String,Integer> wordCount = new HashMap<>();
        String compare;
        boolean check;
        for (String word : words) {
            check = false;
            compare = word;
            if ((wordCount.containsKey(compare))) {
                check = true;
                wordCount.put(compare, wordCount.get(compare) + 1);
            }
            if (!check) {
                wordCount.put(compare, 1);
            }
        }
        return wordCount;
     */
/*
 public String makeChart(Map<String,Integer> input){
        StringBuilder result = new StringBuilder();
        while(!input.isEmpty()){
            Integer max = 0;
            String maxKey = "";
            for (Map.Entry<String,Integer> entry : input.entrySet()) {
                if(entry.getValue() > max){
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
 */
    private static final Path filePath = Paths.get("D:\\Java related\\Assignment04\\exercise46\\data\\exercise46_input.txt");

    public String parseFile(){
        String fileText;
        try {
            fileText = Files.readString(filePath);
        }catch(Exception ex){
            fileText = "Cannot find file.";
        }

        return fileText;
    }
    public String removeLineBreaks(String input){
        //Replace all line breaks with spaces.
        input = input.replace("\n", " ").replace("\r", "");
        return input;
    }
    public List<String> makeList(String input){
        //Return a string as a list of words.
        return new ArrayList<>(Arrays.asList(input.split(" ")));
    }
    public List<String> removeBlanks(List<String> input){
        //If the list contains blank instances it removes them and returns a new list without any blanks.
        ArrayList<String> result = (ArrayList<String>) input;
        for(int i=0; i<input.size(); i++){
            if(result.get(i).isBlank()){
                result.remove(i);
            }
        }
        return result;
    }
    public Map<String,Integer> countWords(List<String> words){
        Map<String,Integer> wordCount = new HashMap<>();
        String compare;
        boolean check;
        //Loop through the list of words.
        for (String word : words) {
            check = false;
            //Get the current word.
            compare = word;
            //If the word is in the ist of maps then increment the value of the map by one.
            if ((wordCount.containsKey(compare))) {
                check = true;
                wordCount.put(compare, wordCount.get(compare) + 1);
            }
            //If the word is not in the list of maps add it with a value of '1'.
            if (!check) {
                wordCount.put(compare, 1);
            }
        }
        return wordCount;
    }
    public String makeChart(Map<String,Integer> input){
        StringBuilder result = new StringBuilder();
        //Loop through and print the greatest amount of occurrences every time until there are no more values.
        while(!input.isEmpty()){
            Integer max = 0;
            String maxKey = "";

            //Find the entry with the largest value.
            for (Map.Entry<String,Integer> entry : input.entrySet()) {
                if(entry.getValue() > max){
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            //Create a string with an equal amount of '*' to the value.

            //Add a formatted line that include the word and its number of occurrences to the result.
            result.append(String.format("%-15s", maxKey + ":")).append(String.format("%-10s", "*".repeat(max)
                    //Add a formatted line that include the word and its number of occurrences to the result.
            )).append("\n");
            //Remove the word, so it does not get counted again.
            input.remove(maxKey);
        }
        return result.toString();
    }
}