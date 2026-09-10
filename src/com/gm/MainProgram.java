package com.gm;

import java.util.Scanner;

// Base Class
class MenuItem {
    private String itemName;
    private int itemID;
    private String category;
    private double price;

    // Getters & Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item ID: " + itemID);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

// Derived Class 1
class Beverage extends MenuItem {
    private double caffeineContent;

    public double getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(double caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Caffeine Content: " + caffeineContent);
    }
}

// Derived Class 2
class MainCourse extends MenuItem {
    private int calories;
    private String cuisineType;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Calories: " + calories);
        System.out.println("Cuisine Type: " + cuisineType);
    }
}

// Main Class
public class MainProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice (Beverage / MainCourse):");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Beverage")) {

            Beverage b = new Beverage();
            System.out.println("Enter details in CSV format:");
            System.out.println("itemName,itemID,category,price,caffeineContent");

            String input = sc.nextLine();
            String[] data = input.split(",");

            b.setItemName(data[0]);
            b.setItemID(Integer.parseInt(data[1]));
            b.setCategory(data[2]);
            b.setPrice(Double.parseDouble(data[3]));
            b.setCaffeineContent(Double.parseDouble(data[4]));

            System.out.println("\n--- Beverage Details ---");
            b.display();

        } else if (choice.equalsIgnoreCase("MainCourse")) {

            MainCourse m = new MainCourse();
            System.out.println("Enter details in CSV format:");
            System.out.println("itemName,itemID,category,price,calories,cuisineType");

            String input = sc.nextLine();
            String[] data = input.split(",");

            m.setItemName(data[0]);
            m.setItemID(Integer.parseInt(data[1]));
            m.setCategory(data[2]);
            m.setPrice(Double.parseDouble(data[3]));
            m.setCalories(Integer.parseInt(data[4]));
            m.setCuisineType(data[5]);

            System.out.println("\n--- Main Course Details ---");
            m.display();

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}