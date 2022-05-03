/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.util.Random;

/**
 *
 * @author Viet Khoa
 */
public class testFor {
    public static void main(String[]args){
        //tính tổng thứ nhất
        int n=100;
        double s=0;
        for(int i=1;i<=n;i++){
            s=s+(double) 1/i;
        }
        System.out.println("Tong thu nhat la :"+s);
        //tính tổng thứ hai
        n=99;
        int s2=0;
        for(int i=1;i<=n;i +=2){
            s2=s2+i;
        }     
        System.out.println("Tong thu hai la:"+s2);
        //Sinh ngẫu nhiên n số nguyên
         Random rdn=new Random();
         int x;
        for(int i=0;i<10;i++){          
            x=rdn.nextInt(101);
            System.out.println(x);
        }
    }
}
