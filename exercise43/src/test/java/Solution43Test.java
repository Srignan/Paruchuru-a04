import baseline.WebsiteGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution43Test {

    @Test
    void makeHTML() {
        WebsiteGenerator builder = new WebsiteGenerator();
        builder.setFiles("awesomeco","Max Power");
        boolean js = true;
        boolean css = true;
        builder.makeDirectories(js,css);
        assertEquals("Created ./website/awesomeco/index.html",builder.makeHTML());
    }
}
