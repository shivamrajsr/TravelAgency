package main.TravelAgency.utils.Exceptions;

import javax.naming.NameNotFoundException;

public class PassengerNotFoundException extends NameNotFoundException{
    public PassengerNotFoundException(String name){
        super(name + " not found!");
    }
}
