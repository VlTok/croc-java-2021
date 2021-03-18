package aircraft;

import repair.Repair;

public interface RepairAircraft extends Repair {
    void repairAircraftEngine();
    void repairChassis();
    void repairWing();
}
