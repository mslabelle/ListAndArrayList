package com.uchennaebilah;

import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        GroceryList weekend = new GroceryList();

        weekend.addGroceryItem("Eggs");
        weekend.addGroceryItem("Flour");
        weekend.addGroceryItem("Milk");
        weekend.addGroceryItem("Butter");

        weekend.printGroceryList();

        weekend.modifyGroceryList(whichGroceryItem(weekend.listOfGroceries()),newGroceryItem());
        weekend.printGroceryList();
        weekend.removeGroceryItem(whichGroceryItem(weekend.listOfGroceries()));
        weekend.printGroceryList();
    }

    public static int whichGroceryItem(int maxNum){
        System.out.println("Enter the number corresponding to the item in the grocery list that you want to change:");
        int num = s.nextInt();

        if (num <= maxNum)
            return (num-1);
        else
            return -1;
    }

    public static String newGroceryItem(){
        System.out.println("Enter new item to the grocery list:");
        return s.next();
    }
}
