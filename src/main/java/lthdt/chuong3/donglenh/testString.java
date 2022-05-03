/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

/**
 *
 * @author Viet Khoa
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content="Long lanh day nuoc in troi \n Thanh xay khoi biec non phoi bong vang ";
        System.out.println(content);
        //Thao tác 1: tìm vị trí của 1 kí tự
        System.out.println("Vi tri cua ki tu a trong chuoi la: "+content.indexOf('a'));
        System.out.println("Vi tri cua tu nuoc trong chuoi la:"+content.indexOf("nuoc"));
        //Thao tác 2:Kiểm tra khởi đầu và kết thúc
        System.out.println("Chuoi mo dau bang cum tu long:"+content.startsWith("Long"));
        System.out.println("Chuoi mo dau bang cum tu troi:"+content.endsWith("troi"));
        //Thao tác 3:Cắt chuỗi theo vị trí
        String temp=content.substring(20,26);
        System.out.println("Chuoi con la:"+temp);
        //Thao tác 4:Phân tách chuỗi
        String[]result=content.split("\n");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        //Thao tác 5:Loại bỏ khoảng trắng đầu-cuối chuỗi
         for(int i=0;i<result.length;i++){
            System.out.println(result[i].trim());
        }
         //Thao tác 6:Thay thế kí tự
         temp=content.replace('a','z');
         System.out.println(temp);
         //Thao tác 7: Chuyển kiểu
         temp=content.toUpperCase();
         System.out.println(temp);
         temp=content.toLowerCase();
         System.out.println(temp);
         //Thao tác 8: So sánh chuỗi
         temp="Nguyen";
         if(temp.compareToIgnoreCase("nguyen")==0){
             System.out.println("2 chuoi bang nhau");
         }else{
             System.out.println("2 chuoi khong bang nhau");
         }
         //Thao tác 9: Nối chuỗi
         temp=temp.concat(" Van A");
         System.out.println(temp);
         //Thao tác 10: Truy xuất bằng chỉ số
         for(int i=0;i<temp.length();i++){
             System.out.println(temp.charAt(i));
         }
         System.out.println("");
         //Thao tác 11: Chuyển kiểu
         temp="155";
         int n=Integer.parseInt(temp);
         System.out.println("n="+n);
         //Thao tác 12: Sử dụng Stringbuilder
         StringBuilder sb= new StringBuilder();
         sb.append("Long lanh day nuoc in troi\n");
         sb.append("Thanh xay khoi biec non phoi bong vang");
         temp=sb.toString();
         System.out.println(sb);
    }
    
}
