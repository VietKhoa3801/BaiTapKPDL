/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong4.logic;

/**
 *
 * @author Viet Khoa
 */
public class FibonacciNumber {

    public FibonacciNumber() {
    }
    public int calcFibo(int n){
        //Điều kiện dừng
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        //Lời gọi đệ quy
        return (calcFibo(n-1)+calcFibo(n-2));
    }
}
