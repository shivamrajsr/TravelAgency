import java.util.ArrayList;
import java.util.List;

import TravelAgency.Models.Destination;
import TravelAgency.Models.MembershipType;
import TravelAgency.Models.Passenger;
import TravelAgency.Models.TravelPackage;
import TravelAgency.Repo.TravelAgency;
import TravelAgency.constants.Constants;
import TravelAgency.service.TravelAgencyServiceImpl;

public class App {
    

    /**
     * <h1>Hello, World!</h1>
     * The App program implements an application that
     * lets travel agency manage their itenary and passengers.
     * <p>
     * @author  Shivam raj
     * @version 1.0
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Constants.InitializeConstants();

        List<Destination> destinations = Constants.getDestinations();
        List<Passenger> passengers = Constants.getPassengers();
            
        TravelAgencyServiceImpl travelAgencyService = new TravelAgencyServiceImpl();
        travelAgencyService.initializeTravelAgency("MastMaulaTravels");
        travelAgencyService.getTravelAgency().addTravelPackage(
            new TravelPackage("Mazedaar", 50, destinations,passengers));
         
        travelAgencyService.printItenary("Mazedaar");
        travelAgencyService.printPassengerList("bxhhd");
        travelAgencyService.printPassengerList("Mazedaar");
    }
}
