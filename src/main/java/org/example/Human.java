package org.example;

public class Human extends Organic{
    public Human(String type, int maxJump, int maxSprint, String genus) {
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
            System.out.println("Человек бежит на "+ sprint+" м");
        } else {
            System.out.println("Человек сходит с дистанции, не осилил пробежать"+sprint+" м");
        }
    }
    @Override
    void jumping(int jump) {
        if (jump <= maxJump) {
            System.out.println("Человек прыгает на "+ jump+" м");
        } else {
            System.out.println("Человек сходит с дистанции, не осилил прыгнуть "+jump+" м");
        }
    }
}