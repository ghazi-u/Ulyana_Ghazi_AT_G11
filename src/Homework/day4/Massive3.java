package Homework.day4;
//-- написать метод, который вернет сумму тех элементов целочисленного массива,
// которые кратны первой цифре длины этого массива (массив подается в сигнатуру метода)

public class Massive3 {
    public int sum(int[] elements) {

        int sum = 0;
        int elementsLenght = elements.length;
        int firstLengthsNum = 0;

        while (elementsLenght >= 10) {
            elementsLenght /= 10;
        }

        firstLengthsNum = elementsLenght;

        for (int i : elements) {
            if (i % firstLengthsNum == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        return sum;