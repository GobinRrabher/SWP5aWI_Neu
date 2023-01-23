package observer;

public class Geschirrspueler implements Observer{
    @Override
    public void inform() {
        System.out.println("Voltage >= 18");
    }
}
