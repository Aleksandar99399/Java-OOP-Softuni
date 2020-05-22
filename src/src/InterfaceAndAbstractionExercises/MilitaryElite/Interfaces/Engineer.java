package src.InterfaceAndAbstractionExercises.MilitaryElite.Interfaces;


import java.util.Collection;

public interface Engineer extends Private{
     void addRepair(Repair repair);
     Collection<Repair> getRepairs();
}
