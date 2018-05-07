package people;

public class Senior extends Person {

    @Override
    public boolean isHit() {
        double target = 0.9 - (0.01 * getExperience());

        if(target > 0.87 && target <= 0.8){
            return true;
        } else {
            return false;
        }
    }
}
