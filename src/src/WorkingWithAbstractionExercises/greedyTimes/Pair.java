package src.WorkingWithAbstractionExercises.greedyTimes;

public  class Pair<K,V>  {
    private K first;
    private V second;

    public Pair(K first,V second){
        this.first=first;
        this.second=second;
    }

    public Pair() {

    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
