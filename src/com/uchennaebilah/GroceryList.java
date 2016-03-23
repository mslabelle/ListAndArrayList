package com.uchennaebilah;

import java.util.ArrayList;


/**
 * Created by Uchenna on 3/23/2016.
 */

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
        System.out.println(item + " has been added to your grocery list.");
    }

    public void printGroceryList(){
        System.out.println("There are " + groceryList.size() + " items in your grocery list.\n\nNamely: \r");

        for (int i=0;i<groceryList.size();i++){
            System.out.println("\t" + (i+1) + ") " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int number, String newItem){
        if (number == -1) {
            System.out.println("No such corresponding item number.");
            addGroceryItem(newItem);
        }
        else {
            groceryList.set(number,newItem);
            System.out.println("Grocery list item " + (number + 1) + " has been modified.");
        }
    }

    public void removeGroceryItem(int number){
        if (number == -1) {
            System.out.println("No such corresponding item number.");
        }
        else {
            String getItem = groceryList.get(number);
            groceryList.remove(number);
            System.out.println(getItem + " has been removed from your grocery list.");
        }
    }

    public int listOfGroceries(){
        return groceryList.size();
    }
}