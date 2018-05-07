import factory.ThePerson;
import people.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> array = new ArrayList<>();

        ThePerson thePerson = new ThePerson();

        array.add(thePerson.createJunior("Ivan", 19));
        array.add(thePerson.createMiddle("Denis", 25));
        array.add(thePerson.createSenior("Oleg", 32));
        array.add(thePerson.createJunior("Sergey", 20));
        array.add(thePerson.createMiddle("Anton", 28));
        array.add(thePerson.createSenior("Vlad", 34));
        array.add(thePerson.createJunior("Andrew", 18));

        Iterator<Person> iterator = array.iterator();

        while (iterator.hasNext()){
            Person winner = iterator.next();
            if (winner.isHit()) {
                System.out.println(winner);
                break;
            }
        }
    }
}
