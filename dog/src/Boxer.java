import strategy.*;

public class Boxer extends AbstractDog{

    public Boxer(String name, WufStrategy ws) {
        super(name, ws);
    }

    @Override
    public void run() {
        System.out.println("My name is "+ getName());
        ws.bark();
    }
}
