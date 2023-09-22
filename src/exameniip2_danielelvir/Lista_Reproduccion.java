/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_danielelvir;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
class Lista_Reproduccion {
    private String Nombre;
    private int Likes;
    private ArrayList<Cancion> canciones = new ArrayList();

    public Lista_Reproduccion(String Nombre, int Likes) {
        this.Nombre = Nombre;
        this.Likes = Likes;
    }

    public Lista_Reproduccion() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    
}
