/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nimsa
 */
public abstract class UserComponent {
    protected CommunicationMediator mediator;

    public void setMediator(CommunicationMediator mediator) {
        this.mediator = mediator;
    }
}
