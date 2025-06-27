package com.lohithpuvvala;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "notes.txt";
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        while(true){
            System.out.println("\n====== Notes App ======");
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
        System.out.println("Enter your note (type 'END' on a new line to finish'):");
        try(FileWriter writer = new FileWriter(FILE_NAME, true)){
            String line;
            while(!(line = in.nextLine()).equalsIgnoreCase("END")){
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving note: " + e.getMessage());
        }
    }

    private static void viewNotes() {
        System.out.println("\n--- Your Notes ---");
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            boolean hasNotes = false;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                hasNotes = true;
            }
            if(!hasNotes){
                System.out.println("No notes found.");
            }
        }catch (FileNotFoundException e) {
            System.out.println("No notes files found yet.");
        }catch (IOException e) {
            System.out.println("Error reading notes: " + e.getMessage());
        }
    }
}
