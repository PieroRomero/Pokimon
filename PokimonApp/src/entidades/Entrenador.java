package entidades;

import entidades.Pokimon;
import javax.swing.JOptionPane;

public class Entrenador 
{
    public static String nombre;
    public static String sexo;
    public static Pokimon pokimon;
    public static int posiones;
    public static String imagen; 

    public Entrenador()
    {
        nombre = "";
        posiones = 3;
        
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pokimon getPokimon() {
        return pokimon;
    }

    public void setPokimon(Pokimon pokimon) {
        this.pokimon = pokimon;
    }

    public int getPosiones() {
        return posiones;
    }

    public void setPosiones(int posiones) {
        this.posiones = posiones;
    }
    
    public void LanzarAtaque(Pokimon pokimon, Pokimon adv)
    {
        pokimon.Atacar(pokimon, adv);
    }
    
    public void UsarPosion()
    {
        if (posiones > 0)
        {
            pokimon.setSalud(pokimon.getSalud() + 15);
            posiones = posiones - 1;
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya no le quedan posiones");
        }
    }
    
    
}