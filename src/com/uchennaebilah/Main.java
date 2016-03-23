package com.uchennaebilah;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static GroceryList weekend = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int selection = 0;

        printGroceryInstructions();

        while(!quit) {
            System.out.println("Enter choice: ");
            selection = scan.nextInt();
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
                    weekend.modifyGroceryList(whichGroceryItem(weekend.listOfGroceries()), newGroceryItem());
                    break;

                case 4:
                    System.out.println("\nDeleting item from the grocery list...");
                    weekend.removeGroceryItem(whichGroceryItem(weekend.listOfGroceries()));
                    break;

                case 5:
                    System.out.println("\nSearching for item in the grocery list...");
                    String item = itemToSearch();
                    searchItem(weekend.scanList(item),item);
                    break;

                case 6:
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
        System.out.println("Enter new item to the grocery list:");
        return scan.nextLine();
    }

    public static String itemToSearch(){
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
        System.out.println("4 <--- Remove Item from Grocery List");
        System.out.println("5 <--- Search for item in Grocery List");
        System.out.println("6 <--- Exit the Grocery List app");

    }

    public static void searchItem(String status, String item) {
        if (status != null)
            System.out.println(status + " is already in your grocery list");
        else
            System.out.println(item + " is not in your grocery list");
    }
}
