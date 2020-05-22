package src.WorkingWithAbstractionExercises.greedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class CashContainer {

    public Map<String, Long> getCash() {
        return cash;
    }

    private Map<String , Long>cash;

    public void setCash(Map<String, Long> cash) {
        this.cash = cash;
    }

    public CashContainer() {
        this.cash = new LinkedHashMap<>();
    }

    public Long getValue() {
        return this.cash.values()
                .stream()
                .mapToLong(e->e)
                .sum();
    }

}
