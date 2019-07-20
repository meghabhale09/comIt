public class Car {
    private String model;
    private int year;
    private String brand , make;
    private  int speed;

    public Car(String model, int year, String brand, String make, int speed) {
        this.model = model;
        this.year = year;
        this.brand = brand;
        this.make = make;
        this.speed = speed;
    }

    public void accelerate(int speed){
        this.speed = speed;
    }

    public void stop(){
        this.speed = 0;
    }

    public boolean isStopped(){
        return this.speed == 0;
    }

    public int currentSpeed(){
        return this.speed;
    }
}
