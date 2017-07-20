package Fuente;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CArchivoObjeto 
{
    public void crearArchivoAños(CLD_Año temporadas) throws FileNotFoundException, IOException
    {
        FileOutputStream fOutput;
        fOutput = new FileOutputStream ("listaAnos.DAT");
        ObjectOutputStream Ooutput = new ObjectOutputStream (fOutput);
        Ooutput.writeObject(temporadas);
        Ooutput.close();
    }
    
    public Object capturarArchivoAños() throws Exception
    {
        FileInputStream fInput;
        CLD_Año temporadas;
        fInput = new FileInputStream ("listaAnos.DAT");
        ObjectInputStream oInput = new ObjectInputStream (fInput);
        temporadas = (CLD_Año) oInput.readObject();
        oInput.close();
        return temporadas;
    }
}
