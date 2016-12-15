package by.shilov.shooters.model;

/**
 * Created by Глеб on 15.12.2016.
 */
public class SeniorShooter extends AbstractShooters {
    private static final double UNLUCKY_PERCENT = 0.9;

    public SeniorShooter(String name, int age, int ageExperience) {
        super(name, age, ageExperience);
    }

    @Override
    public boolean passShot() {
        if (Math.random() <= ageExperience){
            return true;
        }else {
            return false;
        }
    }

    public double getPropability(int ageExperience){
        return UNLUCKY_PERCENT - age / 100;
    }
}
