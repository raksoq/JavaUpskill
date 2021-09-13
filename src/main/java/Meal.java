import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.round;

public class Meal {
    double mealCost;
    int tipPercent;
    int taxPercent;

    public void Solution() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        mealCost = Double.parseDouble(bufferedReader.readLine().trim());
        tipPercent = Integer.parseInt(bufferedReader.readLine().trim());
        taxPercent = Integer.parseInt(bufferedReader.readLine().trim());
        Result.solve(mealCost, tipPercent, taxPercent);
        bufferedReader.close();

    }

}

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent/100;
        double taxes = meal_cost * tax_percent/100;

        System.out.println(round(meal_cost + tip + taxes));

    }

}