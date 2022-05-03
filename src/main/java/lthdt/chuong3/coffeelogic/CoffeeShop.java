/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.coffeelogic;

/**
 *
 * @author Viet Khoa
 */
public class CoffeeShop {
    private String name;
    private String eddress;

    public CoffeeShop() {
    }

    public CoffeeShop(String name, String eddress) {
        this.name = name;
        this.eddress = eddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEddress() {
        return eddress;
    }

    public void setEddress(String eddress) {
        this.eddress = eddress;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" + "name=" + name + ", eddress=" + eddress + '}';
    }
    
}
