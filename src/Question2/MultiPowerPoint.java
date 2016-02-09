package Question2;

import Question2.Appliances.Toaster;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dg1613 on 05/02/16.
 */
public class MultiPowerPoint {

    private List<ApplianceAdapter> applianceList;

    public MultiPowerPoint() {
        applianceList = new ArrayList<>();
    }

    public void addAppliance(ApplianceAdapter appliance) {
        applianceList.add(appliance);
    }

    /*Method to call power on, on all appliances.*/
    public void turnOnAll() {
        for (ApplianceAdapter ap : applianceList) {
            ap.powerOn();
        }
    }

    /*Method to call power off, on all appliances.*/
    public void turnOffAll() {
        for (ApplianceAdapter ap : applianceList) {
            ap.powerOff();
        }
    }

}
