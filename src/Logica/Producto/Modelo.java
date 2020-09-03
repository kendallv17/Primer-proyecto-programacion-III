/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Asus VivoBook
 */
public class Modelo extends Observable{
    
   private List<Producto> productos;

    public Modelo() {
        productos=new ArrayList<>();
        Producto p=new Producto("k-4345","Medicina",42325);
        productos.add(p);
        //agregar un valor predeterminado...
    }
    //
    
    
    

    @Override
    protected synchronized void setChanged() {
        super.setChanged(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        setChanged();
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
   
}
