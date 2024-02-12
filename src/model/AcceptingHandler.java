/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import util.Messages;

/**
 *
 * @author nimsa
 */
public class AcceptingHandler extends OrderStepHandler {
    
    @Override
    public void handleOrder(Orders orders) {
         System.out.println("Order is accepted");
         if(orders.isIsAccepted()){
             this.handler.handleOrder(orders);
         }else{
             this.order_gui.displayAccepting(orders);
         }
    }
    
}
