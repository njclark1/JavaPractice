package dev.nclark;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("hi");

        Random random = new Random();

        int x = 10;
        for (int i = 0; i < x; i++) {
            int randomInt = random.nextInt();
            System.out.println(randomInt);
        }
    }
}
