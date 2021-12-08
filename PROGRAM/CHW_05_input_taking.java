package com.company;

import java.util.Scanner;

public class CHW_05_input_taking {
    public static void main(String[] args) {
        /* STARTING ALWAYS HARDER ! */

        System.out.println("! Taking input from the user :");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 :");
        int a = sc.nextInt();

        System.out.println("Enter Number 2 :");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("The Sum Of Two Number Is :");
        System.out.println(sum);

    }
}
