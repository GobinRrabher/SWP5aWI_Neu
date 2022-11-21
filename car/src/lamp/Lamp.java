package lamp;
import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Lightelement> lightelements;

    public Lamp(){
        this.lightelements = new ArrayList<>();
    }

    public void addLightelement(Lightelement lightelement) { this.lightelements.add(lightelement); }

    public void turnAllOn(){
        for(int i=0;i<lightelements.size();i++){
            getLightelements().get(i).turnOn();
        }
    }

    public void getOverallPowerUsage(){
        int powerUsage = 0;
        for(int i=0;i<lightelements.size();i++){
            powerUsage += getLightelements().get(i).getStromverbrauch();
        }
        System.out.println(powerUsage + " overall power used");
    }

    public void printNamesOfLightelements(){
        for(int i=0;i<lightelements.size();i++){
            System.out.println("Mein Name ist: " + getLightelements().get(i).getName());
        }
    }

    public List<Lightelement> getLightelements() {
        return lightelements;
    }
}
