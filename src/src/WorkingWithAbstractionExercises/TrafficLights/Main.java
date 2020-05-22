package src.WorkingWithAbstractionExercises.TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        TrafficLight[] trafficLights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(TrafficLight::valueOf)
                .toArray(TrafficLight[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        TrafficLight[] newLights = TrafficLight.values();
        while (n-- > 0) {
            for (int i = 0; i < trafficLights.length; i++) {

                TrafficLight trafficLight = trafficLights[i];
                int next = trafficLight.ordinal() + 1;
                if (next >= newLights.length) {
                    next = 0;
                }

                trafficLights[i] = newLights[next%newLights.length];
                System.out.print(trafficLights[i] + " ");
            }

            System.out.println();

        }
    }
}
