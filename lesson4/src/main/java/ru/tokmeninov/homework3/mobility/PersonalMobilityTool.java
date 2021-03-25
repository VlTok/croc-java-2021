package ru.tokmeninov.homework3.mobility;

import ru.tokmeninov.homework3.enumeration.Status;
import ru.tokmeninov.homework3.general.MeanTransportation;

/**
 *  Персональное мобильное средство передвижения
 */
public class PersonalMobilityTool extends MeanTransportation implements RepairMobility {
    /** Количество колёс */
    private Integer numberWheel;
    /** Тип самоката или велосипеда */
    private String type;

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
        System.out.println(getBrand()+" "+getModel()+" "+"ru.tokmeninov.homework3.repair brake is complete");
    }

    @Override
    public void diagnostics() {
        System.out.println("Diagnostics personal ru.tokmeninov.homework3.mobility tool");
        System.out.println(getBrand()+" "+getModel()+" "+"diagnostics is complete");
    }
}
