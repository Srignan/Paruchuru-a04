package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Read
{
    public static List<String> collectNames() throws IOException {
        File file = new File("D:\\Java related\\Assignment04\\exercise41\\data\\exercise41_input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        ArrayList<String> namelist = new ArrayList<>();
        while ((st = br.readLine()) != null)
        {namelist.add(st);
        }
        return namelist;
    }

    public static int  numberOfNames()
    {
        File file = new File("D:\\Java related\\Assignment04\\exercise41\\data\\exercise41_input.txt");
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.readLine() != null) count++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}