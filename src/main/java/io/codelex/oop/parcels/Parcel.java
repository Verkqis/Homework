package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;

    }

    @Override
    public boolean validate() {
        double sum = xLength + yLength + zLength;
        if (sum < 300.0 && xLength >= 30 && yLength >= 30
                && zLength >= 30 && weight <= 15.0) {
            isExpress = true;
        } else if (sum < 300.0 && xLength >= 30 && yLength >= 30
                && zLength >= 30 && weight <= 30.0) {
            isExpress = false;
        }
        System.out.println(sum);
        System.out.println(isExpress);
        return isExpress;
    }


    public static void main(String[] args) {


        Parcel one = new Parcel(30, 30, 30, 15);
        one.validate();

    }

}
