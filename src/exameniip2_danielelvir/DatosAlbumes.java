/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_danielelvir;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DatosAlbumes {
    private ArrayList<Album> listaAlbum = new ArrayList();
    private File archivo = null;

    public DatosAlbumes() {
    }
    
    public DatosAlbumes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Album> getArtista() {
        return listaAlbum;
    }

    public void setListaArtista(ArrayList<Album> listaAlbum) {
        this.listaAlbum = listaAlbum;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(Album p){
        listaAlbum.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaAlbum = new ArrayList();
            Album temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Album) objeto.readObject()) != null) {
                        listaAlbum.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Album t : listaAlbum) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
