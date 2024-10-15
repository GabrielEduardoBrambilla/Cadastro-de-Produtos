/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabri
 */
public class CadProdutoM {
    private int id;
    private String name;
    private String desc;
    private int price;
    private int qtd;
    
    public CadProdutoM(){
    }
    
    public CadProdutoM(int id, String name, String desc, int price, int qtd){
         this.id = id;
         this.name = name;
         this.desc = desc;
         this.price = price;
         this.qtd = qtd;
    }
    public CadProdutoM(int id){
           this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }

    public int getQtd() {
        return qtd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
}
