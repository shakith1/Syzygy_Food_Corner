/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public class FoodOrder {

    private final Food food;
    private final String size;
    private final int qty;

    private FoodOrder(FoodOrder.Builder builder) {
        this.food = builder.food;
        this.size = builder.size;
        this.qty = builder.qty;
    }

    public Food getFood() {
        return food;
    }

    public String getSize() {
        return size;
    }

    public int getQty() {
        return qty;
    }
  
    public static class Builder {

        private Food food;
        private String size;
        private int qty;

        public Builder setFood(Food food) {
            this.food = food;
            return this;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setQty(int qty) {
            this.qty = qty;
            return this;
        }
        
        public FoodOrder build(){
            return new FoodOrder(this);
        }
    }
}
