package lamp;
import java.awt.*;

public class Lightelement {
    private String name;
    private Color color;
    private int stromverbrauch;
    private boolean status = false;

    public Lightelement(String name, Color color, int stromverbrauch){
        this.name = name;
        this.color = color;
        this.stromverbrauch = stromverbrauch;
        this.status = false;
    }

    public void turnOn(){
        if(getStatus() == false){
            setStatus(true);
            setStromverbrauch(getStromverbrauch() + 5);
        }
        else{
            System.out.println("Mein Name ist " + getName() + ". Ich bin bereits eingeschaltet.");
        }
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getStromverbrauch() {
        return stromverbrauch;
    }

    public void setStromverbrauch(int stromverbrauch) {
        this.stromverbrauch = stromverbrauch;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
