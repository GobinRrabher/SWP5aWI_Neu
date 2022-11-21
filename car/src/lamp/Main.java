package lamp;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Lightelement g1 = new Lightelement("1", Color.green, 0);
        Lightelement g2 = new Lightelement("2", Color.cyan, 0);
        Lamp l1 = new Lamp();
        l1.addLightelement(g1);
        l1.addLightelement(g2);
        g1.turnOn();
        System.out.println(l1.getLightelements().get(0).getStromverbrauch());
        l1.turnAllOn();
        System.out.println(l1.getLightelements().get(1).getStromverbrauch());
        l1.getOverallPowerUsage();
        l1.printNamesOfLightelements();
    }
}
