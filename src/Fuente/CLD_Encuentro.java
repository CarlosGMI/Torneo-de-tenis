package Fuente;

public class CLD_Encuentro implements java.io.Serializable
{
    private CND_Encuentro cabeza;
    private CND_Encuentro cola;
    
    public CLD_Encuentro()
    {
        this.cabeza = null;
    }
    
    public CLD_Encuentro(CND_Encuentro cabeza)
    {
        this.cabeza = cabeza;
    }
    
    public boolean estaVacia() 
    {
        return cabeza == null;
    }
    
    public void insertarPrimero(CND_Encuentro nuevoEncuentro) 
    {
        if (estaVacia()) 
        {
            cabeza = cola = nuevoEncuentro;
        } 
        else 
        {
            if(cabeza == cola)
            {
                nuevoEncuentro.setProx(cabeza);
                cola = cabeza;
                cabeza = nuevoEncuentro;
                cola.setAnt(cabeza);
            }
            else{
                nuevoEncuentro.setProx(cabeza);
                cabeza.setAnt(nuevoEncuentro);
                cabeza = nuevoEncuentro;
            }   
        }
    }
    
    public void insertarFinal(CND_Encuentro nuevoEncuentro) 
    {
        if (estaVacia()) 
        {
            cabeza = cola = nuevoEncuentro;
        } 
        else 
        {
            cola.setProx(nuevoEncuentro);
            nuevoEncuentro.setAnt(cola);
            cola = nuevoEncuentro;           
        }
    }
    
    public CND_Encuentro eliminarPrimero() 
    {
        CND_Encuentro encEliminado = null;
        if (!estaVacia()) 
        {
            if(cabeza == cola)
            {
                encEliminado = cabeza;
                cabeza = cola = null;
            }
            else
            {
                encEliminado = cabeza;
                cabeza= cabeza.getProx();
                cabeza.setAnt(null);
                encEliminado.setProx(null);
            }
        }   
        return encEliminado;
    }
    
    public CND_Encuentro eliminarFinal() 
    {
        CND_Encuentro encEliminado = null;
        if (!estaVacia())
        {
            if(cabeza==cola)
            {
                encEliminado = cabeza;
                cabeza = cola = null;
            }
            else
            {
                encEliminado = cola;
                cola = cola.getAnt();
                cola.setProx(null);
                encEliminado.setAnt(null);
            }
        }
        return encEliminado;
    }
    
    public CND_Encuentro eliminarPosicion(int posicion)
    {
        CND_Encuentro encEliminado = null;
        if(!estaVacia())
        {
            if(posicion == 1)
            {
    		encEliminado = eliminarPrimero();
            }
            else if(posicion == contar())
            {
    		encEliminado = eliminarFinal();
            }
            else if(posicion > contar() + 1)
            {
    		System.out.println("Error! Posicion nula");
            }   
            else
            {
    		CND_Encuentro aux = cabeza;
    		int cont = 1;
    		while(cont < posicion - 1)
    		{
    		    cont++;
                    aux = aux.getProx();
    		}
    		encEliminado = aux.getProx();
    		aux.setProx(encEliminado.getProx());
                encEliminado.getProx().setAnt(aux);
    		encEliminado.setProx(null);	
                encEliminado.setAnt(null);	
            }
        }
        return encEliminado;
    }
    
    public int contar()
    {
        CND_Encuentro aux = cabeza;
        int cont = 0;
        while(aux != null)
        {
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }
  
    public CND_Encuentro buscar(int encBuscado)
    {
        if(!estaVacia())
        {
            CND_Encuentro aux = cabeza;
            CND_Encuentro actual = cabeza;
            while(aux.getNumeroEnc() != encBuscado)
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

    public CND_Encuentro getCabeza() 
    {
        return cabeza;
    }

    public void setCabeza(CND_Encuentro cabeza) 
    {
        this.cabeza = cabeza;
    }

    public CND_Encuentro getCola() 
    {
        return cola;
    }

    public void setCola(CND_Encuentro cola) 
    {
        this.cola = cola;
    }
}
