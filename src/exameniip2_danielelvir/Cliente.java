/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_danielelvir;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Cliente extends Usuario implements Serializable{
    private ArrayList<Cancion> canciones_fav= new ArrayList();
    private ArrayList<Lista_Reproduccion> ListasReproduccion = new ArrayList();
    private ArrayList<Lista_Reproduccion> ListasFav = new ArrayList();
    private static final long serialVersionUID = 777L;

    public Cliente(String Username, String Password, int Edad) {
        super(Username, Password, Edad);
    }

    public Cliente() {
        super();
    }           

    public ArrayList<Cancion> getCanciones_fav() {
        return canciones_fav;
    }

    public void setCanciones_fav(ArrayList<Cancion> canciones_fav) {
        this.canciones_fav = canciones_fav;
    }

    public ArrayList<Lista_Reproduccion> getListasReproduccion() {
        return ListasReproduccion;
    }

    public void setListasReproduccion(ArrayList<Lista_Reproduccion> ListasReproduccion) {
        this.ListasReproduccion = ListasReproduccion;
    }

    public ArrayList<Lista_Reproduccion> getListasFav() {
        return ListasFav;
    }

    public void setListasFav(ArrayList<Lista_Reproduccion> ListasFav) {
        this.ListasFav = ListasFav;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
