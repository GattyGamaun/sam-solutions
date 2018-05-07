package people;

public class Junior extends Person {

    @Override
    public boolean isHit() {

        double target = 0.01 * getExperience();

        if(target >= 0.07 && target <= 0.1){
            return true;
        } else {
            return false;
        }
    }
}
