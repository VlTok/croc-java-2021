package ru.tokmeninov.homework3.aircraft;

import ru.tokmeninov.homework3.repair.Repair;

/**
 * Ремонт летательных аппаратов
 */
public interface RepairAircraft extends Repair {
    void repairAircraftEngine();
    void repairChassis();
    void repairWing();
}
