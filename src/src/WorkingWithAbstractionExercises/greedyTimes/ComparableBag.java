package src.WorkingWithAbstractionExercises.greedyTimes;

public class ComparableBag implements Comparable<Bag> {
    @Override
    public int compareTo(Bag o) {
        return (int) (o.getCashContainer().getValue()-o.getGemContainer().getValue()
                        -o.getGold().getValue());
    }
}
