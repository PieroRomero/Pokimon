package entidades;


public class Pokimon
{
    private String especie;
    private String nombre;
    private String tipo;
    private int vidaMax;
    private int salud;
    private int nivel;
    private int atk;  

    public Pokimon(String species, String type) 
    {
        especie = species;
        tipo = type;
        nivel = 1;
        vidaMax = 40 + nivel*5;
        salud = vidaMax;
    }

    public String getEspecie() 
    {
        return especie;
    }

    public void setEspecie(String especie) 
    {
        this.especie = especie;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public int getVidaMax() 
    {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax)
    {
        this.vidaMax = vidaMax;
    }

    public int getSalud() 
    {
        return salud;
    }

    public void setSalud(int salud) 
    {
        this.salud = salud;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public int getAtk()
    {
        return atk;
    }

    public void setAtk(int atk)
    {
        this.atk = atk;
    }
    
    public int randomConRango(int min, int max)
    {
       int range = (max - min) + 1;     
       return (int)(Math.random() * range) + min;
    }
    
    public void setAtk()
    {
        setAtk((int) randomConRango(5, 10));
    }
    
    public void Atacar(Pokimon oponente)
    {
        int prob = randomConRango(1, 100);
        if (prob <= 20)
        {
            setAtk();
            setAtk(atk *2);
        }
        else
        {
            setAtk();
        }
    }
}
