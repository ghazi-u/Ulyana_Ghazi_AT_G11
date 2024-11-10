package Basetask;
//-- создать невозвратный метод printInt, который принимает на вход целое число (int) и печатает в консоль «я получил на вход число » и это число

public class TrainMethodsPrimitive {
    public void printint(int number) {
        System.out.println("я получил на вход число" + " " + number);

    }

    public void printLong(long number) {
        System.out.println("я получил на вход длинное число" + " " + number);

    }

    public void printChar(char symbol) {
        System.out.println("я получил на вход символ" + " " + (char) symbol);

    }

    public void printFloat(float number) {
        System.out.println("я получил на вход дробное число" + " " + number);
    }

    public void printDouble(double number) {
        System.out.println("я получил на вход длинное дробное число" + " " + number);
    }

    public void printShort(short number) {
        System.out.println("я получил на вход короткое число" + " " + number);


    }

    public void printByte(byte number) {

        System.out.println("я получил на вход очень короткое число" + " " + number);
    }

    public void printBoolean(boolean meaning) {

        System.out.println("я получил на вход булево" + " " + meaning);
    }
}
