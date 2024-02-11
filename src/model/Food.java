/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author nimsa
 */
public abstract class Food {

    private String image;
    private double price;
    private ArrayList<FoodTopping> foodToppingList;

    public Food() {
        foodToppingList = new ArrayList();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void addTopping(FoodTopping foodTopping) {
        foodToppingList.add(foodTopping);
    }

    public ArrayList<FoodTopping> getFoodToppingList() {
        return foodToppingList;
    }
    
    public abstract String getTitle();

    public abstract String getDescription();

    public double getPrice(){
        double price = this.price;
        
        for (FoodTopping foodTopping : foodToppingList) {
            price+= foodTopping.getPrice();
        }
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

}
