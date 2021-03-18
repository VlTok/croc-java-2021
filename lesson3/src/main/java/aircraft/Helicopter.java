package aircraft;

import enumeration.Status;

import java.util.Objects;

public class Helicopter extends Aircraft{
    private Integer numberScrews; //количество винтов

    public Helicopter(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, String area, String flightRange, String flightHeight, String parkingPlace, String type, String chassisType, String aircraftEngine, Integer numberScrews) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork, area, flightRange, flightHeight, parkingPlace, type, chassisType, aircraftEngine);
        this.numberScrews = numberScrews;
    }

    public Integer getNumberScrews() {
        return numberScrews;
    }

    public void setNumberScrews(Integer numberScrews) {
        this.numberScrews = numberScrews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Helicopter that = (Helicopter) o;
        return Objects.equals(numberScrews, that.numberScrews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberScrews);
    }
}
