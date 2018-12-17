package com.maven.springer.referencing002;

public class Scores {
    private double Math;
    private double Kiswahili;
    private double Science;

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public double getKiswahili() {
        return Kiswahili;
    }

    public void setKiswahili(double kiswahili) {
        Kiswahili = kiswahili;
    }

    public double getScience() {
        return Science;
    }

    public void setScience(double science) {
        Science = science;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "Math=" + Math +
                ", Kiswahili=" + Kiswahili +
                ", Science=" + Science +
                '}';
    }
}
