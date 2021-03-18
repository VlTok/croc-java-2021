package mobility;

import enumeration.Status;

import java.util.Objects;

public class Scooter extends PersonalMobilityTool{
    private String platform; //платформа самоката
    private String chargingTime; //Скорость зарядки
    private String electricMotor; //Электрический моторчик

    public Scooter(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, Integer numberWheel, String type, String platform, String chargingTime, String electricMotor) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork, numberWheel, type);
        this.platform = platform;
        this.chargingTime = chargingTime;
        this.electricMotor = electricMotor;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(String chargingTime) {
        this.chargingTime = chargingTime;
    }

    public String getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(String electricMotor) {
        this.electricMotor = electricMotor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Scooter scooter = (Scooter) o;
        return Objects.equals(platform, scooter.platform) && Objects.equals(chargingTime, scooter.chargingTime) && Objects.equals(electricMotor, scooter.electricMotor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), platform, chargingTime, electricMotor);
    }
}
