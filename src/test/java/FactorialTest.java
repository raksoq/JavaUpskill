import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void checkFactorial(){

        assertEquals(6, Factorial.Calculate(3));
        assertEquals(24, Factorial.Calculate(4));
        assertEquals(120, Factorial.Calculate(5));
    }
}
