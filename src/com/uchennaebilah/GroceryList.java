package com.uchennaebilah;

import java.util.ArrayList;


/**
 * Created by Uchenna on 3/23/2016.
 */

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        if (scanList(item) < 0) {
            groceryList.add(item.toLowerCase());
            System.out.println(item + " has been added to your grocery list.");
        }
        else
            System.out.println(item + " is already on your grocery list.");
    }

    public void printGroceryList(){
        System.out.println("There are " + groceryList.size() + " items in your grocery list.");

        for (int i=0;i<groceryList.size();i++){
            System.out.println("\t" + (i+1) + ") " + groceryList.get(i).toUpperCase());
        }
    }

    public void modifyGroceryList(String newItem){
        int element = scanList(newItem);

        if (element >=0){
            modifyGroceryList(element,newItem);
        }
        else {
            System.out.println(newItem + " is not in your grocery list.");
        }
    }

    private void modifyGroceryList(int number, String newItem){
        if (number == -1) {
            System.out.println("No such corresponding item number.");
            addGroceryItem(newItem);
        }
        else {
            groceryList.set(number,newItem);
            System.out.println("Grocery list item " + (number + 1) + " has been modified.");
        }
    }

    public void removeGroceryItem(String newItem){
        int element = scanList(newItem);

        if (element >=0){
            removeGroceryItem(element);
        }
        else {
            System.out.println(newItem + " is not in your grocery list.");
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

    public int scanList(String item){
        return groceryList.indexOf(item.toLowerCase());
    }
}