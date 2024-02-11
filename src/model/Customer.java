/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.ClientMessage;
import gui.ClientTextMessage;
import gui.OrderManagementTextMessage;

/**
 *
 * @author nimsa
 */
public class Customer extends UserComponent{
    private ClientTextMessage clientTextMessage;
    private OrderManagementTextMessage orderManagementTextMessage;
    private ClientMessage message;

    public Customer(ClientMessage message) {
        this.message = message;
    }
    
    public void sendMessage(String message){
        showMessage(message);
        this.mediator.notifyOrderManagement(message);
    }
    
    public void recieveMessage(String message){
        showRetrievedMessaage(message);
    }
    
    private void showMessage(String message){
        clientTextMessage = new ClientTextMessage(message);
        this.message.addMessage(clientTextMessage);
    }
    
    private void showRetrievedMessaage(String message){
        orderManagementTextMessage = new OrderManagementTextMessage(message);
        this.message.addMessage(orderManagementTextMessage);
    }
}
