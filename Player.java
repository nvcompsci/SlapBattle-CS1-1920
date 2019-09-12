/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slapbattle;

/**
 *
 * @author jword
 */
public class Player {
    //Fields - Declare
    private int health;
    private int strength;
    private int lives;
    private String name;
    
    //Constructor
    public Player(String n) {
        this.name = n;
        this.health = (int) (Math.random() * 100);
        this.strength = (int) (Math.random() * 100);
        this.lives = 1;
    }
}
