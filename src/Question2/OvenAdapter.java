package Question2;

import Question2.ApplianceAdapter;
import Question2.Appliances.Oven;

/**
 * Created by dg1613 on 05/02/16.
 */
public class OvenAdapter implements ApplianceAdapter {

    private Oven oven;

    public OvenAdapter(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void powerOn() {
        oven.heatUp();
    }

    @Override
    public void powerOff() {
        oven.coolDown();
    }
}
