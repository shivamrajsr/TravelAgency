package TravelAgency.service;

import TravelAgency.Models.Passenger;
import TravelAgency.Models.TravelPackage;

interface TravelAgencyService {
    public void initializeTravelAgency(String id);
    public void printItenary(String packageId);
    public void printPassengerList(String packageId);
    public void printDetailsOfPassenger(Passenger passenger);
    public void printAvailableActivity(TravelPackage travelPackage);
}
