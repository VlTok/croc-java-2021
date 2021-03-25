package ru.tokmeninov.homework3.aircraft;

import ru.tokmeninov.homework3.enumeration.Status;
import ru.tokmeninov.homework3.general.MeanTransportation;

import java.util.Objects;

/**
 * Летательные средства
 */
public class Aircraft extends MeanTransportation implements RepairAircraft{
    /** Посадочная площадка */
    private String area;
    /** Дальность полёта*/
    private String flightRange;
    /** Высота полёта */
    private String flightHeight;
    /** Место стоянки */
    private String parkingPlace;
    /** Тип летательного аппарата */
    private String type;
    /** Тип шасси */
    private String chassisType;
    /** Авиационный двигатель */
    private String aircraftEngine;

    public Aircraft(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, String area, String flightRange, String flightHeight, String parkingPlace, String type, String chassisType, String aircraftEngine) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork);
        this.area = area;
        this.flightRange = flightRange;
        this.flightHeight = flightHeight;
        this.parkingPlace = parkingPlace;
        this.type = type;
        this.chassisType = chassisType;
        this.aircraftEngine = aircraftEngine;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(String flightRange) {
        this.flightRange = flightRange;
    }

    public String getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(String flightHeight) {
        this.flightHeight = flightHeight;
    }

    public String getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(String parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public String getAircraftEngine() {
        return aircraftEngine;
    }

    public void setAircraftEngine(String aircraftEngine) {
        this.aircraftEngine = aircraftEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(area, aircraft.area) && Objects.equals(flightRange, aircraft.flightRange) && Objects.equals(flightHeight, aircraft.flightHeight) && Objects.equals(parkingPlace, aircraft.parkingPlace) && Objects.equals(type, aircraft.type) && Objects.equals(chassisType, aircraft.chassisType) && Objects.equals(aircraftEngine, aircraft.aircraftEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), area, flightRange, flightHeight, parkingPlace, type, chassisType, aircraftEngine);
    }

    @Override
    public void repairAircraftEngine() {
        System.out.println("Repair ru.tokmeninov.homework3.aircraft engine");
        System.out.println(getBrand()+" "+getModel()+" "+"ru.tokmeninov.homework3.repair ru.tokmeninov.homework3.aircraft engine is complete");
    }

    @Override
    public void repairChassis() {
        System.out.println("Repair chassis");
        System.out.println(getBrand()+" "+getModel()+" "+"ru.tokmeninov.homework3.repair chassis is complete");
    }

    @Override
    public void repairWing() {
        System.out.println("Repair wing");
        System.out.println(getBrand()+" "+getModel()+" "+"ru.tokmeninov.homework3.repair wing is complete");
    }

    @Override
    public void diagnostics() {
        System.out.println("Diagnostics ru.tokmeninov.homework3.aircraft");
        System.out.println(getBrand()+" "+getModel()+" "+"diagnostics is complete");
    }
}
