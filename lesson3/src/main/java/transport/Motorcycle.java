package transport;

import enumeration.Status;

import java.util.Objects;

public class Motorcycle extends Transport{

    private String step; // подножка, чтобы поставить мотоцикл. Её тип.

    public Motorcycle(String brand, String model, String weight, Integer capacity, String payload, String fuel, Status status, Boolean isWork, String type, String number, String engine, String step) {
        super(brand, model, weight, capacity, payload, fuel, status, isWork, type, number, engine);
        this.step = step;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(step, that.step);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), step);
    }
}
