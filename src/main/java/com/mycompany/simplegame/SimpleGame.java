/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.simplegame;

/**
 *
 * @author Ibrahim.Medhat
 */
public class SimpleGame {

    public static void main(String[] args) {
        PlayerOne p1 = new PlayerOne("Ahmed", "Sniper", 100);
       
        p1.getName();
        p1.getWeapon();
        p1.gethealth();

//        PlayerTwo p2 = new PlayerTwo("mohamed", "AKM", 100, true);
//        p2.damageByGunOne();
//        p2.damageByGunTwo();
//        p2.getName();
//        p2.getWeapon();
//        p2.gethealth();

    }
}
