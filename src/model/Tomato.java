/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public class Tomato implements FoodTopping {

    @Override
    public String getTitle() {
        return "Tomato";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
