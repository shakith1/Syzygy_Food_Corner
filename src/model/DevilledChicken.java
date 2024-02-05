/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public class DevilledChicken extends FoodTopping {

    public DevilledChicken(Food food) {
        super(food);
    }

    @Override
    public String getTitle() {
        return "Devilled Chicken";
    }

    @Override
    public double getPrice() {
        return this.food.getPrice() + 400;
    }

}
