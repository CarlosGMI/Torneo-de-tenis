package Fuente;

/**
 *
 * @author Jose Luis
 */
public class CLD_Equipo implements java.io.Serializable
{
    private CND_Equipo cabeza;
    private CND_Equipo cola;
    
    public CLD_Equipo()
    {
        this.cabeza = null;
    }
    
    public CLD_Equipo(CND_Equipo cabeza)
    {
        this.cabeza = cabeza;
    }
    
    public boolean estaVacia() 
    {
        return cabeza == null;
    }
    
    public void insertarPrimero(CND_Equipo nuevoEquipo) 
    {
        if (estaVacia()) 
        {
            cabeza = cola = nuevoEquipo;
        } 
        else 
        {
            if(cabeza == cola)
            {
                nuevoEquipo.setProx(cabeza);
                cola = cabeza;
                cabeza = nuevoEquipo;
                cola.setAnt(cabeza);
            }
            else{
                nuevoEquipo.setProx(cabeza);
                cabeza.setAnt(nuevoEquipo);
                cabeza = nuevoEquipo;
            }   
        }
    }
    
    public void insertarFinal(CND_Equipo nuevoEquipo) 
    {
        if (estaVacia()) 
        {
            cabeza = cola = nuevoEquipo;
        } 
        else 
        {
            cola.setProx(nuevoEquipo);
            nuevoEquipo.setAnt(cola);
            cola = nuevoEquipo;           
        }
    }
    
    public CND_Equipo eliminarPrimero() 
    {
        CND_Equipo equipoEliminado = null;
        if (!estaVacia()) 
        {
            if(cabeza == cola)
            {
                equipoEliminado = cabeza;
                cabeza = cola = null;
            }
            else
            {
                equipoEliminado = cabeza;
                cabeza= cabeza.getProx();
                cabeza.setAnt(null);
                equipoEliminado.setProx(null);
            }
        }   
        return equipoEliminado;
    }
    
    public CND_Equipo eliminarFinal() 
    {
        CND_Equipo equipoEliminado = null;
        if (!estaVacia())
        {
            if(cabeza==cola)
            {
                equipoEliminado = cabeza;
                cabeza = cola = null;
            }
            else
            {
                equipoEliminado = cola;
                cola = cola.getAnt();
                cola.setProx(null);
                equipoEliminado.setAnt(null);
            }
        }
        return equipoEliminado;
    }
    
    public CND_Equipo eliminarPosicion(int posicion)
    {
        CND_Equipo equipoEliminado = null;
        if(!estaVacia())
        {
            if(posicion == 1)
            {
    		equipoEliminado = eliminarPrimero();
            }
            else if(posicion == contar())
            {
    		equipoEliminado = eliminarFinal();
            }
            else if(posicion > contar() + 1)
            {
    		System.out.println("Error! Posicion nula");
            }   
            else
            {
    		CND_Equipo aux = cabeza;
    		int cont = 1;
    		while(cont < posicion - 1)
    		{
    		    cont++;
                    aux = aux.getProx();
    		}
    		equipoEliminado = aux.getProx();
    		aux.setProx(equipoEliminado.getProx());
                equipoEliminado.getProx().setAnt(aux);
    		equipoEliminado.setProx(null);	
                equipoEliminado.setAnt(null);	
            }
        }
        return equipoEliminado;
    }
    
    public int contar()
    {
        CND_Equipo aux = cabeza;
        int cont = 0;
        while(aux != null)
        {
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }
  
    public CND_Equipo buscar(String sexo)
    {
        if(!estaVacia())
        {
            CND_Equipo aux = cabeza;
            CND_Equipo actual = cabeza;
            while(!aux.getSexo().equals(sexo))
            {
                aux = aux.getProx();
                actual = aux;
                //actual = aux.getProximo();
            }
            return actual;
        }
        else
        {
            return null;
        }
    }

    public CND_Equipo getCabeza() 
    {
        return cabeza;
    }

    public void setCabeza(CND_Equipo cabeza) 
    {
        this.cabeza = cabeza;
    }

    public CND_Equipo getCola() 
    {
        return cola;
    }

    public void setCola(CND_Equipo cola) 
    {
        this.cola = cola;
    }
}
