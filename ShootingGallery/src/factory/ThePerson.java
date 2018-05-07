package factory;

import people.Junior;
import people.Middle;
import people.Senior;

public class ThePerson {

    Junior junior;
    Middle middle;
    Senior senior;

    public Junior createJunior(String name, int age) {
        junior = new Junior();
        junior.setName(name);
        junior.setAge(age);
        junior.setExperience((int)(Math.random() * 10 + 1));
        return junior;
    }

    public Middle createMiddle(String name, int age) {
        middle = new Middle();
        middle.setName(name);
        middle.setAge(age);
        middle.setExperience((int)(Math.random() * 10 + 1));
        return middle;
    }

    public Senior createSenior(String name, int age) {
        senior = new Senior();
        senior.setName(name);
        senior.setAge(age);
        senior.setExperience((int)(Math.random() * 10 + 1));
        return senior;
    }

}
