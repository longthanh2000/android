package com.example.baikiemtra2;

public class tamgiac {
    private diem diemA, diemB, diemC;


    public tamgiac(diem diemA, diem diemB, diem diemC) {
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    public diem getDiemA() {
        return diemA;
    }

    public void setDiemA(diem diemA) {
        this.diemA = diemA;
    }

    public diem getDiemB() {
        return diemB;
    }

    public void setDiemB(diem diemB) {
        this.diemB = diemB;
    }

    public diem getDiemC() {
        return diemC;
    }

    public double AB(){
        double hieuX = Math.pow((diemA.getX()-diemB.getX()),2);
        double hieuY = Math.pow((diemA.getY()-diemB.getY()),2);
        double ab = Math.sqrt(hieuX + hieuY);
        return ab;
    }
    public double AC(){
        double hieuX = Math.pow((diemA.getX()-diemC.getX()),2);
        double hieuY = Math.pow((diemA.getY()-diemC.getY()),2);
        double ac = Math.sqrt(hieuX + hieuY);
        return ac;
    }
    public double BC(){
        double hieuX = Math.pow((diemB.getX()-diemC.getX()),2);
        double hieuY = Math.pow((diemB.getY()-diemC.getY()),2);
        double bc = Math.sqrt(hieuX + hieuY);
        return bc;
    }
    public void setDiemC(diem diemC) {
        this.diemC = diemC;
    }
    public double chuvi(){
        return (double) Math.round((AB() + AC()+BC())*1000)/1000;
    }
    public double dientich(){
        double nuachuvi = chuvi()/2;
        double S = (double) Math.round((Math.sqrt(nuachuvi*(nuachuvi-AB())*(nuachuvi-AC())* (nuachuvi-BC())))*1000)/1000;
        return S;
    }
}
