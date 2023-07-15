/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simplegame;

/**
 *
 * @author Ibrahim.Medhat
 */
public class PlayerOne {

    private String Name;
    private String Weapon;
    private int health;

    public PlayerOne(String Name) {
        this.Name = Name;
    }

    public PlayerOne() {
    }

    public PlayerOne(String Name, String Weapon, int health) {
        this.Name = Name;
        this.Weapon = Weapon;
        this.health = health;

        if (health < 0 || health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    public void damageByGunOne() {
        if (this.health == 0) {
            System.out.println(getName() + " Is dead");
        } else {
            this.health -= 30;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("You got hit by Gun 1 , Health reduced 30." + " New health is" + this.health);
            if (this.health == 0) {
                System.out.println(getName() + " Is dead");
            }
        }
    }

    public void damageByGunTwo() {
        if (this.health == 0) {
            System.out.println(getName() + " Already dead");
        } else {
            this.health -= 50;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("You got hit by Gun 2 , Health reduced 50." + "New health is" + this.health);
            if (this.health == 0) {
                System.out.println(getName() + " Is dead");
            }

        }
    }

    public void heal() {
        if (this.health <= 0) {
            System.out.println(getName() + " is dead. Heal not possible");
        } else {
            this.health = 100;
            System.out.println("health is " + this.health);
        }
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String Weapon) {
        this.Weapon = Weapon;
    }

    public int gethealth() {
        return health;
    }

    public void sethealth(int health) {
        this.health = health;
    }

}
