public class Car {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    //Added null constructor
    Car() {
       brand = "Mazda";
       horsePower = 0;
       isAwd = false;
       acceleration = 10;
    }

    //Added default constructor
    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }

    // Method void, start engine car
    void start() {
        System.out.println(brand + " hase been started");
    }

    //method acceleration (setter)
    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }
}
