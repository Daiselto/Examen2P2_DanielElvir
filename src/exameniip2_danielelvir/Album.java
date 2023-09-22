/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_danielelvir;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
class Album extends Lanzamiento{
    private ArrayList<Cancion> Pertenecientes = new ArrayList();
    private int TotalCancion;

    public Album() {
        super();
    }

    public Album(int TotalCancion, String Titulo, Date fechaLanz, int Likes) {
        super(Titulo, fechaLanz, Likes);
        this.TotalCancion = TotalCancion;
    }

    public ArrayList<Cancion> getPertenecientes() {
        return Pertenecientes;
    }

    public void setPertenecientes(ArrayList<Cancion> Pertenecientes) {
        this.Pertenecientes = Pertenecientes;
    }

    public int getTotalCancion() {
        return TotalCancion;
    }

    public void setTotalCancion(int TotalCancion) {
        this.TotalCancion = TotalCancion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
