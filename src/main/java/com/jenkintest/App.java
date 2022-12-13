package com.jenkintest;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.print("Type something: ");
        Scanner input = new Scanner(System.in);
        System.out.println(checkInput(input.nextLine()));
    }

    public static String checkInput(String input) {
        return "You typed: " + input;
    }
}
