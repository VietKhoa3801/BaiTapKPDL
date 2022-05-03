/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author Viet Khoa
 */
public class pheptoan {
    public static void main(String[]args)
            {
             //các phép toán với số nguyên
                int a=17,b=4,c;
                c=a+b;
                System.out.println("Phep Cong"+a+"+"+b+"="+c);
                c=b-a;
                System.out.println("Phep Tru"+b+"-"+a+"="+c);
                c=a*b;
                System.out.println("Phep Nhan"+a+"*"+b+"="+c);
                c=a/b;
                System.out.println("Phep Chia Lay Phan Nguyen"+a+"/"+b+"="+c);
                c=a%b;
                System.out.println("Phep Chia Lay Phan Du"+a+"%"+b+"="+c);
             //Các phép toán với số thực
                double x=14.3,y=3.56,z;
                z=x+y;
                System.out.println("Phep Cong"+x+"+"+y+"="+z);
                z=y-x;
                System.out.println("Phep Tru"+y+"-"+x+"="+z);
                z=y*x;
                System.out.println("Phep Nhan"+x+"*"+y+"="+z);
                z=y/x;
                System.out.println("Phep Chia"+x+"/"+y+"="+z);
             //Các phép toán trên kiểu logic
                boolean flag1=true,flag2=false,flag3=true;
                System.out.println("Phep And" +(flag1&&flag2));
                System.out.println("Phep Or" +(flag1||flag2));
                System.out.println("Phep Not" +(!flag1));
                System.out.println("Phep Xor" +(flag1^flag3));
             //Một số phép toán cơ bản trên chuỗi
                String s1="Hue University";
                String s2="University";
                System.out.println(s1.toLowerCase());
                System.out.println(s2.toLowerCase());
                System.out.println(s1.contains(s2));
                s1 +=" "+ s2;
                System.out.println(s1);
            }
}
