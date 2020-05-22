package src.InheritanceLab.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

    private Random random;

    public RandomArrayList(Random random){

        this.random = random;
    }

    public  T getRandomElement(){
        int rnd=random.nextInt(this.size());
        return this.get(rnd);
    }

}
