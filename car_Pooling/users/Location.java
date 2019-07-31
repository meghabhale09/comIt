package car_Pooling.users;


import java.time.LocalDateTime;

public class Location {

    private String start;
    private String destination;

    public Location(String start, String destination) {
           this.start = start;
           this.destination = destination;
    }

    public String getStart() {
        return start;
    }

    public String getDestination() {
        return destination;
    }
}
