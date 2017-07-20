package Fuente;

public class CLD_Año implements java.io.Serializable
{
    private CND_Año cabeza;
    private CND_Año cola;
    
    public boolean estaVacia() 
    {
        return cabeza == null;
    }
    
    public void insertarPrimero(CND_Año nuevoAño)
    {
        if (estaVacia()) 
        {
            cabeza = cola = nuevoAño;
        } 
        else 
        {
            if(cabeza == cola)
            {
                nuevoAño.setProx(cabeza);
                cola = cabeza;
                cabeza = nuevoAño;
                cola.setAnt(cabeza);
            }
            else{
                nuevoAño.setProx(cabeza);
                cabeza.setAnt(nuevoAño);
                cabeza = nuevoAño;
            }   
        }
    }
    
    public void insertarFinal(CND_Año nuevoAño) 
    {
        if (estaVacia()) 
        {
            cabeza = cola = nuevoAño;
        } 
        else 
        {
            cola.setProx(nuevoAño);
            nuevoAño.setAnt(cola);
            cola = nuevoAño;           
        }
    }
    
    public CND_Año eliminarPrimero() 
    {
        CND_Año añoEliminado=null;
        if (!estaVacia()) 
        {
            if(cabeza == cola)
            {
                añoEliminado = cabeza;
                cabeza = cola = null;
            }
            else
            {
                añoEliminado = cabeza;
                cabeza= cabeza.getProx();
                cabeza.setAnt(null);
                añoEliminado.setProx(null);
            }
        }   
        return añoEliminado;
    }
    
    public CND_Año eliminarFinal() 
    {
        CND_Año añoEliminado = null;
        if (!estaVacia())
        {
            if(cabeza==cola)
            {
                añoEliminado = cabeza;
                cabeza = cola = null;
            }
            else
            {
                añoEliminado = cola;
                cola = cola.getAnt();
                cola.setProx(null);
                añoEliminado.setAnt(null);
            }
        }
        return añoEliminado;
    }
    
    public CND_Año eliminarPosicion(int posicion)
    {
        CND_Año añoEliminado = null;
        if(!estaVacia())
        {
            if(posicion == 1)
            {
    		añoEliminado = eliminarPrimero();
            }
            else if(posicion == contar())
            {
    		añoEliminado = eliminarFinal();
            }
            else if(posicion > contar() + 1)
            {
    		System.out.println("Error! Posicion nula");
            }   
            else
            {
    		CND_Año aux = cabeza;
    		int cont = 1;
    		while(cont < posicion - 1)
    		{
    		    cont++;
                    aux = aux.getProx();
    		}
    		añoEliminado = aux.getProx();
    		aux.setProx(añoEliminado.getProx());
                añoEliminado.getProx().setAnt(aux);
    		añoEliminado.setProx(null);	
                añoEliminado.setAnt(null);	
            }
        }
        return añoEliminado;
    }
    
    public int contar()
    {
        CND_Año aux = cabeza;
        int cont = 0;
        while(aux != null)
        {
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }
  
    public CND_Año buscar(int añoBuscado)
    {
        if(!estaVacia())
        {
            CND_Año aux = cabeza;
            CND_Año actual = cabeza;
            while(aux.getAño() != añoBuscado)
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
    
    public CLD_Año()
    {
        this.cabeza = null;
    }
    
    public CLD_Año(CND_Año cabeza)
    {
        this.cabeza = cabeza;
    }

    public CND_Año getCabeza() 
    {
        return cabeza;
    }

    public void setCabeza(CND_Año cabeza) 
    {
        this.cabeza = cabeza;
    }

    public CND_Año getCola() 
    {
        return cola;
    }

    public void setCola(CND_Año cola) 
    {
        this.cola = cola;
    }
}
