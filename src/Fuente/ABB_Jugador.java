package Fuente;

/**
 *
 * @author Jose Luis
 */
public class ABB_Jugador implements java.io.Serializable
{
    private CNA_Jugador raiz;
    private CCola_Jugadores colaJugadores;

    public ABB_Jugador()
    {
        
    }
    
    public ABB_Jugador(CNA_Jugador raiz) 
    {
        this.raiz = raiz;
    }
    
    public boolean estaVacio()
    {
        return raiz == null;
    }
    
    public void Insertar(CNA_Jugador aux, CNA_Jugador nuevo) 
    {
        if (aux==null)
        {
            raiz = nuevo;
        }
	else if (nuevo.getCedula() < aux.getCedula())
	{
            if (aux.getHijoIzq() == null)
            {
		aux.setHijoIzq(nuevo);
            }
            else
            {
                Insertar(aux.getHijoIzq(), nuevo);
            }
        }
	else if (nuevo.getCedula() > aux.getCedula())
	{
            if (aux.getHijoDer()== null)
            {
		aux.setHijoDer(nuevo);
            }
            else
            {
		Insertar(aux.getHijoDer(), nuevo);
            }
        }

    }
    
    public CNA_Jugador buscar(CNA_Jugador aux, String jugBuscado)
    {
        if(!estaVacio())
        {
            if (aux.getNombre().equalsIgnoreCase(jugBuscado))
            {
                return aux;
            }
            else if(aux.getHijoIzq() != null && aux.getHijoDer() != null)
            {
                if(jugBuscado.compareToIgnoreCase(aux.getNombre()) < 0)
                {
                    return buscar(aux.getHijoIzq(),jugBuscado);
                }
                else
                {
                    return buscar(aux.getHijoDer(),jugBuscado);
                }
            }
            else if(aux.getHijoIzq() != null)
            {
                return buscar(aux.getHijoIzq(),jugBuscado);
            }
            else
            {
                return buscar(aux.getHijoDer(),jugBuscado);
            }
        }
        else
        {
            System.out.println("El árbol está vacío!");
        }
        return null;
    }
    
    public String eliminar(CNA_Jugador aux, CNA_Jugador aux2, String jugEliminado)
    {
        
        return null;
    }

    public CCola_Jugadores getColaJugadores() 
    {
        return colaJugadores;
    }

    public void setColaJugadores(CCola_Jugadores colaJugadores) 
    {
        this.colaJugadores = colaJugadores;
    }

    public CNA_Jugador getRaiz() 
    {
        return raiz;
    }

    public void setRaiz(CNA_Jugador raiz) 
    {
        this.raiz = raiz;
    }
}
