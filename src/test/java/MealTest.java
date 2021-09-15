import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealTest {

    @Test
    void CheckCalculation(){
        Meal meal = new Meal(100, 10, 2);
        assertEquals(112,meal.Calculate());
    }
}
