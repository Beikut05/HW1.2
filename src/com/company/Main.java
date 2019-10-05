package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String myText = "Hello!";
        System.out.println(myText);
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello," + name);


    }
}
