import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {
    @Test
    void test_toRoman() {
        String result = Roman.toRoman(3);
        assertEquals("III",result);
    }
    @Test
    void test_fromRoman() {
        int result = Roman.fromRoman("X");
        assertEquals(10,result);
    }

}