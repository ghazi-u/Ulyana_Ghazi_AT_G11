package Pretask;
// класс MultiplicationTable, используя цикл for, выведите на экран таблицу умножения для числа 5 (1  5, 2  5, и так далее);

public class MultiplicationTable {
    public static void main(String[] args) {

        int Number = 5;
        int i;

       for (i = 1; i <=10; i++) {
           System.out.println(Number + "*" + i + "=" + Number * i);
       }




    }
}
