import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzbuzzTest {
    @Test
    public void Testing() {
        assertEquals("Fizzbuzz", Fizzbuzz.checknumber(15));
    }
    @Test
    public void Testing1() {
        assertEquals("Fizz", Fizzbuzz.checknumber(5));
    }
    @Test
    public void Testing2() {
        assertEquals("Buzz", Fizzbuzz.checknumber(3));
    }
    @Test
    public void Testing3() {
        assertEquals( "2", Fizzbuzz.checknumber(2));
    }
}