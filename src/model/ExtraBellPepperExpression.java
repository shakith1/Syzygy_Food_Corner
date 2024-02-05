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
public class ExtraBellPepperExpression extends FoodOrderExpression {

    public ExtraBellPepperExpression(Food food) {
        super(food);
    }

    @Override
    public FoodTopping interpret() {
        FoodTopping topping = FoodToppingFactory.addTopping(FoodToppings.DECORATOR_BELL_PEPPER);
        this.food.addTopping(topping);
        return topping;
    }

}
