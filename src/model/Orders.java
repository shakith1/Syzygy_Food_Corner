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
public class Orders {
    private boolean isAccepted;
    private boolean isCooked;
    private boolean isPacked;
    private boolean isHandedOver;
    
    private List<FoodOrder> orderList;

    public Orders(List<FoodOrder> orderList) {
        this.orderList = orderList;
    }

    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public boolean isIsCooked() {
        return isCooked;
    }

    public void setIsCooked(boolean isCooked) {
        this.isCooked = isCooked;
    }

    public boolean isIsPacked() {
        return isPacked;
    }

    public void setIsPacked(boolean isPacked) {
        this.isPacked = isPacked;
    }

    public boolean isIsHandedOver() {
        return isHandedOver;
    }

    public void setIsHandedOver(boolean isHandedOver) {
        this.isHandedOver = isHandedOver;
    }

    public List<FoodOrder> getOrderList() {
        return orderList;
    }
    
    
}
