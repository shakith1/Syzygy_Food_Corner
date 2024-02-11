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
public final class Command {

    public Food interpretExpression(String command, Food food) {

        FoodOrderExpression expression;
        Food food_ = null;

        switch (command) {
            case FoodToppings.DECORATOR_CHEESE:
                expression = new ExtraCheeseExpression(food);
                food_ = expression.interpret();
                break;
            case FoodToppings.DECORATOR_BELL_PEPPER:
                expression = new ExtraBellPepperExpression(food);
                food_ = expression.interpret();
                break;
            case FoodToppings.DECORATOR_DEVILLED_CHICKEN:
                expression = new ExtraDevilledChickenExpression(food);
                food_ = expression.interpret();
                break;
            case FoodToppings.DECORATOR_PRAWNS:
                expression = new ExtraPrawnsExpression(food);
                food_ = expression.interpret();
                break;
            case FoodToppings.DECORATOR_TOMATO:
                expression = new ExtraTomatoExpression(food);
                food_ = expression.interpret();
                break;
        }
        return food_;
    }
}
