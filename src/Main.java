import incapsulation.Boat;

public class Main {
    public static void main(String[] args) {
        //Basic constructor
/*      Car mazda = new Car();
        mazda.brand = "Mazda";
        mazda.horsePower = 190;
        mazda.isAwd = false;
        mazda.setAcceleration(10)
        mazda.start();
        lamba.start();
        System.out.println(mazda.acceleration);
        ;*/

        //null constructor make only mazda default parameters in car class
/*        Car lamba = new Car("Lamba", 250, false, 20);
        System.out.println(mazda.countSpeed(5));
        System.out.println(lamba.countSpeed(5));
        float mazdaSpeed = mazda.countSpeed(7);
        System.out.println(mazdaSpeed);*/
        Rideable mazda = new Car();
        //Rideable boat = new Boat();
        rideRideable(new Car());
        //rideRideable(new Boat());
        //Transport transport = new Transport;
        //transport.publicVal;

    }

    public static void rideRideable(Rideable rideable) {
        rideable.ride();
    }
}