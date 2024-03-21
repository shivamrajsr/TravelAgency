package main.TravelAgency.utils.Exceptions;

public class NotEnoughBalanceException extends  Exception{
    public NotEnoughBalanceException(String passengerName){
        super("Passenger "+ passengerName + " doesn't have sufficient balance!!");
    }
}
