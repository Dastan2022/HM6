package com.company;

public class Boss extends GameEntity{

    private Weapon weapon;

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
