package main.TravelAgency.utils.Exceptions;

import main.TravelAgency.Models.Activity;

class ActivityFilledException extends CapacityReachedException{
    public ActivityFilledException(Activity activity){
        super(activity.toString());
    }
}