package dev.nclark;

import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        Random random = new Random();

        Map<Integer, Long> intMap = random.ints(x, y + 1, z + 1)
                .boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        intMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .forEachOrdered(integerLongEntry -> System.out.println(integerLongEntry.getKey() + ": " + integerLongEntry.getValue()));
    }
}