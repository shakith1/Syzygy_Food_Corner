/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public abstract class OrderStepHandler {
    protected OrderStepHandler handler;

    public void setHanler(OrderStepHandler handler) {
        this.handler = handler;
    }
    
    public abstract void handleOrder(FoodOrder order);
}
