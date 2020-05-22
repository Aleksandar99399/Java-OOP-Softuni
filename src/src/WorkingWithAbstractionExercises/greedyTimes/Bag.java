package src.WorkingWithAbstractionExercises.greedyTimes;

import java.util.Comparator;
import java.util.Iterator;

public class Bag implements Iterable<Bag.Pair<String,Long>>, Comparator<Bag> {
    private CashContainer cashContainer;
    private Gold gold;
    private GemContainer gemContainer;

    public CashContainer getCashContainer() {
        return cashContainer;
    }

    public Gold getGold() {
        return gold;
    }

    public GemContainer getGemContainer() {
        return gemContainer;
    }

    public long getCapacity() {
        return capacity;
    }

    private long capacity;

    public Bag(long capacity) {
        this.cashContainer = new CashContainer();
        this.gold = new Gold();
        this.gemContainer = new GemContainer();
        this.capacity = capacity;


    }

    public boolean hasRoomFor(Long value) {
        return value + this.getCurrentSize() <= capacity;
    }

    private Long getCurrentSize() {
        long size = this.gold.getValue();
        size += this.gemContainer.getValue();
        size += this.cashContainer.getValue();
        return size;
    }

    public void addGold(long value) {
        if (this.gold.getValue() >= this.gemContainer.getValue()
                && this.gold.getValue() + value <= capacity) {

            this.gold.setValue(this.gold.getValue() + value);
        }
    }

    public void addCash(String name, long value) {
        if (this.gemContainer.getValue() >= this.cashContainer.getValue() + value
                && this.cashContainer.getValue() + value < capacity) {
            if (cashContainer.getCash().containsKey(name)) {
                this.cashContainer.getCash().put(name, this.cashContainer.getCash().get(name) + value);
            }else {
                cashContainer.getCash().put(name, value);
            }
        }
    }

    public void addGem(String name,long value) {
        if (gemContainer.getValue()+value<=capacity) {
            gemContainer.increaseValue(name,value);
        }

    }

    @Override
    public Iterator<Pair<String, Long>> iterator() {
        return new Iterator<Pair<String, Long>>() {
            int index=0;
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Pair<String, Long> next() {
                return null;
            }
        };
    }

    @Override
    public int compare(Bag o1, Bag o2) {
        return 0;
    }


    public static class Pair<K,V> {
        private K first;
        private V second;

        public Pair(K first,V second){
            this.first=first;
            this.second=second;
        }

        public K getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }
    }
}
