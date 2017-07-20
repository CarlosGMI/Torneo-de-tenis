package Fuente;

/**
 *
 * @author Jose Luis
 */
public class CNS_Categoria implements java.io.Serializable
{
    private CLD_Equipo equipos;
    private CLD_Encuentro encuentros;
    private CNS_Categoria prox;
    private int numCat;
    
    public CNS_Categoria()
    {
        
    }
    
    public CNS_Categoria(int numCat)
    {
        this.numCat = numCat;
        this.prox = null;
    }

    public CLD_Equipo getEquipos() 
    {
        return equipos;
    }

    public void setEquipos(CLD_Equipo equipos) 
    {
        this.equipos = equipos;
    }

    public CLD_Encuentro getEncuentros() 
    {
        return encuentros;
    }

    public void setEncuentros(CLD_Encuentro encuentros) 
    {
        this.encuentros = encuentros;
    }

    public int getNumCat() 
    {
        return numCat;
    }

    public void setNumCat(int numCat)
    {
        this.numCat = numCat;
    }
    
    public CNS_Categoria getProx() 
    {
        return prox;
    }

    public void setProx(CNS_Categoria prox) 
    {
        this.prox = prox;
    }
}
