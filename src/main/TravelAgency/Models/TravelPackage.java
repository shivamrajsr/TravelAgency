package main.TravelAgency.Models;

import java.util.List;

public class TravelPackage{
    private String id;
    private int capacity;
    private List<Destination> itenary;
    private List<Passenger> passengers;

    public TravelPackage(String id,int capacity, List<Destination> itenary, List<Passenger> passengers) {
        this.id = id;
        this.capacity = capacity;
        this.itenary = itenary;
        this.passengers = passengers;
    }
    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public List<Destination> getItenary() {
        return itenary;
    }
    public void setItenary(List<Destination> itenary) {
        this.itenary = itenary;
    }
    public void addDestination(Destination destination){
        this.itenary.add(destination);
    }
    public void removeDestination(Destination destination){
        this.itenary.remove(destination);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
    
}