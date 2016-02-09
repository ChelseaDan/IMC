package Question2.Appliances;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Blender {

    /*boolean field so that when appliance is on
    * it can't be turned on again and the same for off.*/
    private boolean isOn;

    public void swizzle() {
        if (!isOn) {
            isOn = true;
            System.out.println("Swizzling");
        }
    }

    public void stopSwizzling() {
        if (isOn) {
            isOn = false;
            System.out.println("No longer swizzling");
        }
    }
}
