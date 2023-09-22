/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_danielelvir;

/**
 *
 * @author HP
 */
class Cancion {
    private String Titulo;
    private double Tiempo;
    private Album Album;
    private Singles Single;

    public Cancion() {
    }

    public Cancion(String Titulo, double Tiempo, Album Album) {
        this.Titulo = Titulo;
        this.Tiempo = Tiempo;
        this.Album = Album;
    }

    public Cancion(String Titulo, double Tiempo, Album Album, Singles Single) {
        this.Titulo = Titulo;
        this.Tiempo = Tiempo;
        this.Album = Album;
        this.Single = Single;
    }

    public Cancion(String Titulo, double Tiempo, Singles Single) {
        this.Titulo = Titulo;
        this.Tiempo = Tiempo;
        this.Single = Single;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public double getTiempo() {
        return Tiempo;
    }

    public void setTiempo(double Tiempo) {
        this.Tiempo = Tiempo;
    }

    public Album getAlbum() {
        return Album;
    }

    public void setAlbum(Album Album) {
        this.Album = Album;
    }

    public Singles getSingle() {
        return Single;
    }

    public void setSingle(Singles Single) {
        this.Single = Single;
    }

    @Override
    public String toString() {
        return Titulo;
    }
    
    
}
