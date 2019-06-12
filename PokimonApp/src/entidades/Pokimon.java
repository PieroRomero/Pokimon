package entidades;


public class Pokimon
{
    public static String especie;
    public static String nombre;
    public static String tipo;
    public static int vidaMax;
    public static int salud;
    public static int nivel;
    public static int atk;  
    public static String imagen;
    

    public Pokimon(String species, String type) 
    {
        especie = species;
        tipo = type;
        nivel = 1;
        vidaMax = 40 + nivel*5;
        salud = vidaMax;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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
    
    public String VentajaElemental(Pokimon tu, Pokimon adv)
    {
        String res = null;
        if (tu.tipo == "agua")
        {
            if (adv.tipo == "agua")
            {
                res = "empate";
            }
            else if (adv.tipo == "hierba")
            {
                res = "pierde";
            }
            else if (adv.tipo == "fuego")
            {
                res = "gana"; 
            }
        }
        
        else if (tu.tipo == "fuego")
        {
            if (adv.tipo == "fuego")
            {
                res = "empate";
            }
            else if (adv.tipo == "agua")
            {
                res = "pierde";
            }
            else if (adv.tipo == "hierba")
            {
               res = "gana";
            }
        }
        
        else if (tu.tipo == "hierba")
        {
            if (adv.tipo == "hierba")
            {
                res = "empate";
            }
            else if (adv.tipo == "fuego")
            {
                res = "pierde";
            }
            else if (adv.tipo == "agua")
            {
                res = "gana";   
            }
        }
        
    return res;     
    }
       
    public void setAtk(int min, int max)
    {
        setAtk((int) randomConRango(min, max));
    }
    
    public void Atacar(Pokimon tu ,Pokimon adv)
    {
        String ventaja = null;
        int damage = 0;
        ventaja = VentajaElemental(tu, adv);
        if(ventaja == "gana")
        {
            setAtk(7, 12);
            damage = getAtk();
        }
        else 
        {
            setAtk(5,10);
            damage = getAtk();
        }
        
        int prob = randomConRango(1, 100);
        if (prob <= 20)
        {
            damage = getAtk() * 3;
        }
        
        adv.salud = adv.salud - damage;
    }
    
    
}
