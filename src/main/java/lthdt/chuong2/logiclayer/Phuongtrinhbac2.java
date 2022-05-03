/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.logiclayer;

/**
 *
 * @author Viet Khoa
 */
public class Phuongtrinhbac2 implements PhuongtrinhInterface{
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private String ketqua;

    public Phuongtrinhbac2() {
    }

    public Phuongtrinhbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void giaiPhuongTrinh() {
       if(a==0){
       //giai phuong trinh bac 1
       Phuongtrinhbac1 ptb1= new Phuongtrinhbac1(b,c);
       ptb1.giaiPhuongTrinh();
       ketqua=ptb1.getKetqua();
       }else{
       double delta=b*b-4*a*c;
       if(delta<0)
       {
       ketqua="Phuong trinh bac 2 vo nghiem";
       }else{
       if(delta==0){
       x1=-b/(2*a);
       ketqua="Phuong trinh bac 2 co nghiem kep la:"+x1;
       }else{
       x1=(-b+Math.sqrt(delta))/(2*a);
       x2=(-b-Math.sqrt(delta))/(2*a);
       ketqua="Phuong trinh co 2 nghiem phan biet: x1="+x1+";va x2="+x2;
       }
       }
       }
    }

    @Override
    public String toString() {
        if(ketqua==null || ketqua.isEmpty()){
        giaiPhuongTrinh();
        }
        return ketqua;
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

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    
}
