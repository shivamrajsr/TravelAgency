package main.TravelAgency.utils.Exceptions;

public class CapacityReachedException extends Exception{
    public CapacityReachedException (String name){
        super(name + ": Capacity reached!!");
    }
}
