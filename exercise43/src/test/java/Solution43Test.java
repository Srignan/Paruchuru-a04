/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

import baseline.WebsiteGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution43Test {

    @Test
    void makeHTML() {
        WebsiteGenerator builder = new WebsiteGenerator();
        builder.setFiles("awesomeco","Max Power");
        builder.makeDirectories(true, true);
        assertEquals("Created ./website/awesomeco/index.html",builder.makeHTML());
    }
}
