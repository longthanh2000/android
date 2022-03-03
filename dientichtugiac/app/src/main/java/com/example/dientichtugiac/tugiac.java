package com.example.dientichtugiac;

public class tugiac {
    private diem diemA, diemB, diemC,diemD;

    public tugiac(diem diemA, diem diemB, diem diemC, diem diemD) {
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
        this.diemD = diemD;
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

    public void setDiemC(diem diemC) {
        this.diemC = diemC;
    }

    public diem getDiemD() {
        return diemD;
    }

    public void setDiemD(diem diemD) {
        this.diemD = diemD;
    }
    public double chieudai(diem diem1, diem diem2){
        return (double)Math.round(Math.sqrt(Math.pow((diem1.getX() - diem2.getX()),2) - Math.pow((diem1.getY() - diem2.getY()),2))*1000)/1000;
    }
    double AB = chieudai(diemA, diemB);
    double BC = chieudai(diemB, diemC);
    double CD = chieudai(diemC, diemD);
    double AD = chieudai(diemA, diemD);
    public double chuvitugiac(){

        return AB+BC + CD+ AD;
    }
    private double nuachuvi  = chuvitugiac() / 2;

    public double dientichtugiac(){

            return (double) Math.round((Math.sqrt((nuachuvi - AB) *(nuachuvi-BC) * (nuachuvi-CD) *(nuachuvi-AD)))*1000)/1000;


    }
}
