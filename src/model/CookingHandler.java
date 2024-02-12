/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author nimsa
 */
public class CookingHandler extends OrderStepHandler {

    @Override
    public void handleOrder(Orders orders) {
        System.out.println("Order is being cooked");
        if(orders.isIsCooked()){
            this.handler.handleOrder(orders);
        }else{
            this.order_gui.displayCooking(orders);
        }
    }
}
