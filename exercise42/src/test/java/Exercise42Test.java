import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise42Test {

    @Test  //To check for first person on list
    void readLine() {
        baseline.Read test = new baseline.Read();
        test.makeFileReader();
        assertEquals("Ling,Mai,55900",test.readFileLine());
    }

    @Test //To check that it grabbed correct file
    void makeFileReader() {
        baseline.Read test = new baseline.Read();
        try {
            test.makeFileReader();
            assertTrue(true);
        }catch(Exception ex){
            fail();
        }
    }

    @Test //to check for last person on list
    void getList() {
        baseline.Read test = new baseline.Read();
        test.makeFileReader();
        test.readFile();
        assertEquals("Zarnecki,Sabrina,51500", test.getList().get(6));
    }

    @Test  //To check for correct format
    void splitLine() {
        baseline.TableFormat test = new baseline.TableFormat();
        String[] result = test.splitLine("Ling,Mai,55900");
        assertEquals("Ling",result[0]);
    }
}

