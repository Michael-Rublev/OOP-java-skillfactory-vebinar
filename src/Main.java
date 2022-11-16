public class Main {
    public static void main(String[] args) {
        Car mazda = new Car();
        mazda.brand = "Mazda";
        mazda.horsePower = 190;
        mazda.isAwd = false;
        mazda.start();
        mazda.setAcceleration(10);
        System.out.println(mazda.acceleration);
    }
}