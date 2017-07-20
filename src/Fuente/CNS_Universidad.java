package Fuente;

public class CNS_Universidad implements java.io.Serializable
{
    private CLS_Categoria categorias;
    private CNS_Universidad prox;
    private String nombre;
    
    public CNS_Universidad()
    {
        
    }
    
    public CNS_Universidad(String nombre)
    {
        this.nombre = nombre;
        this.prox = null;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public CLS_Categoria getCategorias() 
    {
        return categorias;
    }

    public void setCategorias(CLS_Categoria categorias) 
    {
        this.categorias = categorias;
    }

    public CNS_Universidad getProx()
    {
        return prox;
    }

    public void setProx(CNS_Universidad prox) 
    {
        this.prox = prox;
    }
}
