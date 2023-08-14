import org.junit.jupiter.api.Test;

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


}