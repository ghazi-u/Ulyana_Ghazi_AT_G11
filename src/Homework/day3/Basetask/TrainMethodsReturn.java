package Homework.day3.Basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int number) {

        return number * 3;
    }

    public long returnNewLong(long number) {

        return number - 4;

    }

    public String returnNewChar(char symbol) {

      return "" + symbol + symbol;

    }

    public float returnNewFloat(float number) {

        return number / 2;
    }

    public double returnNewDouble(double number) {
        return number + 8;
    }

    public short returnNewShort(short number) {
        return (short) ((short) number - 1);
    }

    public byte returnNewByte(byte number) {
        return (byte) ((byte) number * 2);

    }

    public boolean returnNewBoolean(boolean meaning) {
        return meaning;
    }

}
