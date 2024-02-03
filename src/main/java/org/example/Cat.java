package org.example;

public class Cat extends Organic{
    public Cat(String type, int maxJump, int maxSprint, String genus) {
        super(type, maxJump, maxSprint, genus);
    }
    @Override
    public String toString() {
        return super.type + " "+ super.genus+
                " прыгает на " + maxJump +
                " м пробегает " + maxSprint + " м";
    }
    @Override
    void run(int sprint) {
        if (sprint <= maxSprint) {
            System.out.println("Кот бежит на "+ sprint+" м");
        } else {
            System.out.println("Кот сходит с дистанции, не осилил пробежать "+sprint+" м");
        }
    }
    @Override
    void jumping(int jump) {
        if (jump <= maxJump) {
            System.out.println("Кот прыгает на "+ jump+" м");
        } else {
            System.out.println("Кот сходит с дистанции, не осилил прыгнуть "+jump+" м");
        }
    }
}