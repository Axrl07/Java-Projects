package com.mycompany.practica2_gestiondelivery;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Producto implements Serializable {

    private String nombre;
    private float costo;

    // constructor    
    public Producto(String name, float cost) {
        this.nombre = name;
        this.costo = cost;
    }

    // getter
    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    // setter
    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public void setCosto(float newCosto) {
        this.costo = newCosto;
    }

    // listados
    public static ArrayList<Producto> listadoProductos = new ArrayList<>(); // se serializa
    public static ArrayList<Producto> compras = new ArrayList<>();          // no se serializa

    // devuelve un articulo
    public static Producto getProducto(String nombreProductoBuscado, ArrayList<Producto> listadoDeInteres) {
        for (Producto p : listadoDeInteres) {
            if (nombreProductoBuscado.equalsIgnoreCase(p.getNombre())) {
                return p;
            }
        }
        return null;
    }

    // agregar un articulo
    public static void AddProductoListado(Producto producto, ArrayList<Producto> listadoDeInteres) {
        listadoDeInteres.add(producto);
    }

    // elimina un articulo del pedido
    public static void RemoveProductoPedido(Producto producto, ArrayList<Producto> listadoDeInteres) {
        for (Producto p : listadoDeInteres) {
            if (producto.getNombre().equalsIgnoreCase(p.getNombre())) {
                listadoDeInteres.remove(p);
                JOptionPane.showMessageDialog(null, "se ha removido exitosamente el producto del listado de Pedidos", "Remover Producto del pedido", JOptionPane.WARNING_MESSAGE);
                break;
            }
        }
    }
}
