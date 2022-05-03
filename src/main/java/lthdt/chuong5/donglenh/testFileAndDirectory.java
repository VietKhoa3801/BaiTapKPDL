/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong5.donglenh;

import java.io.File;
import lthdt.chuong5.logic.FileAndDirectoryOperations;

/**
 *
 * @author Viet Khoa
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperations fo=new FileAndDirectoryOperations();
//        File[]content=fo.getDirectoryContent("C:\\Users\\Viet Khoa\\Pictures\\Ảnh VK");
        //System.out.println(fo.displayContent(content));
//        File[] thumuc= fo.getSubDirectories(content);
//        System.out.println("Danh sach cac thu muc con la");
//        System.out.println(fo.displayContent(thumuc));
//        File[] taptin=fo.getFiles(content);
//        System.out.println("Danh sach cac tap tin");
//        System.out.println(fo.displayContent(taptin));
          fo.getContentRecursively("C:\\Program Files (x86)");
    }
    
}
