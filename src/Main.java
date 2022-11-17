public class Main {
    public static void main(String[] args) {
        Car sedan = new Car();
        rideRideable();
        Transport transport = new Transport();
        sedan.start();
    }

    public static void rideRideable(Rideable rideable) {
        rideable.ride();
    }
}