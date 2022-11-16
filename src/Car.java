public class Car {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;


    // Method void, start engine car
    void start() {
        System.out.println(brand + " hase been started");
    }

    //method acceleration (setter)
    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }
}
