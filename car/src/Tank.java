public class Tank {
    private int fuelVolume;
    private int fuelAmount;

    public Tank(int fv){
        this.fuelVolume = fv;
        this.fuelAmount = fv;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}
