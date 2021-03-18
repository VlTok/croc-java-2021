package ru.tokmeninov.homework3.general;

import ru.tokmeninov.homework3.enumeration.Status;

import java.util.Objects;

/**
 * Главный класс для средств передвижения
 */
public class MeanTransportation {
    /** Брэнд */
    private String brand;
    /** Модель */
    private String model;
    /** Вес */
    private String weight;
    /** Вместимость */
    private Integer capacity;
    /** Грузоподъёмность */
    private String payload;
    /** Наименование используемого топлива */
    private String fuel;
    /** Статус средства передвижения */
    private Status status;
    /** Состояние средтва передвижения */
    private Boolean isWork;

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
