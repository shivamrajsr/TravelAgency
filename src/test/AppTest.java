package test;


import org.junit.Test;

import java.util.List;
import java.util.NoSuchElementException;

import main.TravelAgency.Models.Destination;
import main.TravelAgency.Models.Passenger;
import main.TravelAgency.Models.TravelPackage;
import main.TravelAgency.constants.Constants;
import main.TravelAgency.service.TravelAgencyServiceImpl;

import main.TravelAgency.utils.Exceptions.PassengerNotFoundException;

public class AppTest {

    /**
     * @throws PassengerNotFoundException
     * 
     */
    @Test(expected = PassengerNotFoundException.class)
    public void checkInRollActivity() throws PassengerNotFoundException
    {

        Constants.InitializeConstants();

        List<Destination> destinations = Constants.getDestinations();
        List<Passenger> passengers = Constants.getPassengers();
            
        TravelAgencyServiceImpl travelAgencyService = new TravelAgencyServiceImpl();
        TravelAgencyServiceImpl travelAgencyService2 = TravelAgencyServiceImpl.getInstance();

        travelAgencyService.initializeTravelAgency("MastMaulaTravels");
        travelAgencyService.getTravelAgency().addTravelPackage(
            new TravelPackage("Mazedaar", 100, destinations,passengers));

       
        travelAgencyService2.enrollInActivity(76, "Mazedaar", "abcd", "Mumbai");

        
    }

    @Test(expected = NoSuchElementException.class)
    public void NoPackageIdTest(){
        TravelAgencyServiceImpl travelAgencyService = TravelAgencyServiceImpl.getInstance();
        travelAgencyService.initializeTravelAgency("MastMaulaTravels");
        travelAgencyService.getTravelAgency().addTravelPackage(
            new TravelPackage("Mazedaar", 100, Constants.getDestinations(),Constants.getPassengers()));

            travelAgencyService.printItenary("ABc");

    }
    
}
