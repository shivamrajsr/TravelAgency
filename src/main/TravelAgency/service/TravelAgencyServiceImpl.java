package main.TravelAgency.service;

import java.util.List;
import java.util.NoSuchElementException;

import main.TravelAgency.Models.Activity;
import main.TravelAgency.Models.Destination;
import main.TravelAgency.Models.Passenger;
import main.TravelAgency.Models.TravelPackage;
import main.TravelAgency.Repo.TravelAgency;
import main.TravelAgency.utils.Exceptions.PassengerNotFoundException;

public class TravelAgencyServiceImpl implements TravelAgencyService {
     private TravelAgency travelAgency;
     
     private static volatile TravelAgencyServiceImpl instance;

    @Override
    public void initializeTravelAgency(String id) {
        // to initialize a travel agency
        this.travelAgency = TravelAgency.getInstance(id);
 
    }
    public static TravelAgencyServiceImpl getInstance() {
        TravelAgencyServiceImpl result = instance;
        if (result == null) {
            //synchronized ensures only one thread can access the instance at a time
            synchronized (TravelAgencyServiceImpl.class) {
                result = instance;
                if (result == null) {
                    instance = result = new TravelAgencyServiceImpl();
                }
            }
        }
        return result;
    }

    public TravelAgency getTravelAgency() {
        return this.travelAgency;
    }

    @Override
    public void printItenary(String packageId) throws NoSuchElementException {

        TravelPackage tp = this.travelAgency.getPackage(packageId);
        if(tp==null){
            throw new NoSuchElementException("Travel package with this id does not exist.");
        }
        else {
            System.out.println("Printing the package with id: "+ packageId);
        }

    }


    @Override
    public void printPassengerList(String id) {
        TravelPackage tp  = travelAgency.getPackage(id);
        if(tp==null){
            System.out.println("travel package with id: "+ id + " doesnt't exist.");
            return;
        }

        List<Passenger> passengers = tp.getPassengers();

        if(passengers.size()!=0){
            System.out.println("Below passengers are travelling:");
        for(Passenger pg: passengers){
            System.out.println("name: "+ pg.getName()+ "\nnumber: "+ pg.getPassengerNumber());
        }}
        System.out.println("Total capacity of this travel package is: "+ tp.getCapacity());
        System.out.println("number of passenger enrolled: "+ passengers.size());
        System.out.println("Total Remaining seats: "+ (tp.getCapacity() - tp.getPassengers().size()));

    }


    @Override
    public void printAvailableActivity(TravelPackage travelPackage) {

        for(Destination destination: travelPackage.getItenary()){
            for(Activity ac: destination.getListOfActivities()){
                if(ac.isOccupied()){
                    System.out.println("Activity with name: " + ac.getName() + " is occupied");
                }
                else{
                    System.out.println("Activity with name: " + ac.getName() + " has "+ ac.getAvailibility() + " tickets left. Hurry up!!");
                }

            }
        }

    }

    @Override
    public void printDetailsOfPassenger(Passenger passenger) {
        System.out.println("name: " + passenger.getName() + "\nPassengerNumber: "+ passenger.getPassengerNumber()+ "\nBalance: " + passenger.getBalance());
        System.out.println("Activities signed up for:");
        for(Activity activity : passenger.getActivitiesSignedFor()){
            System.out.println(activity.getName());
        }
    }
    
    @Override
    public void enrollInActivity(int passengerNumber,String packageId,String activityName, String destination) throws PassengerNotFoundException {
        
          TravelPackage tp = travelAgency.getPackage(packageId);
          Passenger psg = null;
          for(Passenger pg: tp.getPassengers()){
            if(pg.getPassengerNumber() == passengerNumber){
                  psg =  pg;
                  break;
            }
          }

          if(psg == null) {
            throw new PassengerNotFoundException("Passenger");}
            else{
            System.out.println("Passenger is enrolled in this travel Package");
          }
          Destination destination2 = null;
          for(Destination  dstn: tp.getItenary()){
            if(dstn.getName()==destination){
                    destination2 = dstn;
                    break;
            }
          }
          Activity activity = null;
          for(Activity ac : destination2.getListOfActivities()){
            if(ac.getName() == activityName){
                activity = ac;
                break;
            }
          }
          activity.addPassenger(psg);
       


    }

    
}
