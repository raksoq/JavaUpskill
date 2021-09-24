import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //https://www.hackerrank.com/domains/tutorials/30-days-of-code

        //Day2
//        Meal meal = new Meal();
//        meal.InteractiveSolution();
//        Meal meal = new Meal(100, 10, 2);
//        int result = meal.Calculate();
//        System.out.println(result);
        //Day4
//        Person person = new Person(18);
//        person.amIOld();
//        person.yearPasses();
//        person.yearPasses();
//        person.yearPasses();
//        person.amIOld();
//        System.out.println(person.getAge());

//        Java DataTypes
//        VarTypes varTypes = new VarTypes();
//        varTypes.calculations();

        int number = 1262222789;
        String numberString = Integer.toString(number);
        System.out.println(numberString);
        System.out.println((numberString.chars().count() > 8 )? "Error. greater than 8" : "Correct length");
        System.out.println(numberString.substring(2));
        System.out.println(numberString.substring(0,8));
        Integer number8 = Integer.parseInt(numberString.substring(0,8));
        System.out.println(number8);
    }
}
