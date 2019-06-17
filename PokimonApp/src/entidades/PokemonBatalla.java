package entidades;

public class PokemonBatalla 
{
    private String especie;
    private String tipo;
    private int vidaMax;
    private int salud;
    private int nivel;
    private int atk; 

    public PokemonBatalla(String especie, String tipo, int vidaMax, int salud, int nivel) {
        this.especie = especie;
        this.tipo = tipo;
        this.vidaMax = vidaMax;
        this.salud = salud;
        this.nivel = nivel;
    
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
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
    
    public String VentajaElemental(PokemonBatalla tu, PokemonBatalla adv)
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
    
    public void Atacar(PokemonBatalla tu ,PokemonBatalla adv)
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
        adv.setSalud(adv.salud);
    }
    
    public void Curar()
    {
        int cont = 3;
        if (cont > 0){
            setSalud(getSalud() + 15);
        }
        cont = cont - 1;  
    }

}
