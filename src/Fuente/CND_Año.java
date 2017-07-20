package Fuente;

/**
 *
 * @author Jose Luis
 */
public class CND_Año implements java.io.Serializable
{
    private CLS_Universidad universidades;
    private CND_Año prox;
    private CND_Año ant;
    private int año;
    
    public CND_Año()
    {
        
    }
    
    public CND_Año(int año)
    {
        this.año = año;
        prox = null;
        ant = null;
    }
        public CND_Año(int año,CLS_Universidad x)
    {
        this.año = año;
        this.universidades=x;
        prox = null;
        ant = null;
    }

    public CLS_Universidad getUniversidades()
    {
        return universidades;
    }

    public void setUniversidades(CLS_Universidad universidades) 
    {
        this.universidades = universidades;
    }

    public CND_Año getProx() 
    {
        return prox;
    }

    public void setProx(CND_Año prox) 
    {
        this.prox = prox;
    }

    public CND_Año getAnt() 
    {
        return ant;
    }

    public void setAnt(CND_Año ant) 
    {
        this.ant = ant;
    }

    public int getAño() 
    {
        return año;
    }

    public void setAño(int año) 
    {
        this.año = año;
    }
}
