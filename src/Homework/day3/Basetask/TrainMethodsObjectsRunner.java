package Homework.day3.Basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        trainMethodsObjects.processMouse(new Mouse("Дуся ", 7));
        System.out.println();
        trainMethodsObjects.processSauce(new Sauce("Сметанковый ", "белого"));
        System.out.println();
        trainMethodsObjects.processBee(new Bee("девочка ", 7l));
        System.out.println();
        trainMethodsObjects.processObstacle(new Obstacle("тра-та-та ", "тру-ля-ля"));
        System.out.println();
    }
}
