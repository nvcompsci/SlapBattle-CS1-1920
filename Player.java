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
        //initialize
        this.name = n;
        this.health = (int) (Math.random() * 100);
        this.strength = (int) (Math.random() * 100);
        this.lives = 1;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
