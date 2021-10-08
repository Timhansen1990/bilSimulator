package com.company;

public class Dyr {
    int antalBen = 7;
    double kropsTemperatur = 3.4;
    boolean levende = false;
    String navn = "søren";

    public Dyr() {
    }

    public Dyr(int a) {
        this.antalBen = a;
    }

    public Dyr(int a, double kropsTemperatur, boolean x, String navn) {
        this.antalBen = a;
        this.kropsTemperatur = kropsTemperatur;
        this.levende = x;
        this.navn = navn;
    }

    public Dyr(int antalBen, boolean x) {
        this.antalBen = antalBen;
        this.levende = x;
    }

    public Dyr(boolean x, String navn) {
        this.levende = x;
        this.navn = navn;
    }

    public Dyr(double kropsTemperatur) {
        this.kropsTemperatur = kropsTemperatur;
    }


    public static void main(String[] args) {

        Dyr x1 = new Dyr();
        Dyr x2 = new Dyr(7);
        Dyr x3 = new Dyr(6 , 2.2, true, "MARTIN" );
        Dyr x4 = new Dyr(12 , true);
        Dyr x5 = new Dyr(true, "Seje Martin");
        Dyr x6 = new Dyr(38.9);
        System.out.println(x1);


    }
}
