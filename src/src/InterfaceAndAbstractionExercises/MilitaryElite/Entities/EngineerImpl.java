package src.InterfaceAndAbstractionExercises.MilitaryElite.Entities;

import src.InterfaceAndAbstractionExercises.MilitaryElite.Enums.Corps;
import src.InterfaceAndAbstractionExercises.MilitaryElite.Interfaces.Engineer;
import src.InterfaceAndAbstractionExercises.MilitaryElite.Interfaces.Repair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldiersImpl implements Engineer {

    private List<Repair>repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs=new ArrayList<>();
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return Collections.unmodifiableList(this.repairs);
    }
}
