/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex8;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App mainApp = new App();

        int numberPeople = mainApp.getNumPeople();
        int numberPizzas = mainApp.getNumPizza();
        int numberSlices = mainApp.getNumSlices();

        int totalSlices = numberSlices * numberPizzas;
        int slicesPerPerson = totalSlices / numberPeople;

        String outputString = genOutputString(numberPeople, numberPizzas, totalSlices, slicesPerPerson);
        System.out.println(outputString);
    }

    public Integer getNumPeople()
    {
        System.out.println("How many people?");

        // Read and return an integer.
        return in.nextInt();
    }

    public Integer getNumPizza()
    {
        System.out.println("How many pizzas?");

        // Read and return an integer.
        return in.nextInt();
    }

    public Integer getNumSlices()
    {
        System.out.println("How many slices per pizza?");

        // Read and return an integer.
        return in.nextInt();
    }

    public static String genOutputString(int numberPeople, int numberPizzas, int totalSlices, int slicesPerPerson)
    {
        return String.format("%d people with %d pizzas (%d slices).\nEach person gets %d slices of pizza.\nThere are %d slices left over.", numberPeople,numberPizzas,totalSlices,slicesPerPerson, (totalSlices % numberPeople));
    }
}
