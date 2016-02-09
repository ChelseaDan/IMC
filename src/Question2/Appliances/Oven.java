package Question2.Appliances;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Oven {

    /*boolean field so that when appliance is on
    * it can't be turned on again and the same for off.*/
    private boolean isOn;

    public void heatUp() {
        if (!isOn) {
            isOn = true;
            System.out.println("Heating up");
        }
    }

    public void coolDown() {
        if (isOn) {
            isOn = false;
            System.out.println("Cooling down");
        }
    }
}
