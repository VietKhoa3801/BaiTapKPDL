/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import lthdt.chuong2.logiclayer.Phuongtrinhbac2;

/**
 *
 * @author Viet Khoa
 */
public class testPTB2 {
    public static void main(String[]args){
        System.out.println("Giai phuong trinh bac 2");
        Phuongtrinhbac2 obj=new Phuongtrinhbac2(-2,-4,2);
        obj.giaiPhuongTrinh();
        System.out.println(obj.toString());
    }
}
