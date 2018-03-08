package lesson04_supplement;
// Youtube: Derek Banas, Java: Abstract, Interface

/**
 * Java does not allow to inherit from multiple different classes
 * That is where Interfaces and Abstract classes come in
 * This is an Interface
 *
 * What do you do if you want to
 * add a method to a class that is already inheriting?
 * you would use interface
 */

// If you want to modify a noun (class)
    // you use adjective (interface)
public interface Drivable_intf {

    // IF is simple empty class that tells you
    // which methods you MUST implement, if you want to use this IF

    double PI = 3.14; // You can never change this value, that is just how interface behaves

    // These methods have to be defined if you want to use this interface
    // This method is by default "public abstract int getWheel();
    int getWheel();

    void setWheels(int numWheels);

    double getSpeed();

    void setSpeed(double speed);

}
