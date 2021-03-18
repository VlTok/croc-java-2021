package aircraft;

import enumeration.Status;
import general.MeanTransportation;

import java.util.Objects;

public class Aircraft extends MeanTransportation implements RepairAircraft{
    private String area; //посадочная площадка (Для самолета: какая-то полоса. Для вертолёта: определенное место.
    private String flightRange; //дальность полета
    private String flightHeight; // высота полета
    private String parkingPlace; //место стоянки
    private String type; //тип летательного оппарата
    private String chassisType; //тип шасси
    private String aircraftEngine; // авиационный двигатель

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
        System.out.println("Repair aircraft engine");
        System.out.println(getBrand()+" "+getModel()+" "+"repair aircraft engine is complete");
    }

    @Override
    public void repairChassis() {
        System.out.println("Repair chassis");
        System.out.println(getBrand()+" "+getModel()+" "+"repair chassis is complete");
    }

    @Override
    public void repairWing() {
        System.out.println("Repair wing");
        System.out.println(getBrand()+" "+getModel()+" "+"repair wing is complete");
    }

    @Override
    public void diagnostics() {
        System.out.println("Diagnostics aircraft");
        System.out.println(getBrand()+" "+getModel()+" "+"diagnostics is complete");
    }
}
