/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public abstract class FoodTopping extends Food{
    protected Food food;

    public FoodTopping(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return "Food Toppings";
    }
    
    public Food getOriginalFood(){
        if(food instanceof FoodTopping){
            return ((FoodTopping) food).getOriginalFood();
        }
        return food;
    }

//    @Override
//    public void setPrice(double price) {
//        super.setPrice(price);
//        food.setPrice(price);
//    }
//    
    
}
