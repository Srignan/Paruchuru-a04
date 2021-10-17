package baseline;

import org.json.*;

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
    /*
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
     */
