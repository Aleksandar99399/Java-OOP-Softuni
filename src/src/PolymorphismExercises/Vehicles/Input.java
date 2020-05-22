package src.PolymorphismExercises.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {

    public Vehicles parseVehi (BufferedReader rd) throws IOException {
        String[] line=rd.readLine().split("\\s+");
        String type=line[0];
        double quantity=Double.parseDouble(line[1]);
        double consum=Double.parseDouble(line[2]);
        double capacity=Double.parseDouble(line[3]);
        if (type.equals("Car")){
            return new Car(quantity,consum,capacity);
        }else if (type.equals("Truck")){
            return new Truck(quantity,consum,capacity);
        }else {
            return new Bus(quantity,consum,capacity);
        }
    }
}
