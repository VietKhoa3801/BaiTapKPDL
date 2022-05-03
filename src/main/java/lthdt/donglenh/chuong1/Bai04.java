/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author Viet Khoa
 */
public class Bai04 {
    public static void main(String[]args)
            {
             Shape htron=new Circle(5,1,2);
             System.out.println("Chu Vi Cua Hinh Tron La " +htron.calcPerimeter());
             System.out.println("Dien Tich Cua Hinh Tron La " +htron.calcArea());
             System.out.println(htron.toString());
             Shape hcn=new Rectangle(3,15,8,5);
             System.out.println("Chu Vi Hinh Chu Nhat La " +hcn.calcPerimeter());
             System.out.println("Dien Tich Hinh Chu Nhat La " +hcn.calcArea());
             System.out.println(hcn);
            }
}
