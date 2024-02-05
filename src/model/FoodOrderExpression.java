/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public abstract class FoodOrderExpression {

    protected Food food;

    public FoodOrderExpression(Food food) {
        this.food = food;
    }
   
    public abstract FoodTopping interpret();
}
