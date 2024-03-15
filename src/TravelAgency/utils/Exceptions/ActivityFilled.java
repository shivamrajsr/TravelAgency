package TravelAgency.utils.Exceptions;

import TravelAgency.Models.Activity;

class ActivityFilled extends CapacityReachedException{
    public ActivityFilled(Activity activity){
        super(activity.toString());
    }
}