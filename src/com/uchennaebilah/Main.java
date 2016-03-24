package com.uchennaebilah;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static GroceryList weekend = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int selection = 0;

        printGroceryInstructions();

        while(!quit) {
            System.out.println("Enter choice: ");

            try{
                selection = scan.nextInt();
            }
            catch (Exception e){
                System.out.println("Wrong selection. Please enter only digits.");
            }

            scan.nextLine();

            switch (selection){
                case 0:
                    System.out.println("\nPrinting grocery instructions...");
                    printGroceryInstructions();
                    break;

                case 1:
                    System.out.println("\nPrinting grocery list...");
                    weekend.printGroceryList();
                    break;

                case 2:
                    System.out.println("\nAdding item to the grocery list...");
                    weekend.addGroceryItem(newGroceryItem());
                    break;

                case 3:
                    System.out.println("\nModifying item in the grocery list...");
                    weekend.modifyGroceryList(newGroceryItem());
                    break;

                case 4:
                    System.out.println("\nDeleting item from the grocery list...");
                    // weekend.removeGroceryItem(whichGroceryItem(weekend.listOfGroceries()));
                    weekend.removeGroceryItem(newGroceryItem());
                    break;

                case 5:
                    System.out.println("\nDeleting item from the grocery list...");
                    weekend.removeGroceryItem(whichGroceryItem(weekend.listOfGroceries()));
                    break;

                case 6:
                    System.out.println("\nSearching for item in the grocery list...");
                    searchItem(itemToSearchFor());
                    break;

                case 7:
                    System.out.println("\nExiting grocery list app...");
                    quit = true;
                    break;

                default:
                    System.out.println("\nInvalid entry. Please try again.");
                    break;
            }
        }
    }

    public static int whichGroceryItem(int maxNum){
        System.out.println("Enter the number corresponding to the item in the grocery list that you want to change/remove:");
        int num = scan.nextInt();
        scan.nextLine();

        if (num <= maxNum)
            return (num-1);
        else
            return -1;
    }

    public static String newGroceryItem(){
        System.out.println("Enter item:");
        return scan.nextLine();
    }

    public static String itemToSearchFor(){
        System.out.println("Enter item to search for in the grocery list:");
        return scan.nextLine();
    }

    public static void printGroceryInstructions(){
        System.out.println("GROCERY LIST INSTRUCTIONS");
        System.out.println("=========================\\n\n");
        System.out.println("Press:");
        System.out.println("0 <--- Print Grocery List Instructions");
        System.out.println("1 <--- Print Grocery List");
        System.out.println("2 <--- Add Item to Grocery List");
        System.out.println("3 <--- Modify Item in Grocery List");
        System.out.println("4 <--- Remove Item from Grocery List (by name)");
        System.out.println("5 <--- Remove Item from Grocery List (by number)");
        System.out.println("6 <--- Search for item in Grocery List");
        System.out.println("7 <--- Exit the Grocery List app");

    }

    public static void searchItem(String item) {

        int status = weekend.scanList(item);

        if (status >= 0)
            System.out.println(item + " is already in your grocery list");
        else
            System.out.println(item + " is not in your grocery list");
    }
}
