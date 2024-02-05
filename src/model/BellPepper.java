/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public class BellPepper extends FoodTopping {

    public BellPepper(Food food) {
        super(food);
    }

    @Override
    public String getTitle() {
        return "Bell Pepper";
    }

    @Override
    public double getPrice() {
        return this.food.getPrice() + 120;
    }
}
