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

    public List<Activity> getListOfActivities() {
        return listOfActivities;
    }

    public void addActivity(Activity activity){
        this.listOfActivities.add(activity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Destination: " + name + "\n");
            for (Activity activity : listOfActivities) {
                sb.append(activity.getName() + "\n");
            }
            return sb.toString();
    }

}
