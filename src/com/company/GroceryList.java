package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }


    public void printGroceryList() {
        System.out.println("you have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));

        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        } else System.out.println(item + " is not in the shopping list");
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);

    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){

        return groceryList.contains(searchItem);
    }
}
