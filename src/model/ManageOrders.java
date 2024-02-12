/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.ManageOrder;

/**
 *
 * @author nimsa
 */
public class ManageOrders extends javax.swing.JPanel {

    protected ManageOrder manageOrder;
    protected Orders orders;
    protected OrderManagementGroup managementGroup;

    public ManageOrders(ManageOrder manageOrder, Orders orders, OrderManagementGroup managementGroup) {
        this.manageOrder = manageOrder;
        this.orders = orders;
        this.managementGroup = managementGroup;
    }

}
