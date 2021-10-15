package baseline;

import java.util.List;

public class Solution42 {
    public static void main(String[] args) {
        //Use the fileReader to get a list of names.
        Read input = new Read();
        input.makeFileReader();
        input.readFile();
        List<String> names = input.getList();

        //Use nameFormatter to format the names into a table.
        TableFormat tableMaker = new TableFormat();
        String result = tableMaker.makeTable(names);

        //Print the result.
        System.out.print(result);
    }
}

