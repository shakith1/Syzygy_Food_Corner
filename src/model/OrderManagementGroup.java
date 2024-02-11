/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.ClientTextMessage;
import gui.OrderManagement;
import gui.OrderManagementMessage;

/**
 *
 * @author nimsa
 */
public class OrderManagementGroup extends UserComponent{
    private ClientTextMessage sendMessage;
    private OrderManagement management;

    public OrderManagementGroup(OrderManagement management) {
        this.management = management;
    }

    public void viewMessage(String message){
        management.addMessage(message);
    }
    
    public void sendMessage(String message){
        management.addSendingMessage(message);
        this.mediator.notifyCustomer(message);
    }
}
