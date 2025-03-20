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
public abstract class Pedido {

    protected Cliente cliente;
    protected ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        for (Item i : items) {
            this.items.add(i);
        }
        this.cliente.addPedido(this);
    }

    public Cliente getCliente() {
        return cliente;
    }
}
