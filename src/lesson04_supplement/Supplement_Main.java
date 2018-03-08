package lesson04_supplement;

public class Supplement_Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle(4,100.00);

        System.out.println("Cars speed:  " + car.getSpeed());
        System.out.println("Cars wheels: " + car.getWheel());

        car.setCarStrength(10);
        System.out.println("Str");
    }
}
