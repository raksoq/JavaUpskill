import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@DisplayName("Person class testing")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class PersonTestNested {


    //Arrange
    @DisplayName("GIVEN the person is young")
    @Nested
    class YoungPerson{
        private Person person = null;

        //Act
        @DisplayName("WHEN the person started as 3 years old")
        @BeforeEach
        void setUp() {
            person = new Person(3);
        }

        //Assert
        @DisplayName("THEN the person age is 3 years old")
        @Test
        void testGetAgeMethod(){
            assertEquals(3, person.getAge(), "Error, Person age not assigned");
        }

        //Assert
        @DisplayName("THEN the person is 4 years old")
        @Test
        @RepeatedTest(3)
        void checkYearPassed(){
            person.yearPasses();
            assertEquals(4, person.getAge(), "Years were not added");
        }

        //Assert
        @DisplayName("WHEN Adding +2 THEN the person is 5 years old")
        @Test
        void checkYearPassed2(){
            person.yearPasses();
            person.yearPasses();

            //test will run when env var will be 1. Since do not exist then No.
            assumeTrue("1".equals(System.getenv("TEST_POINTS")));
            assertEquals(5, person.getAge(), "Years were not added");
        }

        //Act

        @Test
        @DisplayName("WHEN we add 1 year to a your person")
        @Disabled("Not working. Can't add years when SetUp is run before each method.")
        void addYear(){
            person.yearPasses();
        }

        @AfterEach
        void tearDown() {
        }

    }

    @Nested
    class OldPerson{
        private Person person = null;


        @BeforeEach
        void setUp() {
            person = new Person(18);
        }

        @Test
        void checkYearPasses(){
            person.yearPasses();
            person.yearPasses();
            person.yearPasses();
            assertAll("Adding year errors. Oldies",
                    () -> assertEquals(20,person.getAge()),
                            () -> assertEquals(21, person.getAge())
                    );

            assumingThat("DEV".equals(System.getenv("ENV_SETUP")),
                    () -> {
                        // perform these assertions only on the DEV server
                        assertEquals(21, person.getAge());
                    });
        }

        @Test
        void testGetAge(){
            assertEquals(18, person.getAge());
        }

        @AfterEach
        void tearDown() {
        }
    }
}
