package main.TravelAgency.service;

import main.TravelAgency.Models.Passenger;
import main.TravelAgency.Models.TravelPackage;
import main.TravelAgency.utils.Exceptions.PassengerNotFoundException;

interface TravelAgencyService {
    public void initializeTravelAgency(String id);
    public void printItenary(String packageId);
    public void printPassengerList(String packageId);
    public void printDetailsOfPassenger(Passenger passenger);
    public void printAvailableActivity(TravelPackage travelPackage);
    public void enrollInActivity(int passengerNumber,String packageId,String activityName, String destination) throws PassengerNotFoundException;
}
