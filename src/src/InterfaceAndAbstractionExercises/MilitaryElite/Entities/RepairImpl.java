package src.InterfaceAndAbstractionExercises.MilitaryElite.Entities;

import src.InterfaceAndAbstractionExercises.MilitaryElite.Interfaces.Repair;

public class RepairImpl implements Repair {
    private String partName;
    private int hoursWorked;

    public RepairImpl(String partName,int hoursWorked){
        this.partName=partName;
        this.hoursWorked=hoursWorked;
    }
}
