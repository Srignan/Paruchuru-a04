/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import org.json.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProductSearch {

    /*
    private JSONObject JSONSearch
    public void parseJson(){
    public void parseJSON(){

    try{
        String content = new String(Files.readAllBytes(Paths.get(exercise44\data\exercise44_input.json)
        jsonSearch = new JSONObject(content);

        }catch(Exception ex){
        }
    }
     */
    private JSONObject jsonSearch;
    public void parseJSON(){

        try {
            String content = new String(Files.readAllBytes(Paths.get("D:\\Java related\\Assignment04\\exercise44\\data\\exercise44_input.json")));
            //Same problem as 42, unless I paste the full address, it doesn't seem to work. It might be because I am using a D drive
            // to store my data, but I don't know.
            jsonSearch = new JSONObject(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
            public List<String> findProductIndex(String find){

            ArrayList<String> result = new ArrayList<>();

            JSONArray ja = ((JSONArray) jsonSearch.get("products"));

            for (int j = 0; j < ja.length(); j++) {
                JSONObject obj = ja.getJSONObject(j);

                if (find.equals(obj.getString("name"))) {
                    result.add(find);
                    result.add(Double.toString(obj.getDouble("price")));
                    result.add(Integer.toString(obj.getInt("quantity")));
                    break;
                }
            }
            return result;
        }
    }
         */
    public List<String> findProductIndex(String find){
        //Create the return ArrayList (Index 0 is 'name', 1 is 'price', 2 is 'quantity': Since there are only ever three values it is not really necessary to use a map here.)
        ArrayList<String> result = new ArrayList<>();

        //Get the array from the JSON file.
        JSONArray ja = ((JSONArray) jsonSearch.get("products"));

        //Find the name and add all values to the ArrayList.
        for (int j = 0; j < ja.length(); j++) {
            //Get the product in that index.
            JSONObject obj = ja.getJSONObject(j);
            //If it is the correct product.
            if (find.equals(obj.getString("name"))) {
                //Add the product name.
                result.add(find);
                //Add the price.
                result.add(Double.toString(obj.getDouble("price")));
                //Add the quantity.
                result.add(Integer.toString(obj.getInt("quantity")));
                break;
            }
        }
        return result;
    }
}