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
public class Lanzamiento {
    private String Titulo;
    private String fechaLanz;
    private int Likes;

    public Lanzamiento(String Titulo, String fechaLanz, int Likes) {
        this.Titulo = Titulo;
        this.fechaLanz = fechaLanz;
        this.Likes = Likes;
    }

    

    public Lanzamiento() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFechaLanz() {
        return fechaLanz;
    }

    public void setFechaLanz(String fechaLanz) {
        this.fechaLanz = fechaLanz;
    }    

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    @Override
    public String toString() {
        return Titulo;
    }
    
    
}
