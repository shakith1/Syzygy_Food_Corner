/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public class PackingHandler extends OrderStepHandler {

    @Override
    public void handleOrder(FoodOrder order) {
        System.out.println("Order is being packed. Moving to handover to driver step.");
        this.handler.handleOrder(order);
    }
}
