package org.example;

//Домашнее задание на закрепление :
//      1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса но есть общий класс родитель.
// Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
//      2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//  должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//  печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
// (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//      3) Создайте два массива: с участниками и препятствиями, и  заставьте всех участников пройти
//  этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//  списку он препятствий не идет.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Runner[] race = new Runner[3];
        int[] barrier= new int[2];
        Robot t800  = new Robot("Робот",10,300,"т800");
        Human vasya = new Human("Животное",2,1000,"Человек");
        Cat scratchy = new Cat("Животное", 5,500, "Кот");
        Wall wall = new Wall();
        Track track = new Track();
        race[0]=t800;
        race[1]=vasya;
        race[2]=scratchy;
        barrier[0]=track.track;
        barrier[1]=wall.hight;
        System.out.println("НА СТАРТ ВЫХОДЯТ :");
        System.out.println(Arrays.toString(race));
        System.out.println("БУДУТ ПРЕОДОЛЕВАТЬ СТЕНУ "+barrier[0]+" м и трассу "+barrier[1]+ " м");

        for (Runner runner : race) {
            runner.run(barrier[0]);
            if (runner.maxSprint >= barrier[0]) {
                runner.jumping(barrier[1]);
            }
        }
        }
    }
