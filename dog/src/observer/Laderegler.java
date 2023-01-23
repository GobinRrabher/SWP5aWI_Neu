package observer;

public class Laderegler implements Observer{
    @Override
    public void inform() {
        System.out.println("Voltage >= 18");
    }
}
