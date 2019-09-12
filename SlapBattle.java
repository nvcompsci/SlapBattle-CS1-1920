/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slapbattle;

import java.util.Scanner;

/**
 *
 * @author jword
 */
public class SlapBattle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your name?");
        String nombre = kb.nextLine();
        Player player = new Player(nombre);
        Player computer = new Player("computer");
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("Uh oh");
        }
    }
    
}
