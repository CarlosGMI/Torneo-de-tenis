package Fuente;

/**
 *
 * @author Jose Luis
 */
public class CND_Equipo implements java.io.Serializable 
{
    private ABB_Jugador atletas;
    private boolean tipoEquipo;
    private String sexo;
    private CND_Equipo prox;
    private CND_Equipo ant;
    
    public CND_Equipo()
    {
        
    }
    
    public CND_Equipo(String sexo, boolean tipoEquipo)
    {
        this.sexo = sexo;
        this.tipoEquipo = tipoEquipo;
        this.prox = null;
        this.ant = null;
    }
    
    public CND_Equipo(String sexo)
    {
        this.sexo = sexo;
    }

    public ABB_Jugador getAtletas() 
    {
        return atletas;
    }

    public void setAtletas(ABB_Jugador atletas) 
    {
        this.atletas = atletas;
    }

    public boolean isTipoEquipo() 
    {
        return tipoEquipo;
    }

    public void setTipoEquipo(boolean tipoEquipo)
    {
        this.tipoEquipo = tipoEquipo;
    }

    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }
    
    public CND_Equipo getProx() 
    {
        return prox;
    }

    public void setProx(CND_Equipo prox) 
    {
        this.prox = prox;
    }

    public CND_Equipo getAnt() 
    {
        return ant;
    }

    public void setAnt(CND_Equipo ant) 
    {
        this.ant = ant;
    }
}
