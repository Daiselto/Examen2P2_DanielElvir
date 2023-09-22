/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_danielelvir;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Singles extends Lanzamiento{
    private Cancion Cancion;

    public Singles() {
    }

    public Singles(Cancion Cancion, String Titulo, Date fechaLanz, int Likes) {
        super(Titulo, fechaLanz, Likes);
        this.Cancion = Cancion;
    }

    public Cancion getCancion() {
        return Cancion;
    }

    public void setCancion(Cancion Cancion) {
        this.Cancion = Cancion;
    }

    @Override
    public String toString() {
        return Cancion.toString();
    }
    
    
}
