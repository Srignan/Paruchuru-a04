/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

import baseline.ReplaceWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise45Test {

    @Test
    void getFile(){
        ReplaceWord test = new ReplaceWord();
        assertNotEquals("Cannot find file.",test.getFile());
    }

    @Test
    void replace_1() {
        ReplaceWord test = new ReplaceWord();
        assertEquals("use",test.replace("utilize"));
    }

    @Test
    void replace_2() {
        ReplaceWord test = new ReplaceWord();
        assertNotEquals("utilize",test.replace("utilize"));
    }

    @Test
    void replace_3() {
        ReplaceWord test = new ReplaceWord();
        assertNotEquals("use",test.replace("stinky"));
    }
}