import java.util.ArrayList;
import java.util.List;

public class Car {

    private List<RearMirror> mirrors;
    private Tank tank;
    private Engine engine;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String colour;

    public Car(Tank tank, Engine engine, int fc, String brand, String sn){
        this.tank = tank;
        this.engine = engine;
        this.fuelConsumption = fc;
        this.brand = brand;
        this.serialNumber = sn;
        this.mirrors = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors(){
        return mirrors;
    }

    public void attributes(){
        System.out.println("Horse power: " + this.engine.getHorsePower());
        System.out.println("Engine Type: " + this.engine.getType());
        System.out.println("Fuel consumption: " + this.fuelConsumption);
        System.out.println("Fuel volume: " + this.tank.getFuelVolume());
        System.out.println("Fuel amount: " + this.tank.getFuelAmount());
        System.out.println("Brand: " + this.brand);
        System.out.println("Serial number: " + this.serialNumber);

    }

    public void drive(int speed){
        int fuelAmount = this.tank.getFuelAmount();
        fuelAmount -= this.fuelConsumption;
        this.tank.setFuelAmount(fuelAmount);
        System.out.println("I am driving with speed " + speed);
    }

    public void brake(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if(this.tank.getFuelAmount() > this.tank.getFuelVolume()/10){
            System.out.println("SuperBoostMode");
        }
        else System.out.println("Not enough fuel to go superboost");
    }

    public void honk(int repetitions){
        for(int i = 0; i < repetitions; i++){
            System.out.println("honk");
        }
    }

    public void getRemainingRange(){
        int remainingRange = this.tank.getFuelAmount() / this.fuelConsumption;
        System.out.println(remainingRange);
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
