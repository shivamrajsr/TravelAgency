package main.TravelAgency.constants;

import java.util.ArrayList;
import java.util.List;

import main.TravelAgency.Models.Activity;
import main.TravelAgency.Models.Destination;
import main.TravelAgency.Models.MembershipType;
import main.TravelAgency.Models.Passenger;

public class Constants {
    private static List<Destination> destinations = new ArrayList<>();
    private static List<Passenger> passengers = new ArrayList<>();
    private  static  List<Activity> allActivities = new ArrayList<>();

    public static void InitializeConstants (){
            destinations.add(new Destination("Delhi"));
            destinations.add(new Destination("Bengalore"));
            destinations.add(new Destination("Mumbai"));
            destinations.add(new Destination("Chennai"));

            passengers.add(new Passenger("anda kumar", 1, 20, MembershipType.STANDARD));
            passengers.add(new Passenger("gobi kumar", 2, 70, MembershipType.GOLD));
            passengers.add(new Passenger("aloo kumar", 3, 120, MembershipType.STANDARD));
            passengers.add(new Passenger("muli kumar", 4, 50, MembershipType.PREMIUM));
            passengers.add(new Passenger("kela kumar", 5, 60, MembershipType.PREMIUM));
            passengers.add(new Passenger("seb kumar", 6, 100, MembershipType.STANDARD));
            passengers.add(new Passenger("amrood kumar", 7, 200, MembershipType.STANDARD));
            passengers.add(new Passenger("gandu kumar", 8, 20, MembershipType.PREMIUM));
            passengers.add(new Passenger("adrak kumar", 9, 40, MembershipType.GOLD));

            allActivities.add(new Activity("game1","oaoaooa",10,10));
            allActivities.add(new Activity("game2","hahhha",8,5));
            allActivities.add(new Activity("game3","ttattat",6,2));

        destinations.get(0).addActivity(allActivities.get(0));
        destinations.get(0).addActivity(allActivities.get(1));
        destinations.get(0).addActivity(allActivities.get(2));
        allActivities.add(new Activity("game4","maammama",12,4));
        allActivities.add(new Activity("game5","gagaggaga",15,7));
        destinations.get(1).addActivity(allActivities.get(3));
        destinations.get(1).addActivity(allActivities.get(4));

        allActivities.add(new Activity("game6","dadadda",20,1));
        destinations.get(2).addActivity(allActivities.get(5));

        allActivities.add(new Activity("game7","lllalall",12,6));
        allActivities.add(new Activity("game8","yayyyayya",4,8));

        destinations.get(3).addActivity(allActivities.get(6));
        destinations.get(3).addActivity(allActivities.get(7));

    }
    public static List<Destination> getDestinations() {
        return destinations;
    }

    public static List<Passenger> getPassengers() {
        return passengers;
    }          
}
