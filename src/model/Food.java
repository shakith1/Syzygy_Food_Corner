/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public abstract class Food {

    private String image;
    private double price;

    public Food() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public abstract String getTitle();

    public abstract String getDescription();

    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

}
