/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");

        double tax = 0;
        double preTax = 0;


        //input
        System.out.println("What is the order amount?" );
        String strAmount = scan.nextLine();

        double amount = Double.parseDouble(strAmount);

        System.out.println("What state do you live in?" );
        String state = scan.nextLine();

        if (state.equals("Wisconsin"))
        {
            System.out.println("What county do you live in?");
            String county = scan.nextLine();
            tax = 0.05;
            if (county.equals("Eau Claire"))
            {
                tax = tax + 0.005;
            }
            else if (county.equals("Dunn"))
            {
                tax = tax + 0.004;
            }
            preTax = tax * amount;
            amount = amount * (1+tax);
        }
        else if (state.equals("Illinois"))
        {
            tax = 0.08;
            preTax = tax * amount;
            amount = amount * (1+tax);
        }

        String taxes = ("$" +df.format(preTax));
        String amounts = ("$" +df.format(amount));
        System.out.println("The tax is " +taxes+ ". \nThe total is " +amounts+ ".");
    }
}
