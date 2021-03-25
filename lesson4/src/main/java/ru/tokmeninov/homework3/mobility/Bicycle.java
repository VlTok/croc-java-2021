package ru.tokmeninov.homework3.mobility;

import ru.tokmeninov.homework3.enumeration.Status;

import java.util.Objects;

/**
 * Велосипед
 */
public class Bicycle extends PersonalMobilityTool{

    /** Сидение */
    private String seatPad;
    /** Является ли детским */
    private Boolean isChild;

    public Bicycle(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, Integer numberWheel, String type, String seatPad, Boolean isChild) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork, numberWheel, type);
        this.seatPad = seatPad;
        this.isChild = isChild;
    }

    public String getSeatPad() {
        return seatPad;
    }

    public void setSeatPad(String seatPad) {
        this.seatPad = seatPad;
    }

    public Boolean getChild() {
        return isChild;
    }

    public void setChild(Boolean child) {
        isChild = child;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bicycle bicycle = (Bicycle) o;
        return Objects.equals(seatPad, bicycle.seatPad) && Objects.equals(isChild, bicycle.isChild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatPad, isChild);
    }
}
