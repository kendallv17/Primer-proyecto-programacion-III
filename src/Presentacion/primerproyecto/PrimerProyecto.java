/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.primerproyecto;

import Logica.Producto.Controlador;
import Logica.Producto.Modelo;
import Logica.Producto.Vista;

/**
 *
 * @author Asus VivoBook
 */
public class PrimerProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo=new Modelo();
        Vista vista=new Vista();
        Controlador controlador=new Controlador(modelo,vista);
        controlador.show();
        
        //agregooooooooooooooo
        //holaaaaaaaaaaaaaaaaaaaaa
    }
    
}
