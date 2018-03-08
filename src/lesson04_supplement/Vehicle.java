package lesson04_supplement;

// Implementing Drivable_intf interface
// Extending Crashable_abs abstract class
public class Vehicle extends Crashable_abs implements Drivable_intf {

    int numOfWheels = 2;
    double theSpeed = 0;

    int carStrength = 0;

    // Any method tha is based on an interface
    // must be at least as visible as the interface itself
    // Everything in drivable is public method
    // Thus int getWheel() must be also public
    public int getWheel() {
        return this.numOfWheels;
    }

    public void setWheels(int numWheels){
        this.numOfWheels = numWheels;
    }

    public double getSpeed(){
        return this.theSpeed;
    }

    public void setSpeed(double speed) {
        this.theSpeed = speed;
    }

    public Vehicle(int wheels, double speed) {
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    public void setCarStrength(int strength) {
        this.carStrength = strength;
    }

    public int getCarStrength() {
        return this.carStrength;
    }
}
