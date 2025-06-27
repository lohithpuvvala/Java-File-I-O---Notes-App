package com.lohithpuvvala;

import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "notes.txt";
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        while(true){
            System.out.print("ln====== Notes App ======");
            System.out.println("1. Write a new Note");
            System.out.println("2. View Notes");
            System.out.println("Enter your choice: ");

            choice = in.nextInt();
            in.nextLine();//consume newline

            switch (choice){
                case 1:
                    writeNotes();
                    break;
                case 2:
                    viewNotes();
                    break;
                default:
                    System.out.println("Invalid Choice, Try Again");
            }

            System.out.print("\nDo you want to exit the app? (Y/N): ");
            String exit = in.nextLine();
            if(exit.equalsIgnoreCase("Y")){
                System.out.println("Exiting the app...Thank You.");
                return;
            }


        }
    }

    private static void writeNotes() {
    }

    private static void viewNotes() {
    }
}
