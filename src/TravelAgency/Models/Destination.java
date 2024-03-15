package TravelAgency.Models;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> listOfActivities;

    public Destination(String name) {
        this.name = name;
        this.listOfActivities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getListOfActivities() {
        return listOfActivities;
    }

    public void setListOfActivities(List<Activity> listOfActivities) {
        this.listOfActivities = listOfActivities;
    }

    public void addActivity(Activity activity){
        this.listOfActivities.add(activity);
    }
    
    public void removeActivity(Activity activity){
        this.listOfActivities.remove(activity);
    }

    
}
