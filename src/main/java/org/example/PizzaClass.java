package org.example;

import java.util.Scanner;

public class PizzaClass {
       double PizzaCalculate(double noOfPizza, double priceOfPizza) {
        priceOfPizza = 12.50;


        double totalPriceOfPizza = priceOfPizza * noOfPizza;
        return totalPriceOfPizza;
    }

        double GarlicCalculate(double noOfGarlicBread, double priceOfGarlicBread) {
            priceOfGarlicBread = 5.25;

            double totalPriceOfGarlicBread = priceOfGarlicBread * noOfGarlicBread;
            return totalPriceOfGarlicBread;
        }

        double calculateBeverage(double noOfBeverage, double priceOfBeverage) {
            priceOfBeverage = 3.95;

            double totalPriceOfBeverage = noOfBeverage * priceOfBeverage;
            return totalPriceOfBeverage;
        }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PizzaClass obj = new PizzaClass();
        System.out.println("Please enter number Pizza");
        double noOfPizza = in.nextDouble();
        System.out.println("Please enter number Garlic Bread");
        double noOfGarlicBread = in.nextDouble();
        System.out.println("Please enter number Beverages");
        double noOfBeverage = in.nextDouble();
        double totalPizzaPrice=obj.PizzaCalculate( noOfPizza,12.99);
        double totalGarliBreadPrice=obj.GarlicCalculate(noOfGarlicBread,5.99);
        double totalBeveragePrice=obj.calculateBeverage(noOfBeverage,3.95);
        System.out.println("Total Price of Pizza : " +totalPizzaPrice);
        System.out.println("Total Price of Garlic Bread: " +totalGarliBreadPrice);
        System.out.println("Total Price of Beverages: " +totalBeveragePrice);

    }
}