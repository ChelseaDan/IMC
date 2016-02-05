package Question2.Appliances;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Toaster {

    private boolean isOn;

    public void startToasting() {
        if (!isOn) {
            isOn = true;
            System.out.println("Toasting");
        }
    }

    public void stopToasting() {
        if (isOn) {
            isOn = false;
            System.out.println("No longer toasting");
        }
    }
}
