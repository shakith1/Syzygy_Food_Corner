/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import util.FoodToppings;

/**
 *
 * @author nimsa
 */
public interface FoodTopping {

//    protected Food food;
//
////    protected FoodTopping(Food food) {
////        this.food = food;
////    }
//
//    public FoodTopping addFood(Food food) {
//        this.food = food;
//        return this;
//    }

    public abstract String getTitle();
    public abstract double getPrice();

//    public Food getOriginalFood() {
//        if (food instanceof FoodTopping) {
//            return ((FoodTopping) food).getOriginalFood();
//        }
//        return food;
//    }

//    @Override
//    public void setPrice(double price) {
//        super.setPrice(price);
//        food.setPrice(price);
//    }
//    
}
