package main.TravelAgency.Models;

public class PremiumPassenger extends Passenger{

    public PremiumPassenger(String name, int passengerNumber, double balance, MembershipType type) {
        super(name, passengerNumber, balance, type);
       
    }
    public double moneyPaidForActivity(double activityCost){
    // for premium members no money is charged for booking
              return 0;
    }

}
