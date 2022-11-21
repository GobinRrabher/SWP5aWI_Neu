package remote;

import java.util.List;
import java.util.ArrayList;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private List<Battery> batteries;


    public Remote(boolean isOn, boolean hasPower) {
        this.isOn = isOn;
        this.hasPower = hasPower;
        this.batteries = new ArrayList<>();
    }

    public void turnOn(){
        checkForPower();
        if(getHasPower() == true){
            setIsOn(true);
            System.out.println("Remote turned on");
        }
        else System.out.println("No power");
    }

    public void addBattery(Battery battery){
        this.batteries.add(battery);
    }

    public void checkForPower(){
        hasPower = getHasPower();
        float b1Power = batteries.get(0).getChargingStatus();
        float b2Power = batteries.get(1).getChargingStatus();
        float avg = (b1Power+b2Power)/2;
        if(avg >=10){ setHasPower(true); }
        else { setHasPower(false); }
    }

    public void turnOff(boolean isOn){
        setIsOn(false);
        System.out.println("Remote turned off");
    }

    public boolean getIsOn() { return isOn; }

    public void setIsOn(boolean on) { isOn = on; }

    public boolean getHasPower() { return hasPower; }

    public void setHasPower(boolean hasPower) { this.hasPower = hasPower; }
}
