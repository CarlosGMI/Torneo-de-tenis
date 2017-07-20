package Fuente;

/**
 *
 * @author Jose Luis
 */
public class CLS_Categoria implements java.io.Serializable
{
    private CNS_Categoria cabeza;
    
    public CLS_Categoria()
    {
        this.cabeza = null;
    }
    
    public CLS_Categoria(CNS_Categoria cabeza)
    {
        this.cabeza = cabeza;
    }
    
    public boolean estaVacia() 
    {
        return cabeza == null;
    }
    
    public void insertarPrimero(CNS_Categoria nuevaCategoria)
    {
        if (estaVacia()) 
        {
            cabeza = nuevaCategoria;
        } 
        else 
        {
            nuevaCategoria.setProx(cabeza);
            cabeza = nuevaCategoria;
        }
    }
    
    public void insertarFinal(CNS_Categoria nuevaCategoria)
    {
        if (estaVacia()) 
        {
            cabeza = nuevaCategoria;
        } 
        else 
        {
            CNS_Categoria aux = cabeza;
            while(aux.getProx() != null)
            {
                aux=aux.getProx();
            }
            aux.setProx(nuevaCategoria);
        }
    }
    
    public CNS_Categoria eliminarPrimero() 
    {
        CNS_Categoria categEliminada = null;
        if (!estaVacia()) 
        {
            categEliminada = cabeza;
            cabeza = cabeza.getProx();
            categEliminada.setProx(null);
        } 
        return categEliminada;
    }
    
    public CNS_Categoria eliminarFinal() 
    {
        CNS_Categoria categEliminada = null;
        if (!estaVacia())
        {
            if(cabeza.getProx() == null)
            {
                categEliminada = cabeza;
                cabeza=null;
            }
            else
            {
                CNS_Categoria aux = cabeza;
                while(aux.getProx().getProx()!=null)
                {
                    aux = aux.getProx();
                }
                categEliminada = aux.getProx();
                aux.setProx(null);
            }
        }
        return categEliminada;
    }
    
    public CNS_Categoria eliminarPosicion(int numCatEliminada){
        CNS_Categoria categEliminada=null;
        if(!estaVacia())
        {
            if(numCatEliminada == 1)
            {
    		categEliminada = eliminarPrimero();
            }
            else if(numCatEliminada == contar())
            {
    		categEliminada = eliminarFinal();
            }
            else if(numCatEliminada > contar() + 1)
            {
    		System.out.println("Error: posicion nula");
            }   
            else
            {
    		CNS_Categoria aux = cabeza;
    		int cont = 1;
    		while(cont < numCatEliminada - 1)
    		{
    		    cont++;
                    aux = aux.getProx();
    		}
    		categEliminada = aux.getProx();
    		aux.setProx(categEliminada.getProx());
    		categEliminada.setProx(null);		
            }
        }
        return categEliminada;
    }
    
    public int contar()
    {
        CNS_Categoria aux = cabeza;
        int cont = 0;
        while(aux != null)
        {
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }
    
    public CNS_Categoria buscar(int categBuscada)
    {
        if(!estaVacia())
        {
            CNS_Categoria aux = cabeza;
            CNS_Categoria actual = cabeza;
            while(aux.getNumCat() != categBuscada)
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
    
    public int buscarParaEliminar(int categBuscada)
    {
        int posBuscada = 1;
        if(!estaVacia())
        {
            CNS_Categoria aux = cabeza;
            while(aux.getNumCat() != categBuscada)
            {
                aux = aux.getProx();
                posBuscada++;
            }
            return posBuscada;
        }
        else
        {
            return 0;
        }
    }

    public CNS_Categoria getCabeza() 
    {
        return cabeza;
    }

    public void setCabeza(CNS_Categoria cabeza) 
    {
        this.cabeza = cabeza;
    }
}
