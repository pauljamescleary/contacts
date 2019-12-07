package com.example.contacts;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        showMenu();
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        while (input != "q") {
            if (input.equalsIgnoreCase("i")) {
                // insert
                System.out.print("Enter name > ");
                String name = console.nextLine();
                System.out.print("Enter phone > ");
                String phone = console.nextLine();
                Contact newContact = new Contact(name, phone);

                // Where do I put this?
                System.out.println("!! TODO: PLEASE IMPLEMENT INSERT CONTACT !!");
            } else if (input.equalsIgnoreCase("d")) {
                // delete
                System.out.print("Enter contact name > ");
                String name = console.nextLine();

                System.out.println("!! TODO: PLEASE IMPLEMENT DELETE CONTACT !!");
            } else if (input.equalsIgnoreCase("r")) {
                // read
                System.out.print("Enter contact name > ");
                String name = console.nextLine();

                System.out.println("!! TODO: HOW DO I READ A CONTACT BY NAME !!");
            } else {
                System.out.println("\r\n!!! Invalid input, try again...");
            }

            // Continue until quit
            showMenu();
            input = console.nextLine();
        }
    }

    private static void showMenu() {
        System.out.println("******************************************");
        System.out.println("Welcome to the Contact List!!!\n");
        System.out.println("\tChoose from the following options:");
        System.out.println("\tType i to insert a new contact");
        System.out.println("\tType d to delete a contact by name");
        System.out.println("\tType r to lookup a contact by name");
        System.out.println("\tType q to quit");
        System.out.println("******************************************");
        System.out.print("Enter > ");
    }
}
