import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MealTest {

    @Test
    @Order(2)
    void CheckCalculation(){
        Meal meal = new Meal(100, 10, 2);
        assertEquals(112,meal.Calculate());
    }

    @Test
    @Order(1)
    void setMealCost(){
        Meal meal = new Meal();
        meal.setMealCost(120);
        assertEquals(120,meal.getMealCost());
    }

}
