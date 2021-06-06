/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner principle = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String principleS = principle.nextLine();
        double principleD = Double.parseDouble(principleS);

        Scanner roi = new Scanner(System.in);
        System.out.print("Enter the rate of interest: ");
        String roiS = roi.nextLine();
        double roiD = Double.parseDouble(roiS);

        Scanner years = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        String yearsS = years.nextLine();
        int yearsI = Integer.parseInt(yearsS);

        double interest = (principleD * roiD * yearsI)/100;

        double finalAmount = principleD + interest;

        System.out.format("After %d years at %.2f%%, the investment will be worth $%.2f.", yearsI, roiD, finalAmount);
    }
}