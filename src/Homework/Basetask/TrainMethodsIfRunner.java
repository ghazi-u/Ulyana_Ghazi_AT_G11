package Basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {

        TrainMethodsIf a = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + a.returnNewInt(6));
        System.out.println("метод returnNewLong вернул " + a.returnNewLong(400));
        System.out.println("метод returnNewChar вернул " + a.returnNewChar('g'));
        System.out.println("метод returnNewFloat вернул " + a.returnNewFloat(2.2f));
        System.out.println("метод returnNewDouble вернул " + a.returnNewDouble(20.2));
        System.out.println(a.returnNewBoolean(true));


    }
}
