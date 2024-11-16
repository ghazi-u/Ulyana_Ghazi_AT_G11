package Homework.day3.Basetask;

public class Pineapple {

    private String grade;
    private double heartCapacity;

    public Pineapple(String grade, double heartCapacity){
        this.grade = grade;
        this.heartCapacity = heartCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeartCapacity() {
        return heartCapacity;

    }

    public void setHeartCapacity(double heartCapacity) {
        this.heartCapacity = heartCapacity;
    }
    public void printPineappleDetails() {

        double hamWeight = 2140;

        if (heartCapacity > hamWeight) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
                System.out.println("В ветчине тепла запасется больше :(");
            }
    }
}
