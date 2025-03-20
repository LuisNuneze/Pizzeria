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
public class Pizzeria {

    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public boolean addCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    public boolean addPedido(Pedido pedido) {
        pedidos.add(pedido);
        return true;
    }

    public boolean addItem(Item item) {
        items.add(item);
        return true;
    }

    public Cliente getCliente(int index) {
        return clientes.get(index);
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public int calcProdMasVendidoCliente(int numClient) {
        int Ventas[] = {0, 0, 0, 0, 0};
        Cliente x = clientes.get(numClient);
        System.out.println("Num cliente = "+numClient);
        for (Pedido p : x.getPedido()) {
            for (int i = 0; i < items.size(); i++) {
                for (Item it : p.getItems()) {
                    if (items.get(i).getNombre() == it.getNombre()&&p instanceof PedidoOnLine) {
                        Ventas[i] = Ventas[i]+1;
                    }
                }
            }
        }
        int maxVentas = 0;
        int i = 0;
        int id = -1;
        for (int v : Ventas) {
            if (v > maxVentas) {
                maxVentas = v;
                id = i;
            }
            System.out.println("El producto "+items.get(i).getNombre()+" se vendio "+Ventas[i]);
            i++;
        }
        return id;
    }
}
