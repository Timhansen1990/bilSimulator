package com.company;

public class Motor {
    boolean running;
    Bremse trækHåndbremse = new Bremse();

    public void startMotor(){
        running = true;
        System.out.println("Starter bilen op! ");
    }
    public void StopMotor(){
        running = false;
        System.out.println("Bilen Slukkes");
        trækHåndbremse.trækkerHåndbremsen();

    }

        public void kører(){
        if (running == true){
            System.out.println("Motoren kører");
        }else{
                System.out.println("Bil Slukket");
            }
    }

}
