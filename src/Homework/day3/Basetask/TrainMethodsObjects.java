package Homework.day3.Basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse) {
        System.out.println(mouse.getName() + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSauce(Sauce sauce) {
        System.out.println(sauce.getName() + sauce.getColor());
        sauce.printSauceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println(bee.getGender() + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle.getDescription() + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.getGrade() + pineapple.getHeartCapacity());
        pineapple.printPineappleDetails();
    }

}
