/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.employee.logic;

import java.util.Date;

/**
 *
 * @author Viet Khoa
 */
public class Student extends Person implements TaxInterface {
    private String truonghoc;
    private String hocluc;
    private double hocbong;

    public Student() {
    }

    public Student(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public Student(String truonghoc, String hocluc,  String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
        this.hocluc = hocluc;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public double getHocbong() {
        return hocbong;
    }

    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
    }
    

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTaxt(double income) {
        double tax;
        tax=0.01*income;
        return tax;
    }

    @Override
    public String toString() {
        String ketqua= super.toString();
        ketqua+= "Student{" + "truonghoc=" + truonghoc + ", hocluc=" + hocluc + ", hocbong=" + hocbong + '}';
        return ketqua;
    }
    
    
}
