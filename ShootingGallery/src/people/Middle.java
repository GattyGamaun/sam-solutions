package people;

public class Middle extends Person {

    @Override
    public boolean isHit() {

        double target = 0.05 * getExperience();

        if(target > 0.35 && target <= 0.5){
            return true;
        } else {
            return false;
        }
    }
}
