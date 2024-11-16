package Homework.day4;
//-- написать метод, который вернет целочисленный массив,
// состоящий только из тех элементов исходного целочисленного массива (подается на вход этого метода),
// которые больше, чем число n, где n - целое число, передаваемое в сигнатуру этого метода вторым аргументом,
// элементы в результирующем массиве должны быть расположены в обратном порядке


public class Massive2 {
    public static void backmassive(int[] numbers, int number) {

        int NewArroyLeanth = 0;
        int x = 0;
        int[] NewArroy = new int[NewArroyLeanth];

        for (int it : numbers) {
            if(it > number) {
                NewArroyLeanth = NewArroyLeanth +1;
            NewArroy[x]=it;
            x++;
            }

        }

    }



}
