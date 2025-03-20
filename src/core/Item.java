/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Luis Ernesto Nuñez
 */
public class Item {
    private int id;
    private String nombre;
    private int valor;
    private static int idA = 0;
    public Item(Item item){
        this.id = item.id;
        this.nombre = item.nombre;
        this.valor = item.valor;
    }
    public Item(String nombre, int valor) {
        this.id = idA;
        this.nombre = nombre;
        this.valor = valor;
        idA++;
    }
    public String getNombre() {
        return nombre;
    }
    
}
