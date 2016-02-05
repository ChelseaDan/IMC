package Question2;

import Question2.Appliances.Toaster;

/**
 * Created by dg1613 on 05/02/16.
 */
public class ToasterAdapter implements ApplianceAdapter {

    private Toaster toaster;

    public ToasterAdapter(Toaster toaster) {
        this.toaster = toaster;
    }

    @Override
    public void powerOn() {
        toaster.startToasting();
    }

    @Override
    public void powerOff() {
        toaster.stopToasting();
    }
}
