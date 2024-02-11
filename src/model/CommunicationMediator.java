/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public class CommunicationMediator {
    private Customer customer;
    private OrderManagementGroup orderManagement;

    public CommunicationMediator(Customer customer, OrderManagementGroup orderManagement) {
        this.customer = customer;
        this.orderManagement = orderManagement;
    }
    
    public void notifyOrderManagement(String message){
        orderManagement.viewMessage(message);
    }
    
    public void notifyCustomer(String message){
        customer.recieveMessage(message);
    }
}
