package ru.tokmeninov.homework3.transport;

import ru.tokmeninov.homework3.repair.Repair;

/**
 * Ремонт транспортных средств
 */
public interface RepairTransport extends Repair {
    void repairEngine();
    void repairTransmission();
}
