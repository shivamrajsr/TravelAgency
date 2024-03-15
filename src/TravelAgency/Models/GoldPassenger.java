package TravelAgency.Models;

public class GoldPassenger extends Passenger{

    public GoldPassenger(String name, int passengerNumber, double balance, MembershipType type) {
        super(name, passengerNumber, balance, type);
    }
    
    @Override
    public double moneyPaidForActivity(double activityCost){
        return activityCost * 0.9;
    }

    
}
