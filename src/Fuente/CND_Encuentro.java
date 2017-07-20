package Fuente;

/**
 *
 * @author EDWIN
 */
public class CND_Encuentro implements java.io.Serializable
{
    private CND_Encuentro prox;
    private CND_Encuentro ant;
    private String tipoJuego;
    private String equipoGanador;
    private int numeroEnc;
    
    public CND_Encuentro()
    {
        
    }
    
    public CND_Encuentro(String tipoJuego, String equipoGanador)
    {
        this.tipoJuego = tipoJuego;
        this.equipoGanador = equipoGanador;
        this.prox = null;
        this.ant = null;
    }

    public String getTipoJuego() 
    {
        return tipoJuego;
    }

    public void setTipoJuego(String tipoJuego) 
    {
        this.tipoJuego = tipoJuego;
    }

    public String getEquipoGanador()
    {
        return equipoGanador;
    }

    public void setEquipoGanador(String equipoGanador)
    {
        this.equipoGanador = equipoGanador;
    }

    public int getNumeroEnc() 
    {
        return numeroEnc;
    }

    public void setNumeroEnc(int numeroEnc) 
    {
        this.numeroEnc = numeroEnc;
    }

    public CND_Encuentro getProx() 
    {
        return prox;
    }

    public void setProx(CND_Encuentro prox)
    {
        this.prox = prox;
    }

    public CND_Encuentro getAnt() 
    {
        return ant;
    }

    public void setAnt(CND_Encuentro ant) 
    {
        this.ant = ant;
    }
}
