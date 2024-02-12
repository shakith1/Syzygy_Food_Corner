/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public class CompleteHandler extends OrderStepHandler {

    @Override
    public void handleOrder(Orders orders) {
        System.out.println("Order Completed");

        this.order_gui.displayCompleted(orders);

    }
}
