package main.TravelAgency.Models;

public class StandardPassenger extends Passenger{

    public StandardPassenger(String name, int passengerNumber, int balance, MembershipType type) {
        super(name, passengerNumber, balance, type);
    }

    @Override
    public double moneyPaidForActivity(double activityCost){
       return activityCost;
    }
     
}
