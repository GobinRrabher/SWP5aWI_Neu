package remote;

public class Main {
    public static void main(String[] args) {

        Remote r1 = new Remote(false, true);
        Battery b1 = new Battery(100);
        Battery b2 = new Battery(100);
        r1.turnOn();
        r1.addBattery(b1);
        r1.addBattery(b2);


    }
}
