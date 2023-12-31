package Sort.services.animation;

import Sort.components.Panel;

public class Animation {
    public static void translate(
            Panel panel, Location locationStart,
            int translateX, int translateY,
            int delay, int duration,
            int zOrder) {
        (new PanelTransform(
                panel, locationStart,
                translateX, translateY,
                delay, duration, zOrder)
        ).start();
    }
}
