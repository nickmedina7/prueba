/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero3;

/**
 *
 * @author USER
 */
public class Invitados {
    private String Nombres;
    private String Apellidos;

    public Invitados(String Nombres, String Apellidos) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    
    
}
