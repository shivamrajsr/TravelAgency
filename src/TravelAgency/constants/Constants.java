package TravelAgency.constants;

import java.util.ArrayList;
import java.util.List;

import TravelAgency.Models.Destination;
import TravelAgency.Models.MembershipType;
import TravelAgency.Models.Passenger;

public class Constants {
    private static List<Destination> destinations = new ArrayList<>();
    private static List<Passenger> passengers = new ArrayList<>();

    public static void InitializeConstants (){
        
            destinations.add(new Destination("Delhi"));
            destinations.add(new Destination("Bengalore"));
            destinations.add(new Destination("Mumbai"));
            destinations.add(new Destination("Chennai"));

            passengers.add(new Passenger("anda kumar", 1, 100, MembershipType.STANDARD));
            passengers.add(new Passenger("gobi kumar", 2, 70, MembershipType.GOLD));
            passengers.add(new Passenger("aloo kumar", 3, 120, MembershipType.STANDARD));
            passengers.add(new Passenger("muli kumar", 4, 50, MembershipType.PREMIUM));
            passengers.add(new Passenger("kela kumar", 5, 60, MembershipType.PREMIUM));
            passengers.add(new Passenger("seb kumar", 6, 100, MembershipType.STANDARD));
            passengers.add(new Passenger("amrood kumar", 7, 200, MembershipType.STANDARD));
            passengers.add(new Passenger("gandu kumar", 8, 20, MembershipType.PREMIUM));
            passengers.add(new Passenger("adrak kumar", 9, 40, MembershipType.GOLD));
    

    }
    public static List<Destination> getDestinations() {
        return destinations;
    }

    public static List<Passenger> getPassengers() {
        return passengers;
    }          
}
