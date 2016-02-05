package Question2;

import Question2.Appliances.Blender;

/**
 * Created by dg1613 on 05/02/16.
 */
public class BlenderAdapter implements ApplianceAdapter {

    private Blender blender;

    public BlenderAdapter(Blender blender) {
        this.blender = blender;
    }

    @Override
    public void powerOn() {
        blender.swizzle();
    }

    @Override
    public void powerOff() {
        blender.stopSwizzling();
    }
}
