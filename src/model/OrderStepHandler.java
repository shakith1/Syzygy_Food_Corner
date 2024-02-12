/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.ManageOrder;
import java.util.List;

/**
 *
 * @author nimsa
 */
public abstract class OrderStepHandler {

    protected OrderStepHandler handler;
    protected ManageOrder order_gui;

    public void setHanler(OrderStepHandler handler) {
        this.handler = handler;
    }

    public void setOrder_gui(ManageOrder order_gui) {
        this.order_gui = order_gui;
    }

    public abstract void handleOrder(Orders orders);
}
