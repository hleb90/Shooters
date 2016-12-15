package by.shilov.shooters.model;

import by.shilov.shooters.model.impl.MockShootersService;
import by.shilov.shooters.model.service.ShootersService;

import java.util.Collection;

/**
 * Created by Глеб on 15.12.2016.
 */
public class TheMain {

    private static final String RESULT_LABEL = "%s %d, age's experience = %d, is shot passed? = %b";

    public static void main(String[] args){

        ShootersService shootersService = new MockShootersService();
        Collection<AbstractShooters> shooterses = shootersService.getShooters();

        for (AbstractShooters shooter: shooterses)
        {
            System.out.println(String.format(RESULT_LABEL,
                    shooter.getName(),
                    shooter.getAge(),
                    shooter.getAgeExperience(),
                    shooter.passShot()));
        }
    }
}
