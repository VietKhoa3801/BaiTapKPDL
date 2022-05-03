/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Viet Khoa
 */
public class Bai06 {
    public static void main(String[]orgs) throws ParseException
            {
             SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
             String input="11-03-2001";
             Date ngaysinh=df.parse(input);
             Person person=new Person("Nguyen Van A",1, ngaysinh);
             System.out.println("Ho ten:"+person.getHoten()+";Gioi tinh:"+person.getGioitinh()+";Ngay sinh:"+df.format(person.getNgaysinh()));
             Student sinhvien=new Student();
             sinhvien.setHoten("Nguyen Van B");
             sinhvien.setGioitinh(1);
             sinhvien.setNgaysinh(df.parse("12-02-2002"));
             sinhvien.setTruonghoc("Dai Hoc Hue");
             System.out.println(sinhvien.getHoten()+";Gioi tinh:"+sinhvien.getGioitinh()+";Ngay sinh:"+df.format(sinhvien.getNgaysinh())+";"+sinhvien.getTruonghoc());
             System.out.println(sinhvien.calcTaxt(1200));
             Worker congnhan= new Worker();
             congnhan.setHoten("Nguyen Thi C");
             congnhan.setGioitinh(0);
             congnhan.setNgaysinh(df.parse("02-09-2003"));
             congnhan.setCongty("IBM");
             System.out.println(congnhan.getHoten()+";Gioi tinh:"+congnhan.getGioitinh()+";Ngay sinh:"+df.format(congnhan.getNgaysinh())+";Cong ty:"+congnhan.getCongty());
             System.out.println(congnhan.calcTaxt(2000));
            }
}
