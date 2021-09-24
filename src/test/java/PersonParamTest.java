import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class PersonParamTest {

    private Person person;

    @TestFactory
    Iterator<DynamicTest> dynamicTestFromCollection(){
        return Arrays.asList(
            dynamicTest("1st test",         () -> assertEquals(1, 1)),
            dynamicTest("2nd dynamic test", () -> assertEquals(1, 1))
        ).iterator();
    }

// Param test not working
    @ParameterizedTest
    @ValueSource(ints = {2, 5, 6, 18, 19})
    void checkIfYoung(int age){
        person =  new Person(age);
        assertEquals("You are young.",person.amIOld());

    }
}
