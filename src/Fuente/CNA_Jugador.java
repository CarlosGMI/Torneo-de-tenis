package Fuente;

/**
 *
 * @author Jose Luis
 */
public class CNA_Jugador implements java.io.Serializable
{
    private String nombre;
    private int cedula;
    private String sexo;
    private int edad;
    private int puntosAcum;
    private CNA_Jugador hijoIzq;
    private CNA_Jugador hijoDer;
    
    public CNA_Jugador()
    {
        
    }

    public CNA_Jugador(String nombre, int edad, int cedula) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getCedula() 
    {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public int getPuntosAcum() 
    {
        return puntosAcum;
    }

    public void setPuntosAcum(int puntosAcum) 
    {
        this.puntosAcum = puntosAcum;
    }

    public CNA_Jugador getHijoIzq() 
    {
        return hijoIzq;
    }

    public void setHijoIzq(CNA_Jugador hijoIzq) 
    {
        this.hijoIzq = hijoIzq;
    }

    public CNA_Jugador getHijoDer() 
    {
        return hijoDer;
    }

    public void setHijoDer(CNA_Jugador hijoDer) 
    {
        this.hijoDer = hijoDer;
    }
}
