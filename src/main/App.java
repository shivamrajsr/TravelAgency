package main;
import java.util.ArrayList;
import java.util.List;

import main.TravelAgency.Models.Destination;
import main.TravelAgency.Models.MembershipType;
import main.TravelAgency.Models.Passenger;
import main.TravelAgency.Models.TravelPackage;
import main.TravelAgency.Repo.TravelAgency;
import main.TravelAgency.constants.Constants;
import main.TravelAgency.service.TravelAgencyServiceImpl;

public class App {
    

    /**
     * <h1>Hello, World!</h1>
     * The App program implements an application that
     * lets travel agency manage their itenary and passengers.
     * <p>
     * @author  Shivam raj
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Constants.InitializeConstants();

        List<Destination> destinations = Constants.getDestinations();
        List<Passenger> passengers = Constants.getPassengers();
            
        TravelAgencyServiceImpl travelAgencyService = new TravelAgencyServiceImpl();
        travelAgencyService.initializeTravelAgency("MastMaulaTravels");
        travelAgencyService.getTravelAgency().addTravelPackage(
            new TravelPackage("Mazedaar", 100, destinations,passengers));
         
        travelAgencyService.printItenary("Mazedaar");
        travelAgencyService.printPassengerList("bxhhd");
        travelAgencyService.printPassengerList("Mazedaar");
        travelAgencyService.enrollInActivity(1, "Mazedaar", "game1", "Delhi");
        travelAgencyService.enrollInActivity(1, "Mazedaar", "game2", "Delhi");
        travelAgencyService.enrollInActivity(1, "Mazedaar", "game3", "Delhi");



    }
}
