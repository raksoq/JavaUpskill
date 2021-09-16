import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.round;

public class Meal {
    double mealCost;
    int tipPercent;
    int taxPercent;

    public Meal() {
    }

    public Meal(double mealCost, int tipPercent, int taxPercent) {
        this.mealCost = mealCost;
        this.tipPercent = tipPercent;
        this.taxPercent = taxPercent;
    }

    public double getMealCost() {
        return mealCost;
    }

    public void setMealCost(double mealCost) {
        this.mealCost = mealCost;
    }

    public int getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(int tipPercent) {
        this.tipPercent = tipPercent;
    }

    public int getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(int taxPercent) {
        this.taxPercent = taxPercent;
    }

    public void InteractiveSolution() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Meal Cost, Tip Percent and Tax Percent below: ");
        mealCost = Double.parseDouble(bufferedReader.readLine().trim());
        tipPercent = Integer.parseInt(bufferedReader.readLine().trim());
        taxPercent = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("The price is: " + InteractiveCalculate());
        bufferedReader.close();

    }

    public int Calculate(){
        double tip = mealCost * tipPercent/100;
        double taxes = mealCost * taxPercent/100;
        return (int) round(mealCost + tip + taxes);
    }

    public int InteractiveCalculate(){
        double tip = mealCost * tipPercent/100;
        double taxes = mealCost * taxPercent/100;
        return (int) round(mealCost + tip + taxes);
    }


}
