package src.WorkingWithAbstractionExercises.greedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class GemContainer {
    private Map<String,Long> gems;

    public Map<String, Long> getGems() {
        return gems;
    }

    public void setGems(Map<String, Long> gems) {
        this.gems = gems;
    }

    public GemContainer(){
        this.gems=new LinkedHashMap<>();
    }

    public Long getValue() {
        return this.gems.values()
                .stream()
                .mapToLong(e->e)
                .sum();
    }

    public void increaseValue(String name,double value){
        if (gems.containsKey(name)){
            this.gems.put(name, (long) (this.gems.get(name) + value));
        }else {
            gems.put(name, (long) value);
        }
    }
}
