
package src.WorkingWithAbstractionExercises.greedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());

        Treasure treasure = new Treasure(scanner.nextLine().split("\\s+"));

        Bag bag = new Bag(capacity);

        for (Treasure.Pair<String, Long> pair : treasure) {
            String first = pair.getFirst();
            Long second = pair.getSecond();

            if (bag.hasRoomFor(second) && first != null) {

                if (first.length() == 3) {

                    bag.addCash(first, second);
                } else if (first.toLowerCase().endsWith("gem")) {

                    bag.addGem(first, second);
                } else if (first.toLowerCase().equals("gold")) {

                    bag.addGold(second);
                }

            }
        }



        //      String kvoE = "";

        //      switch (kvoE) {
        //          case "Gem":
        //              if (!torba.containsKey(kvoE)) {
        //                  if (torba.containsKey("Gold")) {
        //                      if (broika > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
        //                          continue;
        //                      }
        //                  } else {
        //                      continue;
        //                  }
        //              } else if (torba.get(kvoE).values().stream().mapToLong(e -> e).sum() + broika > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
        //                  continue;
        //              }
        //              break;
        //          case "Cash":
        //              if (!torba.containsKey(kvoE)) {
        //                  if (torba.containsKey("Gem")) {
        //                      if (broika > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
        //                          continue;
        //                      }
        //                  } else {
        //                      continue;
        //                  }
        //              } else if (torba.get(kvoE).values().stream().mapToLong(e -> e).sum() + broika > torba.get("Gem").values().stream().mapToLong(e -> e).sum()) {
        //                  continue;
        //              }
        //              break;
        //      }

        //      if (!torba.containsKey(kvoE)) {
        //          torba.put((kvoE), new LinkedHashMap<String, Long>());
        //      }

        //      if (!torba.get(kvoE).containsKey(first)) {
        //          torba.get(kvoE).put(first, 0L);
        //      }


        //      torba.get(kvoE).put(first, torba.get(kvoE).get(first) + broika);

        //  }

        //  for (var x : torba.entrySet()) {
        //      Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

        //      System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

        //      x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        //  }
    }
}