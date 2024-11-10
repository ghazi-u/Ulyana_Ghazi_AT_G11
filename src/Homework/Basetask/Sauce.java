package Basetask;

public class Sauce {

    private String name;
    private String color;

    public Sauce(String name, String color) {

        this.name = name;
        this.color = color;
    }

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printSauceDetails() {
        Sauce smetankoviy = new Sauce ("Сметанковый ", "белого");
        String smetankoviyName = smetankoviy.getName();
        String smetankoviyColor = smetankoviy.getColor();

        System.out.println("Это соус " + smetankoviyName + smetankoviyColor + " цвета");

    }
}
