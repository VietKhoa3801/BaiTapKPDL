/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lthdt.chuong2.employee.logic.Student;

/**
 *
 * @author Viet Khoa
 */
public class testStudent {
    public static void main(String[]args) throws ParseException
    {
        SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input="12-12--1999";
        Date ngaysinh=df.parse(input);
        Student obj=new Student("Dai Hoc Hue", "Xuat sac", "Nguyen Van A", 1, ngaysinh);
        switch(obj.getHocluc()){
            case"Xuat sac":
                obj.setHocbong(1000);
                break;
                case"gioi":
                    obj.setHocbong(855.5);
                            break;
                default:
                    obj.setHocbong(0);
                    break;
        }
        System.out.println(obj);
    }
}
