package TravelAgency.Models;

import java.util.ArrayList;
import java.util.List;

public class Activity {
   private String name;
   private String description;
   private int cost;
   private int capacity;
   private Destination destination;
   private boolean occupied;
   private List<Passenger> listPassengersSigned;
   
public Activity(String name, String description, int cost, int capacity,Destination destination) {
    this.name = name;
    this.description = description;
    this.cost = cost;
    this.capacity = capacity;
    this.destination = destination;
    this.occupied = false;
    this.listPassengersSigned = new ArrayList<>();
}



public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public int getCost() {
    return cost;
}

public void setCost(int cost) {
    this.cost = cost;
}

public int getCapacity() {
    return capacity;
}

public void setCapacity(int capacity) {
    this.capacity = capacity;
}

public Destination getDestination() {
    return destination;
}

public void setDestination(Destination destination) {
    this.destination = destination;
}


public boolean isOccupied() {
    return capacity >= listPassengersSigned.size() ? false: true;
}

// no of tickets left for this activity
public int getAvailibility(){
    return capacity - listPassengersSigned.size();

}
public void setOccupied(){
    if(listPassengersSigned.size()==capacity) 
    this.occupied = true;
}

public void addPassenger(Passenger pg){
    this.listPassengersSigned.add(pg);
    // everytime it calls setOccupied when a passenger sign up for it
    setOccupied();

}



public List<Passenger> getListPassengersSigned() {
    return listPassengersSigned;
}



public void setListPassengersSigned(List<Passenger> listPassengersSigned) {
    this.listPassengersSigned = listPassengersSigned;
}


}
