package Basetask;

public class Mouse {

    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails() {
        Mouse dusya = new Mouse("Дуся", 7);
        String dusyaName = dusya.getName();
        int dusyaAge = dusya.getAge();

        System.out.println("Я мышь, меня зовут " + dusyaName + " и мне " + dusyaAge + " лет");

    }


}
