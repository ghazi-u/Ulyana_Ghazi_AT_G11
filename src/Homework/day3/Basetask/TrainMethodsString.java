package Homework.day3.Basetask;

public class TrainMethodsString {
    //-- создать невозвратный метод printMama, который ничего не принимает на вход,
    // печатает в консоль «мама мыла раму»
    public void printMama() {
        System.out.println("мама мыла раму");

    }

    //-- создать невозвратный метод printPapa, который ничего не принимает на вход,
    // печатает в консоль «папа мыл раму»
    public void printPapa() {
        System.out.println("папа мыл раму");

    }

    //-- создать невозвратный метод printString, который принимает на вход строку
    // и печатает в консоль эту строку
    public void printString(String string) {

        System.out.println(string);

    }

    //-- создать невозвратный метод printMamaString, который принимает на вход строку
    // и печатает в консоль «мама мыла » и эту строку
    public void printMamaString(String string) {

        String line = "мама мыла";
        System.out.println(line + string);

    }

}
