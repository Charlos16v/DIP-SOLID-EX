package edu.pingpong.dip.bbdd;


import edu.pingpong.dip.negocio.Inventario;

public class InventarioBBDD implements Inventario {


    // Metodo de consulta a la base de datos

    @Override
    public int numeroProductos(String tienda, String producto) {
        return BBDD.stocs.get(tienda).get(producto);
    }
}
