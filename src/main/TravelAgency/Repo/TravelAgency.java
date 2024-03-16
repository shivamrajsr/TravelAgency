package main.TravelAgency.Repo;

import java.util.ArrayList;
import java.util.List;

import main.TravelAgency.Models.Passenger;
import main.TravelAgency.Models.TravelPackage;

public class TravelAgency {

    private String id;
    private List<TravelPackage> lisOfTravelPackages;
    private List<Passenger> allPassengers;

    
    private static volatile TravelAgency instance;

    // initializing a travel agency
    private TravelAgency(String id) {
        this.id = id;
        this.lisOfTravelPackages = new ArrayList<>();
        this.allPassengers = new ArrayList<>();
    }
    
    public static TravelAgency getInstance(String id) {
        TravelAgency result = instance;
        if (result == null) {
            //synchronized ensures only one thread can access the instance at a time
            synchronized (TravelAgency.class) {
                result = instance;
                if (result == null) {
                    instance = result = new TravelAgency(id);
                }
            }
        }
        else {
            System.out.println("Travel agency is already initialized.");
        }
        return result;
    }

    
    public TravelPackage getPackage(String packageId) {

         TravelPackage travelPackage = null;
          for(TravelPackage tp : lisOfTravelPackages){
            // if the input id type are different to that in class we use  equals operator
            if(tp.getId().equals(packageId)){
                travelPackage = tp;
                break;
            }
          }

          return travelPackage;

    }

    public List<TravelPackage> getLisOfTravelPackages() {
        return lisOfTravelPackages;
    }


    public void setLisOfTravelPackages(List<TravelPackage> lisOfTravelPackages) {
        this.lisOfTravelPackages = lisOfTravelPackages;
    }


    public List<Passenger> getAllPassengers() {
        return allPassengers;
    }
    
    public void addTravelPackage(TravelPackage newTravelPackage){
        this.lisOfTravelPackages.add(newTravelPackage);
        System.out.println("A new travel package added to "+ this.id+  " travel agency database!!");
    }


    public void setAllPassengers(List<Passenger> allPassengers) {
        this.allPassengers = allPassengers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
