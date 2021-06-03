package org.example.ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void pizzasSlicesPerPerson()
    {
        App mainApp = new App();

        int numberPizzas = 2;
        int numberPeople = 6;
        int numberSlices = 8;
        int totalSlices = numberPizzas * numberSlices;
        int slicesPerPerson = totalSlices / numberPeople;


        String expectedOutput =
                "6 people with 2 pizzas (16 slices).\n" +
                "Each person gets 2 slices of pizza.\n" +
                "There are 4 slices left over.";

        String actualOutput = mainApp.genOutputString(numberPeople, numberPizzas, totalSlices, slicesPerPerson);

        assertEquals(expectedOutput, actualOutput);

    }
}