package org.example;

public class Robot extends Runner{
    private final String model;
    public Robot(String type, int maxJump, int maxSprint, String model) {
        super(type, maxJump, maxSprint);
        this.model = model;
    }
    @Override
    public String toString() {
        return super.type + " "+
                "модель " + model +
                " прыгает на " + maxJump +
                "м пробегает " + maxSprint + " м";
    }
    @Override
    void run(int sprint) {
        if (sprint <= maxSprint) {
            System.out.println("Робот бежит на "+ sprint+" м");
        } else {
            System.out.println("Робот сходит с дистанции, не осилил пробежать "+sprint+" м");
        }
    }
    @Override
    void jumping(int jump) {
        if (jump <= maxJump) {
            System.out.println("Робот прыгает на "+ jump+" м");
        } else {
            System.out.println("Робот сходит с дистанции, не осилил прыгнуть "+jump+" м");
        }
    }
}
