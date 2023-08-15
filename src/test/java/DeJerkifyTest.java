import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeJerkifyTest {

    @Test
    void getItems() {
        String input = "Hi##My##Dude";
        String[] expected = {"Hi","My","Dude"};
        String[] actual = DeJerkify.getItems(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void getKeyValues(){
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016";
        String expected = "naMe:Milk price:3.23 type:Food expiration:1/25/2016";
//        String actual = DeJerkify.getKeyValues(input);

//        assertEquals(expected, actual);
    }

    @Test
    void getValue(){
        String input = "naMe:Milk";
        String[] expected = {"naMe","Milk"};
        String[] actual = DeJerkify.getValue(input);


        assertArrayEquals(expected, actual);
    }


    @Test
    void getPriceV2() {
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016";
        String expected = "3.23";
        String actual = DeJerkify.getPriceV2(input);

        assertEquals(expected, actual);
    }

    @Test
    void getNameV2() {
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016";
        String expected = "Milk";
        String actual = DeJerkify.getNameV2(input);

        assertEquals(expected, actual);
    }

    @Test
    void getTypeV2() {
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016";
        String expected = "Food";
        String actual = DeJerkify.getTypeV2(input);

        assertEquals(expected, actual);
    }

    @Test
    void getDateV2() {
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016";
        String expected = "1/25/2016";
        String actual = DeJerkify.getDateV2(input);

        assertEquals(expected, actual);
    }

    @Test
    void getItems2V2() {
        String input = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##";
        String[] hold = {"naMe:Milk;price:3.23;type:Food;expiration:1/25/2016","naMe:Milk;price:3.23;type:Food;expiration:1/25/2016"};
        List<String> expected = Arrays.asList(hold);

        ArrayList<String>  actual = DeJerkify.getItems2V2(input);

        for(int i = 0; i < actual.size(); i++){
            assertEquals(expected.get(i), actual.get(i));
        }
        assertEquals(expected, actual);
    }
}