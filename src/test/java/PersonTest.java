import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {
    private Person person = null;

    @BeforeEach
    void setUp() {
        person = new Person(3);
        System.out.println("Start testing");
    }

    @Test
    void checkYearPasses(){
        person.yearPasses();
        assertEquals(4, person.getAge());
    }

    @Test
    void testGetAge(){
        assertEquals(3, person.getAge());
    }

    @AfterEach
    void tearDown() {
        System.out.println("End testing");
    }
}
