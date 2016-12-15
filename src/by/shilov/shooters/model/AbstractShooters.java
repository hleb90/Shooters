package by.shilov.shooters.model;

import java.util.Objects;

/**
 * Created by Глеб on 15.12.2016.
 */
public abstract class AbstractShooters {
    String name;
    int age;
    int ageExperience;

    public AbstractShooters(String name, int age, int ageExperience) {
        this.name = name;
        this.age = age;
        this.ageExperience = ageExperience;
    }

    public abstract boolean passShot();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAgeExperience() {
        return ageExperience;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractShooters that = (AbstractShooters) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(ageExperience,
                that.ageExperience);
    }

    public String toString(){
        return "AbstractStudent{"
                + "name='" + name + '\''
                + ", age='" + age + '\''
                + ", ageExperience='" + ageExperience + '\'' + "}"
                + ", is exam passed? Result = " + passShot();
    }
}
