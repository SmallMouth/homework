package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Input is not number, Please enter number");
            return;
        }
        int numT = scanner.nextInt();
        if (numT <= 0) {
            System.out.println("Please enter number > 0");
            return;
        }
        System.out.println("How many round-trip tickets:  ");
        scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Input is not number, Please enter number");
            return;
        }
        int numRT = scanner.nextInt();
        if (numRT > numT) {
            System.out.println("round-trip tickets number > total tickets");
            return;
        }
        new Ticket(numT,numRT).printPrice();
    }
}
