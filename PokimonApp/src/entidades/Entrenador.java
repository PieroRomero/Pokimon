package entidades;

public class Entrenador 
{
    private String nombre;
    private String sexo;
    private Pokimon pokimon;
    private int posiones;

    public Entrenador()
    {
        posiones = 3;
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
}