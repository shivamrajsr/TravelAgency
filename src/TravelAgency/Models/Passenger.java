package TravelAgency.Models;

import java.util.ArrayList;
import java.util.List;

public class Passenger {

    private String name;
    private int passengerNumber;
    private double balance;
    private MembershipType type;
    private List<Activity> activitiesSignedFor;
    
    

    public Passenger(String name, int passengerNumber, double balance, MembershipType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.type = type;
        this.activitiesSignedFor = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Activity> getActivitiesSignedFor() {
        return activitiesSignedFor;
    }

    public void addActivity(Activity activity){
          this.activitiesSignedFor.add(activity);
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public MembershipType getType() {
        return type;
    }

    public void setType(MembershipType type) {
        this.type = type;
    }

    public double moneyPaidForActivity(double activityCost){

        switch(this.type){
            case STANDARD:  
                  return activityCost;
            case GOLD:
                  return activityCost * 0.9;
            case PREMIUM:
                  return 0;
            default: 
                  return -1;     
        }
    }
    public boolean signUpForActivity(double activityCost){

        double discountedCost = moneyPaidForActivity(activityCost);
        return deductBalance(discountedCost);
    }

    public boolean deductBalance(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
}


