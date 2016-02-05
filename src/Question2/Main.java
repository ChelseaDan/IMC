package Question2;

import Question2.Appliances.Blender;
import Question2.Appliances.Oven;
import Question2.Appliances.Toaster;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        MultiPowerPoint multiPowerPoint = new MultiPowerPoint();
        multiPowerPoint.addAppliance(new ToasterAdapter(new Toaster()));
        multiPowerPoint.addAppliance(new OvenAdapter(new Oven()));
        multiPowerPoint.addAppliance(new BlenderAdapter(new Blender()));
        multiPowerPoint.turnOnAll();
        multiPowerPoint.turnOffAll();
    }

}
