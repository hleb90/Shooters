package by.shilov.shooters.model.impl;

import by.shilov.shooters.model.AbstractShooters;
import by.shilov.shooters.model.JuniorShooter;
import by.shilov.shooters.model.MiddleShooter;
import by.shilov.shooters.model.SeniorShooter;
import by.shilov.shooters.model.service.ShootersService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Глеб on 15.12.2016.
 */
public class MockShootersService implements ShootersService{

    private Set<AbstractShooters> shooters = new HashSet<>();
    public MockShootersService()
    {
        shooters = new HashSet<>();
        fillWithTestData();
    }

    @Override
    public Collection<AbstractShooters> getShooters() {
        return shooters;
    }

    public void fillWithTestData(){
        AbstractShooters shooters1 = new JuniorShooter("Mike", 25, 5);
        AbstractShooters shooters2 = new MiddleShooter("Nicky", 34, 13);
        AbstractShooters shooters3 = new SeniorShooter("Jossic", 56, 38);
        AbstractShooters shooters4 = new JuniorShooter("Tory", 43, 23);
        AbstractShooters shooters5 = new MiddleShooter("Glen", 54, 39);
        AbstractShooters shooters6 = new SeniorShooter("Jossic", 56, 38);
        AbstractShooters shooters7 = new JuniorShooter("Roger", 20, 4);
        shooters.add(shooters1);
        shooters.add(shooters2);
        shooters.add(shooters3);
        shooters.add(shooters4);
        shooters.add(shooters5);
        shooters.add(shooters6);
        shooters.add(shooters7);
    }
}
