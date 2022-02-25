package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static final List<Character> VALID_CHAR = List.of(
            'a', 'b'
    );


    public static void main(String[] args) {

//        System.out.println("hi");
//
//        System.out.println(VALID_CHAR);



        LinkedList<Integer> linkedInt = new LinkedList<>();
        LinkedList<Integer> linkedIntReverse = new LinkedList<>();
        linkedInt.add(1);
        linkedInt.add(2);
        linkedInt.add(3);
        linkedInt.add(4);
        linkedInt.add(5);
        linkedInt.add(6);

        for (int i = 0; i < linkedInt.size(); i++) {
            System.out.println(linkedInt.get(i));
            linkedIntReverse.add(linkedInt.get(i));
        }

        System.out.println(linkedInt);
        System.out.println(linkedIntReverse);
    }
}
