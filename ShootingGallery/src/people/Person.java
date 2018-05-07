package people;

public abstract class Person {

    private String name;
    private int age;
    private int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0 && experience < 11) {
            this.experience = experience;
        } else {
            System.out.println("Please, enter a number from 1 to 10");
        }

    }

    public abstract boolean isHit();

    @Override
    public String toString() {
        return getName() + ", " + getAge() + " target: " + getExperience();
    }
}
