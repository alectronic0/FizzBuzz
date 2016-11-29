import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzJUnitTest {
    @Test
    public void testFizzBuzz(){assertEquals("FizzBuzz", Main.FizzBuzz.getFizzBuzz(15));}
    @Test
    public void testFizz(){assertEquals("Fizz", Main.FizzBuzz.getFizzBuzz(3));}
    @Test
    public void testBuzz(){assertEquals("Buzz", Main.FizzBuzz.getFizzBuzz(5));}
    @Test
    public void testNotFizzBuzz(){assertEquals("", Main.FizzBuzz.getFizzBuzz(2));}
}
