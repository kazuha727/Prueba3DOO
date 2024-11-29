/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automoviliza;

import Bd.Conexion;
import java.util.ArrayList;
import views.Menu;

/**
 *
 * @author Cetecom
 */
public class AutoMoviliza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx = new Conexion();
        cx.conectar();
        
        
        Menu m = new Menu();
        m.setVisible(true);
        
        
       
    }

    
    
    
}
