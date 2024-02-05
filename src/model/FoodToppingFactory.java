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
public class FoodToppingFactory {

    private static final HashMap<String, FoodTopping> TOPPING_POOL = new HashMap<>();

    public static FoodTopping addTopping(String topping) {
        FoodTopping toppingFood = TOPPING_POOL.get(topping);
        if (toppingFood == null) {
            switch (topping) {
                case FoodToppings.DECORATOR_CHEESE:
                    toppingFood = new Cheese();
                    break;
                case FoodToppings.DECORATOR_PRAWNS:
                    toppingFood = new Prawns();
                    break;
                case FoodToppings.DECORATOR_DEVILLED_CHICKEN:
                    toppingFood = new DevilledChicken();
                    break;
                case FoodToppings.DECORATOR_BELL_PEPPER:
                    toppingFood = new BellPepper();
                    break;
                case FoodToppings.DECORATOR_TOMATO:
                    toppingFood = new Tomato();
                    break;
                default:
                    break;
            }

            TOPPING_POOL.put(topping, toppingFood);
        }
        return toppingFood;
    }

}
