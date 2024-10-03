package com.pluralsight.donuts;

public class DonutShop {

    public static void main(String[] args) {
        Donut d = new Donut();
        d.description = "Fluffy Donut";
        d.calories = 499;
        d.price = 3.99;

        Donut d2 = new Donut();
        d2.description = "Choco donut";
        d2.calories = 599;
        d2.price = 4.99;

        printDonut(d);
        printDonut(d2);
    }

    public static void printDonut(Donut d){
        System.out.println(d.description);
        System.out.printf(" which cost $%.2f\n", d.price);
    }

}
