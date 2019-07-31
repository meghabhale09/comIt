package car_Pooling;

import car_Pooling.cars.Car;
import car_Pooling.users.Person;
import car_Pooling.users.Reservation;

import java.util.List;

public class Pooling {
    private  List<Reservation> pool;

   // private List<Person> riders;

    public Pooling(List<Reservation> reservations) {
        this.pool = reservations;
    }


    public Reservation bookRide(Person rider, int seat, Person owner,Car car) throws  Exception{
        return this.pool.stream()
                .filter(reservation -> reservation.getOwner().getId()==(owner.getId()))
                .filter(reservation -> reservation.getCar().reserveSeat(seat))
                .findFirst()
                .map(selectedRide -> new Reservation(selectedRide.getLocation(),selectedRide.getCar(),selectedRide.getOwner(),selectedRide.getTripTime()))
                .orElseThrow(() -> new IllegalArgumentException("No Rides Available"));

    }
}
