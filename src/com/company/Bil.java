package com.company;

public class Bil {

    String bilType = "Tesla";
    String model = "Model X";
    String stelNummer = "02930923";
    int døre = 4;
    String softwareVersion = "0.0.1";
    double x = 55.22458;
    double y = 11.757075;
    double Speed = 0;
    Motor motor = new Motor();
    Bremse bremser = new Bremse();

    public String toString() {
        return String.format("%s\n%s\n%s\n%1d\n%s\n%02.5f\n%02.5f\n%.2f",
                this.bilType, this.model, this.stelNummer, this.døre, this.softwareVersion, this.x, this.y, this.Speed);
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public int getDøre() {
        return døre;
    }

    public void setDøre(int døre) {
        this.døre = døre;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBilType() {
        return bilType;
    }

    public void setBilType(String bilType) {
        this.bilType = bilType;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getStelNummer() {
        return stelNummer;
    }

    public void setStelNummer(String stelNummer) {
        this.stelNummer = stelNummer;
    }

    public Bremse getBremser() {
        return bremser;
    }

    public void setBremser(Bremse bremser) {
        this.bremser = bremser;
    }
}
