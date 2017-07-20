package Fuente;

public class CCola_Jugadores implements java.io.Serializable
{
    private CNCola_Jugadores primeroCola;
    
    public CCola_Jugadores()
    {
        this.primeroCola = null;
    }
    
    public CCola_Jugadores(CNCola_Jugadores primeroCola)
    {
        this.primeroCola = primeroCola;
    }
    
    public boolean estaVacia() 
    {
        return primeroCola == null;
    }
    
    public String primeroCola()
    {
        return this.getPrimeroCola().getNombre();
    }
    
    public void encolar(CNCola_Jugadores nuevoJugador)
    {
        if (estaVacia()) 
        {
            primeroCola = nuevoJugador;
        } 
        else 
        {
            CNCola_Jugadores aux = primeroCola;
            while(aux.getProx() != null)
            {
                aux=aux.getProx();
            }
            aux.setProx(nuevoJugador);
        }
    }
    
    public CNCola_Jugadores desencolar()
    {
        CNCola_Jugadores jugadorEliminado = new CNCola_Jugadores();
        if (!estaVacia()) 
        {
            jugadorEliminado = primeroCola;
            primeroCola = primeroCola.getProx();
            jugadorEliminado.setProx(null);
        } 
        return jugadorEliminado;
    }

    public CNCola_Jugadores getPrimeroCola() 
    {
        return primeroCola;
    }

    public void setPrimeroCola(CNCola_Jugadores primeroCola) 
    {
        this.primeroCola = primeroCola;
    }
}
