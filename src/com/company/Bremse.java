package com.company;

public class Bremse {

    boolean bremser = true;

    public void trækkerHåndbremsen(){
        if (bremser == true){
            System.out.println("Håndbremsen er trukket ");
        }else
            System.out.println("Husk at træk håndbremsen! ");
    }
}
