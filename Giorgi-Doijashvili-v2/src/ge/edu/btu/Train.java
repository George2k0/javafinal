package ge.edu.btu;
import java.util.ArrayList;
import java.util.List;

public class Train {
    public List<Passenger> passengerList = new ArrayList<>();

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public boolean AddPassenger(Passenger passenger) {
        boolean result = false;

        if (passenger.haveTicket()) {
            result = passengerList.add(passenger);
        }
        return result;
    }
}