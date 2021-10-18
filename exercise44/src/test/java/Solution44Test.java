import baseline.Product;

import baseline.Solution44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


class Solution44Test {

    @Test
    void searchProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Monster Zero Ultra", 2.50, 5));
        products.add(new Product("C4 Midnight Cherry", 2.75, 9));
        products.add(new Product("Diamond", 12000.25, 1));

        String actual1 = Solution44.searchProducts(products, "Your mom's special ointment");
        String expected1 = "Diamond\nPrice: $12000.25\nQuantity: 1";

        assertEquals(expected1,actual1);

    }
}