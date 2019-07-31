package car_Pooling.cars;

public class Car {
    private String car_Number;
    private  int available_Seats;


    public Car(String car_Number, int available_Seats) {
        this.car_Number = car_Number;
        this.available_Seats = available_Seats;
    }

    public String getCar_Number() {
        return car_Number;
    }

    public int getAvailable_Seats(int requiredSeats) {
        return available_Seats;
    }

    public boolean reserveSeat(int seatCount){
        if(available_Seats >= seatCount){
            available_Seats -= seatCount;
            return true;
        }
        return false;
    }

    public void releaseSeat(int seatCount) throws Exception {
            available_Seats += seatCount;
    }



}
