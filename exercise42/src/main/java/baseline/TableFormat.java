package baseline;


import java.util.List;

public class TableFormat {
    public String makeTable (List<String> list){
        //Create start of table.
        StringBuilder result = new StringBuilder("""
                Last      First     Salary
                --------------------------
                """);

        String[] line;
        String first;
        String last;
        String salary;
        //Loop through list and add all names.
        for (String s : list) {
            //Use splitLine to get the firstname, lastname, and salary.
            line = splitLine(s);

            //Properly format all values.
            first = String.format("%-10s", line[1]);
            last = String.format("%-10s", line[0]);
            salary = String.format("%-10s", line[2]);

            //Add the formatted line to the table.
            result.append(last).append(first).append(salary).append("\n");
        }
        //Return the table.
        return result.toString();
    }

    public String[] splitLine(String nameLine){
        //Split the line at ',' and return a set that includes the Firstname, Lastname, and Salary.
        return nameLine.split(",",3);

    }
}