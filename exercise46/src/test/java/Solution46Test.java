import baseline.WordFrequency;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {

    @Test
    void parseFile() {
        WordFrequency test = new WordFrequency();
        String result = test.parseFile();
        assertNotEquals("Cannot find file.",result);
    }

    @Test
    void removeLineBreaks() {
        WordFrequency test = new WordFrequency();
        String result = test.removeLineBreaks("How\nis your\nday. ");
        assertEquals("How is your day. ",result);
    }

    @Test
    void makeList() {
        WordFrequency test = new WordFrequency();
        String result = test.parseFile();
        result = test.removeLineBreaks(result);
        ArrayList<String> words = (ArrayList<String>) test.makeList(result);
        assertEquals("badger",words.get(0));
    }

    @Test
    void countWords_1(){
        WordFrequency test = new WordFrequency();
        ArrayList<String> words = new ArrayList<>();
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("clown");

        Map<String,Integer> result = test.countWords(words);
        assertEquals(3,result.get("badger"));
    }

    @Test
    void countWords_2(){
        WordFrequency test = new WordFrequency();
        ArrayList<String> words = new ArrayList<>();
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("clown");

        Map<String,Integer> result = test.countWords(words);
        assertEquals(1,result.get("clown"));
    }

    @Test
    void makeChart() {
        WordFrequency test = new WordFrequency();
        Map<String,Integer> run = new HashMap<>();
        run.put("badger",3);

        assertEquals("badger:        ***       \n",test.makeChart(run));
    }
}