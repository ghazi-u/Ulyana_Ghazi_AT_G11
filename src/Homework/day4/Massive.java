package Homework.day4;
//-- написать метод, который принимает на вход целочисленном массив и
// считает сумму каждого n-ого элемента в нем, где n - целое число,
// передаваемое в сигнатуру этого метода вторым аргументом

public class Massive {

    public static void countsum(int[] numbers, int number) {

        int countsum = 0;

        for (int it : numbers) {
            if (it % number == 0) {
                countsum = countsum + it;
            }
        }

        System.out.println(countsum);

    }


    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 4, 5, 8, 9};

        countsum(numbers, 2);
    }

}