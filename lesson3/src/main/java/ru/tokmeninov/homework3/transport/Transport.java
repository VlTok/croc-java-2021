package ru.tokmeninov.homework3.transport;

import ru.tokmeninov.homework3.enumeration.Status;
import ru.tokmeninov.homework3.general.MeanTransportation;

import java.util.Objects;

/**
 * Транспортные средства
 */
public class Transport extends MeanTransportation implements RepairTransport{

    /** Тип транспорта. Например хетчбэк или легковая */
    private String type;
    /** Номер транспорта */
    private String number;
    /** Двигатель внутреннего сгорания */
    private String engine;

    public Transport(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, String type, String number, String engine) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork);
        this.type = type;
        this.number = number;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Transport transport = (Transport) o;
        return Objects.equals(type, transport.type) && Objects.equals(number, transport.number) && Objects.equals(engine, transport.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, number, engine);
    }

    @Override
    public void diagnostics() {
        System.out.println("Diagnostics ru.tokmeninov.homework3.transport");
        System.out.println(getBrand()+" "+getModel()+" "+"diagnostics is complete");
    }

    @Override
    public void repairEngine() {
        System.out.println("Repair engine");
        System.out.println(getBrand()+" "+getModel()+" "+"ru.tokmeninov.homework3.repair engine is complete");
    }

    @Override
    public void repairTransmission() {
        System.out.println("Repair transmission");
        System.out.println(getBrand()+" "+getModel()+"ru.tokmeninov.homework3.repair transmission is complete");
    }
}
