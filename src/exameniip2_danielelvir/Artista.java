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
public class Artista extends Usuario implements Serializable{

    private String Nom_Artistico;
    private ArrayList<Cancion> canSubidas = new ArrayList();
    private ArrayList<Album> AlbumPubli = new ArrayList();
    private static final long serialVersionUID = 777L;

    public Artista() {
        super();
    }

    public Artista(String Nom_Artistico, String Username, String Password, int Edad) {
        super(Username, Password, Edad);
        this.Nom_Artistico = Nom_Artistico;
    }

    public String getNom_Artistico() {
        return Nom_Artistico;
    }

    public void setNom_Artistico(String Nom_Artistico) {
        this.Nom_Artistico = Nom_Artistico;
    }

    public ArrayList<Cancion> getCanSubidas() {
        return canSubidas;
    }

    public void setCanSubidas(ArrayList<Cancion> canSubidas) {
        this.canSubidas = canSubidas;
    }

    public ArrayList<Album> getAlbumPubli() {
        return AlbumPubli;
    }

    public void setAlbumPubli(ArrayList<Album> AlbumPubli) {
        this.AlbumPubli = AlbumPubli;
    }

    @Override
    public String toString() {
        return Nom_Artistico;
    }

    
}
