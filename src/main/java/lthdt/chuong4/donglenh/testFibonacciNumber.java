/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong4.donglenh;

import lthdt.chuong4.logic.FibonacciNumber;

/**
 *
 * @author Viet Khoa
 */
public class testFibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciNumber fn=new FibonacciNumber();
        System.out.println("So Fibonacci tai vi n=15 la" +fn.calcFibo(15));
        for(int i=1;i<=20;i++){
            System.out.println(fn.calcFibo(i)+", ");
        }
    }
    
}
