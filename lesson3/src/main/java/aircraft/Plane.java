package aircraft;

import enumeration.Status;

import java.util.Objects;

public class Plane extends Aircraft{
    private String wingSpan; //размах крыльев
    private String wingLocation; //расположение крыльев

    public Plane(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, String area, String flightRange, String flightHeight, String parkingPlace, String type, String chassisType, String aircraftEngine, String wingSpan, String wingLocation) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork, area, flightRange, flightHeight, parkingPlace, type, chassisType, aircraftEngine);
        this.wingSpan = wingSpan;
        this.wingLocation = wingLocation;
    }

    public String getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getWingLocation() {
        return wingLocation;
    }

    public void setWingLocation(String wingLocation) {
        this.wingLocation = wingLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;
        return Objects.equals(wingSpan, plane.wingSpan) && Objects.equals(wingLocation, plane.wingLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wingSpan, wingLocation);
    }
}
