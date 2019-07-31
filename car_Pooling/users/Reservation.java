package car_Pooling.users;

import car_Pooling.cars.Car;

import java.time.LocalDateTime;

public class Reservation {
    private Location location;
    private Car car;
    private Person owner;
    private Person rider;
    private LocalDateTime tripTime;

    public Reservation(Location location, Car car, Person owner, LocalDateTime tripTime) {
        this.location = location;
        this.car = car;
        this.owner = owner;
        this.tripTime = tripTime;
    }

    public Location getLocation() {
        return location;
    }

    public Car getCar() {
        return car;
    }

    public Person getOwner() {
        return owner;
    }

    public LocalDateTime getTripTime() {
        return tripTime;
    }


}
