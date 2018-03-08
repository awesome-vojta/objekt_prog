package lesson04_supplement;

// Abstract is used whenever you want some methods to be used but not all

public abstract class Crashable_abs {
    boolean carDrivable = true; // not a constant like in interface

    public void youCrashed(){
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int strength);
    public abstract int getCarStrength();

}
