package Homework.day3.Basetask;

public class Bee {

    private String gender;
    private Long weight;

    public Bee(String gender, Long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public Long getWeight() {

        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {

        long ves = 500;
        long ink = ves / weight;
        System.out.println("Я легче лося в " + ink + " раз");
    }
}
