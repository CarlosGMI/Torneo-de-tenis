
package GUI;
import java.awt.event.WindowAdapter;
import Fuente.CLD_Año;
import Fuente.CArchivoObjeto;
import java.awt.event.WindowEvent;
/**
* GuardadoAlCerrar
* WindowListener que reacciona cuando la ventana se está cerrando y guarda el
* árbol de países en el archivo de objetos.
*
* @author Meyer Montagner
* @version 1.00, 23/06/2015
*
*/
public class Guardar extends WindowAdapter{
    private CLD_Año año;
    private CArchivoObjeto guardar;
    
    public Guardar(CLD_Año a){
        this.año=a;
        guardar=new CArchivoObjeto();
        
    }
    
    @Override
    public void windowClosing(WindowEvent e){
        try{
                guardar.crearArchivoAños(año);
            }
            catch(Exception ex){
                System.out.println("Error creando: "+ex.getMessage());
            }
    }
    
}
