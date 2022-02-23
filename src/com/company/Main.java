package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Weapon weapon=new Weapon();
        weapon.setNameOfWeapon("AK47");
        boss.setWeapon(weapon);
        System.out.println("Здоровье " + boss.getHealth() + "\n Урон " + boss.getDamage() +"\n"+boss.getWeapon().getNameOfWeapon());

    }
    private static Boss boss = new Boss(25,50);
}
