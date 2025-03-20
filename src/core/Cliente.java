/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Luis Ernesto Nuñez
 */
public class Cliente {

    private String nombre;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public boolean addPedido(Pedido pedido) {
        pedidos.add(pedido);
        return true;
    }

    public ArrayList<Pedido> getPedido() {
        return pedidos;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}
