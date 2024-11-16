package Homework.day3.Cycletask;

import java.util.Random;

public class CycleIntArray {

    int i;
    int[] elements = new int[7];

    public void makeArray() {

        Random random = new Random();

        for (i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(5);
        }

    }


}
