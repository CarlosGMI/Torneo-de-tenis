package Fuente;

public class CLS_Universidad implements java.io.Serializable
{
    CNS_Universidad cabeza;
    
    public boolean estaVacia() 
    {
        return cabeza == null;
    }
    
    public void insertarPrimero(CNS_Universidad nuevaUniversidad)
    {
        if (estaVacia()) 
        {
            cabeza = nuevaUniversidad;
        } 
        else 
        {
            nuevaUniversidad.setProx(cabeza);
            cabeza = nuevaUniversidad;
        }
    }
    
    public void insertarFinal(CNS_Universidad nuevaUniversidad)
    {
        if (estaVacia()) 
        {
            cabeza = nuevaUniversidad;
        } 
        else 
        {
            CNS_Universidad aux = cabeza;
            while(aux.getProx() != null)
            {
                aux=aux.getProx();
            }
            aux.setProx(nuevaUniversidad);
        }
    }
    
    public CNS_Universidad eliminarPrimero() 
    {
        CNS_Universidad uniEliminada = null;
        if (!estaVacia()) 
        {
            uniEliminada = cabeza;
            cabeza = cabeza.getProx();
            uniEliminada.setProx(null);
        } 
        return uniEliminada;
    }
    
    public CNS_Universidad eliminarFinal() 
    {
        CNS_Universidad uniEliminada = null;
        if (!estaVacia())
        {
            if(cabeza.getProx() == null)
            {
                uniEliminada = cabeza;
                cabeza=null;
            }
            else
            {
                CNS_Universidad aux = cabeza;
                while(aux.getProx().getProx()!=null)
                {
                    aux = aux.getProx();
                }
                uniEliminada = aux.getProx();
                aux.setProx(null);
            }
        }
        return uniEliminada;
    }
    
    public CNS_Universidad eliminarPosicion(int numUniEliminada){
        CNS_Universidad uniEliminada = null;
        if(!estaVacia())
        {
            if(numUniEliminada == 1)
            {
    		uniEliminada = eliminarPrimero();
            }
            else if(numUniEliminada == contar())
            {
    		uniEliminada = eliminarFinal();
            }
            else if(numUniEliminada > contar() + 1)
            {
    		System.out.println("Error: posicion nula");
            }   
            else
            {
    		CNS_Universidad aux = cabeza;
    		int cont = 1;
    		while(cont < numUniEliminada - 1)
    		{
    		    cont++;
                    aux = aux.getProx();
    		}
    		uniEliminada = aux.getProx();
    		aux.setProx(uniEliminada.getProx());
    		uniEliminada.setProx(null);		
            }
        }
        return uniEliminada;
    }
    
    public int contar()
    {
        CNS_Universidad aux = cabeza;
        int cont = 0;
        while(aux != null)
        {
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }
    
    public CNS_Universidad buscar(String uniBuscada)
    {
        if(!estaVacia())
        {
            CNS_Universidad aux = cabeza;
            CNS_Universidad actual = cabeza;
            while(aux.getNombre() != uniBuscada)
            {
                aux = aux.getProx();
                actual = aux;
            }
            return actual; 
        }
        else
        {
            return null;
        }
    }
    
    public CLS_Universidad()
    {
        this.cabeza = null;
    }
    
    public CLS_Universidad(CNS_Universidad cabeza)
    {
        this.cabeza = cabeza;
    }

    public CNS_Universidad getCabeza() 
    {
        return cabeza;
    }

    public void setCabeza(CNS_Universidad cabeza)
    {
        this.cabeza = cabeza;
    }
}
