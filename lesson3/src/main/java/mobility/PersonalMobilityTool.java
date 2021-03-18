package mobility;

import enumeration.Status;
import general.MeanTransportation;

import java.util.Objects;

public class PersonalMobilityTool extends MeanTransportation implements RepairMobility {
    private Integer numberWheel; //количество колёс
    private String type; //тип самоката или велосипеда

    public PersonalMobilityTool(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, Integer numberWheel, String type) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork);
        this.numberWheel = numberWheel;
        this.type = type;
    }

    public Integer getNumberWheel() {
        return numberWheel;
    }

    public void setNumberWheel(Integer numberWheel) {
        this.numberWheel = numberWheel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void repairBrake() {
        System.out.println("Repair brake");
        System.out.println(getBrand()+" "+getModel()+" "+"repair brake is complete");
    }

    @Override
    public void diagnostics() {
        System.out.println("Diagnostics personal mobility tool");
        System.out.println(getBrand()+" "+getModel()+" "+"diagnostics is complete");
    }
}
