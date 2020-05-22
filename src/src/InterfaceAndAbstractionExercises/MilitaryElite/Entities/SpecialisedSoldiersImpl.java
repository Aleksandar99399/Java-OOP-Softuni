package src.InterfaceAndAbstractionExercises.MilitaryElite.Entities;

import src.InterfaceAndAbstractionExercises.MilitaryElite.Enums.Corps;
import src.InterfaceAndAbstractionExercises.MilitaryElite.Interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldiersImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;

    protected SpecialisedSoldiersImpl(int id,
                                      String firstName,
                                      String lastName,
                                      double salary,
                                      Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps=corps;
    }
}
