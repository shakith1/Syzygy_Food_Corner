/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public class Prawns extends FoodTopping {

    public Prawns(Food food) {
        super(food);
    }

    @Override
    public String getTitle() {
        return "Prawns";
    }

    @Override
    public double getPrice() {
        return this.food.getPrice() + 300;
    }

}
