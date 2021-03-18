package general;

import enumeration.Status;

import java.util.Objects;

public class MeanTransportation {
    private String brand; //например Toyota,Nissan
    private String model; //X7, M5
    private String weight; // 100 kg, 1 ton, 1,7 kg
    private Integer capacity; // 1 (человек)
    private String payload; //грузоподЪемность
    private String fuel; // наименование используемого топлива
    private Status status; //арендовано или нет
    private Boolean isWork; // работает или нет транспортное средство

    public MeanTransportation(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.capacity = capacity;
        this.payload = payload;
        this.fuel = fuel;
        this.status = status;
        this.isWork = isWork;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean getWork() {
        return isWork;
    }

    public void setWork(Boolean work) {
        isWork = work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeanTransportation that = (MeanTransportation) o;
        return Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(weight, that.weight) && Objects.equals(capacity, that.capacity) && Objects.equals(payload, that.payload) && Objects.equals(fuel, that.fuel) && status == that.status && Objects.equals(isWork, that.isWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, weight, capacity, payload, fuel, status, isWork);
    }
}
