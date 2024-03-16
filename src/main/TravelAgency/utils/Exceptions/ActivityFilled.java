package main.TravelAgency.utils.Exceptions;

import main.TravelAgency.Models.Activity;

class ActivityFilled extends CapacityReachedException{
    public ActivityFilled(Activity activity){
        super(activity.toString());
    }
}