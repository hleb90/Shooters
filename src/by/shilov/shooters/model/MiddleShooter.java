package by.shilov.shooters.model;

/**
 * Created by Глеб on 15.12.2016.
 */
public class MiddleShooter extends AbstractShooters{
    private static final double UNLUCKY_PERCENT = 0.05;

    public MiddleShooter(String name, int age, int ageExperience)
    {
        super(name, age, ageExperience);
    }

    @Override
    public boolean passShot()
    {
        if (Math.random() <= getPropability(ageExperience)){
            return true;
        }else {
            return false;
        }
    }

    public double getPropability(int ageExperience){
        return ageExperience * UNLUCKY_PERCENT;
    }
}
