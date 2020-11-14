package chapter4;

public class Vehicle {
    private double speed;
    private String kind;
    private String color;

    public Vehicle(String k, String c){
        kind = k;
        color = c;
    }

    public double getSpeed() {
        return speed;
    }
    public String getKind() {
        return kind;
    }
    public String getColor() {
        return color;
    }

    public void setSpeed(double s) {
        speed = s;
    }
    public void setKind(String k) {
        kind = k;
    }
    public void setColor(String c) {
        color = c;
    }

    public void speedUp(double up) {
        speed += up;
    }
    public void speedDown(double down) {
        speed -= down ;
    }
}
