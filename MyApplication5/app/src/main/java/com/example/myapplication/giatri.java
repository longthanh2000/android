package com.example.myapplication;

public class giatri {
    private double a;
    private double b;
    private double c;

    public giatri(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double delta(){
        return this.b*this.b -4*this.a*this.c;
    }
    public int kiemtra(){
        int flag = 0;
        if(delta()<0) {
            flag = -1;
        }
        if(delta()==0){
            flag = 0;
        }
        if(delta()>0){
            flag =1;
        }
        return flag;

    }
    public double nghiemduynhat(){
        return -b/(2*a);
    }
    public double nghiemphanbiet1(){
        return -b+Math.sqrt(delta())/(2*a);
    }
    public double nghiemphanbiet2(){
        return -b-Math.sqrt(delta())/(2*a);
    }

}
