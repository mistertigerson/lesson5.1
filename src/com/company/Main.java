package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Boss boss = new Boss();
        boss.setHealth(1100);
        boss.setDamage(100);
        boss.setDefense("чистый");
        System.out.println("Здоровье Босса " + boss.getHealth() + " урон " + boss.getDamage() + " тип защиты " +
                "" + boss.getDefense());
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Урон "+createHeroes()[i].getDamage() + " Здоровье " + createHeroes()[i].getHealth());
        }
    }

    public static Hero[] createHeroes() {
        Hero emberSpirit = new Hero(60, 180);
        emberSpirit.setDamage(20);
        emberSpirit.setHealth(150);
        Hero slark = new Hero(150, 100);
        slark.setDamage(27);
        slark.setHealth(100);
        Hero dragonKnight = new Hero(70, 300);
        dragonKnight.setHealth(140);
        dragonKnight.setDamage(25);
        return new Hero[] {emberSpirit, slark, dragonKnight};
    }

}