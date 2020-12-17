/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Forms.VistaCrearPostal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Lester Trejos
 */
public class createBinManager {
    //Variables
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    
    //Método para escribir en el archivo binario
    public void writeObject (Object object, int val) {
        try {
            if (val == 1) {
                oos = new ObjectOutputStream(new FileOutputStream("file.bin"));
            }
            if (val == 2) {
                oos.writeObject(object);    
            }
            if (val == 3) {
                oos.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Método para leer en el archivo binario
    public void readObject () {  
        try {
            ois = new ObjectInputStream(new FileInputStream("file.bin"));
            Object aux = ois.readObject();
            while (aux!=null) {  
                 if (aux instanceof createdImg){
                     File archivo = new File(((createdImg) aux).pathDireccionImgOriginal);
                     File archivo2 = new File(((createdImg) aux).pathDireccionImgResult);
                     if (archivo.exists() && archivo2.exists()) {
                        VistaCrearPostal.resultsImg.add((createdImg) aux);
                     }
                 }
                aux = ois.readObject();
            }
            ois.close();
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
    }
}
