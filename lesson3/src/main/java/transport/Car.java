package transport;

import enumeration.Status;

import java.util.Objects;

public class Car extends Transport{

    private String trunkSize; // размер багажника
    private String suspension; // какая подвеска

    public Car(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, String type, String number, String engine, String trunkSize, String suspension) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork, type, number, engine);
        this.trunkSize = trunkSize;
        this.suspension = suspension;
    }

    public String getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(String trunkSize) {
        this.trunkSize = trunkSize;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(trunkSize, car.trunkSize) && Objects.equals(suspension, car.suspension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trunkSize, suspension);
    }
}
