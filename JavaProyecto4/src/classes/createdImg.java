/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Lester Trejos
 */
//Clase que guarda, el nombre de la que se le da a la postal, y las direcciones donde se encuentra la original
// y la direccion donde se va a guardar el resultado (postal)
public class createdImg {
    //Variables para guardar la info
    //Publicas para poder ser accedidas desde cualquier parte de la aplicación
    public String nombreProjecto;
    public String pathDireccionImgOriginal;
    public String pathDireccionImgResult;
    //Constructor de la clase
    public createdImg(String nombreProjecto, String pathDireccionImgOriginal, String pathDireccionImgResult) {
        this.nombreProjecto = nombreProjecto;
        this.pathDireccionImgOriginal = pathDireccionImgOriginal;
        this.pathDireccionImgResult = pathDireccionImgResult;
    }
}
