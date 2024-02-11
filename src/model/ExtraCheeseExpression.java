/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.FoodToppings;

/**
 *
 * @author nimsa
 */
public class ExtraCheeseExpression extends FoodOrderExpression{

    public ExtraCheeseExpression(Food food) {
        super(food);
    }

    @Override
    public Food interpret() {
        FoodTopping topping = FoodToppingFactory.addTopping(FoodToppings.DECORATOR_CHEESE);
        this.food.addTopping(topping);
        return this.food;
    }
    
}
