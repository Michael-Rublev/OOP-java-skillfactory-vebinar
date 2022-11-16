public class Main {
    public static void main(String[] args) {
        //Basic constructor
/*      Car mazda = new Car();
        mazda.brand = "Mazda";
        mazda.horsePower = 190;
        mazda.isAwd = false;
        mazda.setAcceleration(10);*/

        //null constructor make only mazda default parameters in car class
        Car mazda = new Car();
        Car lamba = new Car("Lamba", 250, false, 20);
        System.out.println(mazda.countSpeed(5));
        System.out.println(lamba.countSpeed(5));
        //mazda.start();
        //lamba.start();
        //System.out.println(mazda.acceleration);
    }
}