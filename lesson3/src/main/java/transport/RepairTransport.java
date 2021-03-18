package transport;

import repair.Repair;

public interface RepairTransport extends Repair {
    void repairEngine();
    void repairTransmission();
}
