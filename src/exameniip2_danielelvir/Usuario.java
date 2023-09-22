/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_danielelvir;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Usuario implements Serializable{
    private String Username;
    private String Password;
    private int Edad;
    private static final long serialVersionUID = 777L;

    public Usuario(String Username, String Password, int Edad) {
        this.Username = Username;
        this.Password = Password;
        this.Edad = Edad;
    }

    public Usuario() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return Username;
    }
    
    
}
