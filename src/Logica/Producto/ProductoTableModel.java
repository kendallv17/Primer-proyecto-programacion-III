/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Producto;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus VivoBook
 */
public class ProductoTableModel  extends AbstractTableModel {
    
    private List<Producto> productos;
    private final String datos[]={"Codigo:","Descripción:","Precio:"};

    public ProductoTableModel(List<Producto> productos) {
        this.productos = productos;
    }
    

    
    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return datos.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      DecimalFormat x=new DecimalFormat("0");
       switch (columnIndex){
           case 0: return (productos.get(rowIndex).getCodigo());
           case 1: return (productos.get(rowIndex).getNombre());
           case 2: return x.format(productos.get(rowIndex).getPrecio());
       }
       return null;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String getColumnName(int column) {
       return datos[column];
    }
}


