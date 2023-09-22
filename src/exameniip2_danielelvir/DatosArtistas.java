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
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DatosArtistas{
    private ArrayList<Artista> listaArtista = new ArrayList();
    private File archivo = null;

    public DatosArtistas() {
    }
    
    public DatosArtistas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Artista> getArtista() {
        return listaArtista;
    }

    public void setListaArtista(ArrayList<Artista> listaArtista) {
        this.listaArtista = listaArtista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(Artista p){
        listaArtista.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            Artista temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Artista) objeto.readObject()) != null) {
                        System.out.println(temp.getUsername());
                        listaArtista.add(temp);
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
            for (Artista t : listaArtista) {
                System.out.println(t.getUsername());
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
