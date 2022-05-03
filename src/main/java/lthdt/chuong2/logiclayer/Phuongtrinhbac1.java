/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.logiclayer;

/**
 *
 * @author Viet Khoa
 */
public class Phuongtrinhbac1 implements PhuongtrinhInterface {
    private double a;
    private double b;
    private double nghiem_x;
    private String ketqua;
    public Phuongtrinhbac1() {
    }

    public Phuongtrinhbac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void giaiPhuongTrinh() {
        if(a!=0){
            nghiem_x=-b/a;
            ketqua="Phuong trinh bac nhat co nghiem la:"+nghiem_x;
        }else{
        if(b!=0){
            ketqua="Phuong trinh bac 1 vo nghiem";
        }else{
            ketqua="Phuong trinh bac 1 co vo so nghiem";
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

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    }
