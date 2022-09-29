package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PizzaClassTest {
    PizzaClass obj;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        obj=new PizzaClass();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        obj=null;
    }

    @org.junit.jupiter.api.Test
    void givenNoPriceAndPriceOfPizzaCalculateTotalPriceSuccess() {
        assertEquals(25.00, obj.PizzaCalculate(2.00,12.50));
    }

    @org.junit.jupiter.api.Test
    void givenNoPriceAndPriceOfGarlicBreadCalculateTotalPriceSuccess() {
        assertEquals(10.50, obj.GarlicCalculate(2,5.25));
    }

    @org.junit.jupiter.api.Test
    void givenNoPriceAndPriceOfBeveragesCalculateTotalPriceSuccess() {
        assertEquals(7.90,obj.calculateBeverage(2,3.95));
    }
}