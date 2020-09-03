/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Producto;

/**
 *
 * @author Asus VivoBook
 */
public class Controlador{
 
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setModelo(modelo);
        vista.setControlador(this);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }
    
    public void agregar(Producto p){
        modelo.getProductos().add(p);
        vista.update(modelo, p);
    }
    
    public void show(){
        vista.setVisible(true);
    }
    
}




