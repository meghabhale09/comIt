package car_Pooling;

import car_Pooling.cars.Car;
import car_Pooling.roles.Role;
import car_Pooling.users.Location;
import car_Pooling.users.Person;
import car_Pooling.users.Reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  Exception{
        Role[] roles = new Role[]{new Role(1, "owner"), new Role(2, "rider")};

        Person owner1 = new Person(1,"Sam",roles[0]);
        Person owner2 = new Person(2,"Sam",roles[0]);
        Person rider1 = new Person(3,"Sam",roles[1]);
        Person rider2 = new Person(4,"Sam",roles[1]);

        Car car = new Car("2304", 3);
        Car car1 = new Car("1304", 2);



        List<Location> locations = new ArrayList<>();

        locations.add(new Location("Wilson Cres", "Downtown Terminal"));
        locations.add(new Location("Lawson Heights", "DownTown Terminal"));

        List<Reservation> reservations = new ArrayList<>();
        reservations.add(new Reservation(locations.get(0),car1, owner2, LocalDateTime.now()));
        reservations.add(new Reservation(locations.get(1),car, owner1, LocalDateTime.now()));

        Pooling pooling = new Pooling(reservations);

        pooling.bookRide(rider1,2,owner2,car1);



    }
}
