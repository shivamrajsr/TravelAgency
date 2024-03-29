package main.TravelAgency.Models;

import main.TravelAgency.utils.Exceptions.NotEnoughBalanceException;

import java.util.ArrayList;
import java.util.List;

public class Activity {
   private String name;
   private String description;
   private int cost;
   private int capacity;
   private boolean occupied;
   private List<Passenger> listOfPassengersSigned;
   
public Activity(String name, String description, int cost, int capacity) {
    this.name = name;
    this.description = description;
    this.cost = cost;
    this.capacity = capacity;
    this.occupied = false;
    this.listOfPassengersSigned = new ArrayList<>();
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

public boolean isOccupied() {
    return capacity >= listOfPassengersSigned.size() ? false: true;
}

// no of tickets left for this activity
public int getAvailibility(){
    return capacity - listOfPassengersSigned.size();

}
public void setOccupied(){
    if(listOfPassengersSigned.size()==capacity) 
    this.occupied = true;
}

public void addPassenger(Passenger pg) throws NotEnoughBalanceException {
    if (isOccupied()) {
        throw new IllegalStateException("No tickets left.");
    }
   else{
    double moneyToBePaid = pg.moneyPaidForActivity(cost);
    boolean joined = pg.signUpForActivity(moneyToBePaid);
    if(joined){
        this.listOfPassengersSigned.add(pg);
        System.out.println("passenger added in tis activity!!");
    }
    else{
        System.out.println("not enough balance case:");
        throw new NotEnoughBalanceException(pg.getName());
    }

   }
    setOccupied();

}


public List<Passenger> getListPassengersSigned() {
    return listOfPassengersSigned;
}

public void setListPassengersSigned(List<Passenger> listPassengersSigned) {
    this.listOfPassengersSigned = listPassengersSigned;
}


}
