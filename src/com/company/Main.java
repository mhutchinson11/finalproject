package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> product = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();

        product.add("Red-Hot Spicy Doritos");
        prices.add(2.99);
        product.add("Cool Ranch Doritos");
        prices.add(2.99);
        product.add("Coke");
        prices.add(0.99);
        product.add("Diet Coke");
        prices.add(0.99);
        product.add("Pepsi");
        prices.add(0.99);
        product.add("Five Hour Energy");
        prices.add(3.99);
        product.add("Sunflower Seeds");
        prices.add(0.99);
        product.add("Peanuts");
        prices.add(0.99);
        product.add("Mac Book Chargers");
        prices.add(120.00);
        product.add("Dell Chargers");
        prices.add(50.00);

        ArrayList<String> customerOrder = new ArrayList<String>();
        ArrayList<Integer> productQuantity = new ArrayList<Integer>();

        System.out.println("Welcome to COBIS Convenience Store!\n");
        System.out.println("The ten items offered are displayed below: ");
        System.out.println("\n Red-Hot Spicy Doritos" +
                "\n Cool ranch Doritos" +
                "\n Coke" +
                "\n Diet Coke" +
                "\n Pepsi" +
                "\n Five Hour Energy" +
                "\n Sunflower seeds" +
                "\n Peanuts" +
                "\n Mac Book Chargers" +
                "\n Dell Chargers");

        Scanner userinfo = new Scanner(System.in);
        String info;

        double total;
        double finalT = 0;
        String receipt = "";

        System.out.println("Enter your name: ");
        while (!(info = userinfo.nextLine()).equalsIgnoreCase("Done")) {

            System.out.println("Enter your snack choices or 'Done' to end order: ");
            total = 0;
            receipt += "\n" + info;

            while (!(info = userinfo.nextLine()).equalsIgnoreCase("Done")) {

                for (String i: product) {
                    if (i.contains(info) || i.equalsIgnoreCase(info)) {
                        total += prices.get(product.indexOf(i));
                        receipt += "\n\t" + info;

                        if (!customerOrder.contains(info)) {
                            customerOrder.add(info);
                            productQuantity.add(1);
                        }
                        else {
                            int d = customerOrder.indexOf(info);
                            productQuantity.set(d, productQuantity.get(d) + 1);
                        }

                        break;
                    }
                }
            }

            receipt += "\n\t\t" + String.format("%.2f", total) + "\n";
            finalT +=  total;
            System.out.println("\nEnter your name or 'Done' to end: ");
        }

        System.out.println("\nRECEIPT:" + receipt);
        System.out.println("\nINVENTORY SOLD: ");

        for (String a: customerOrder) {
            System.out.println("\t" + a + " (" + productQuantity.get(customerOrder.indexOf(a)) + ")");

        }
















    }


}
