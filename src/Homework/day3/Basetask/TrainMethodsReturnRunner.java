package Homework.day3.Basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {

        TrainMethodsReturn a = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + a.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + a.returnNewLong(25));
        System.out.println("метод returnNewChar вернул " + a.returnNewChar('%'));
        System.out.println("метод returnNewFloat вернул " + a.returnNewFloat(8.8f));
        System.out.println("метод returnNewDouble вернул " + a.returnNewDouble(4.4));
        System.out.println("метод returnNewShort вернул " + a.returnNewShort((short) 7));
        System.out.println("метод returnNewByte вернул " + a.returnNewByte((byte) 20));
        System.out.println("метод returnNewBoolean вернул " + a.returnNewBoolean(true));

    }

}
