/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simplegame;

/**
 *
 * @author Ibrahim.Medhat
 */
public class PlayerTwo extends PlayerOne {

    private int health;
    private final boolean armour;

    public PlayerTwo(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGunOne() {
        if (armour) {
            this.health -= 20;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20."
                    + " New health is " + this.health);
        }
        if (!armour) {
            this.health -= 30;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 30."
                    + " New health is " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + " Is dead");
        }
    }

    @Override
    public void damageByGunTwo() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 40."
                    + " New health is " + this.health);
        }
        if (!armour) {
            this.health -= 50;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is off. Got hit by gun 1 , Health is reduced by 50."
                    + " New health is " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + " Is dead");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
