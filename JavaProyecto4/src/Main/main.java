/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Forms.*;
import classes.createBinManager;
import classes.createdImg;
import java.io.File;

/**
 *
 * @author Lester Trejos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    //Main que carga el Menú para iniciar con el uso del sistema
    public static void main(String[] args) {
        //Obtener postales ya creadas 
         
        try {
            createBinManager bin = new createBinManager();
            bin.readObject();
        } catch (Exception e) {
            System.out.println("archivoBinario");
        }
                
        //Llamar al main
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
    
}
