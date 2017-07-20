package GUI.Consulta;
import Fuente.CND_Año;
import Fuente.CNS_Universidad;
import Fuente.CNS_Categoria;
import Fuente.CND_Equipo;
import Fuente.CNA_Jugador;
import javax.swing.JFrame;

public class Consultar extends javax.swing.JFrame 
{
    private CND_Año aux = new CND_Año (); 
    
    public Consultar()
    {
        
    }
    
    public Consultar(CND_Año aux) 
    {
        initComponents();
        this.aux=aux;
    }
    
    public void cerrarTabs()
    {
        if(Consulta.getTabCount()>1)
        {
            int aux=Consulta.getTabCount();
            for(int i=1; i<aux;i++)
            {
                Consulta.removeTabAt(1);
            }  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consulta = new javax.swing.JTabbedPane();
        Año = new javax.swing.JPanel();
        jugBuscado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscarJugador = new javax.swing.JButton();
        verUniversidades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jugBuscado.setToolTipText("escriba el nombre del jugador ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Nombre del jugador");

        buscarJugador.setText("Buscar Jugador");
        buscarJugador.setToolTipText("busca el jugador en el torneo");
        buscarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarJugadorMouseClicked(evt);
            }
        });

        verUniversidades.setText("Ver Universidades");
        verUniversidades.setToolTipText("muestra las universidades inscritas");
        verUniversidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verUniversidadesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AñoLayout = new javax.swing.GroupLayout(Año);
        Año.setLayout(AñoLayout);
        AñoLayout.setHorizontalGroup(
            AñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AñoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verUniversidades)
                    .addGroup(AñoLayout.createSequentialGroup()
                        .addComponent(jugBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarJugador))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        AñoLayout.setVerticalGroup(
            AñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AñoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verUniversidades)
                .addGap(18, 18, 18)
                .addGroup(AñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarJugador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        Consulta.addTab("Año", Año);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Consulta)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Consulta)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verUniversidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verUniversidadesMouseClicked
        // TODO add your handling code here:
            abrirTabUniversidades(aux);
    }//GEN-LAST:event_verUniversidadesMouseClicked

    private void buscarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarJugadorMouseClicked
        // TODO add your handling code here:
        CNS_Universidad uniAux = aux.getUniversidades().getCabeza();
        CNS_Categoria catAux = uniAux.getCategorias().getCabeza();
        CND_Equipo equipAux = catAux.getEquipos().getCabeza();
        CNA_Jugador jugAux; //= equipAux.getAtletas().getRaiz();
        
        while(aux != null)
        {
            while(uniAux != null)
            {
                while(catAux != null)
                {
                    while(equipAux != null)
                    {
                        jugAux = equipAux.getAtletas().buscar(equipAux.getAtletas().getRaiz(), jugBuscado.getText());
                        if(jugAux.getNombre().equalsIgnoreCase(jugBuscado.getText()))
                        {
                            System.out.println("ENCONTRADO!");
                            InfoJug VentanaJugador = new InfoJug(jugAux);
                            VentanaJugador.setVisible(true);
                            VentanaJugador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            //break;
                        }
                        equipAux = equipAux.getProx();
                    }
                    catAux = catAux.getProx();
                }
                uniAux = uniAux.getProx();
            }
            aux = aux.getProx();
        }
        jugBuscado.setText("");
    }//GEN-LAST:event_buscarJugadorMouseClicked
public void abrirTabUniversidades (CND_Año nodoAño)
{
    String NombreAño = Integer.toString(nodoAño.getAño());
    cerrarTabs();
    Consulta.addTab(NombreAño, new TabUniversidades(nodoAño.getUniversidades()));
    this.pack();
    Consulta.setSelectedIndex(1);
}

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Año;
    private javax.swing.JTabbedPane Consulta;
    private javax.swing.JButton buscarJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jugBuscado;
    private javax.swing.JButton verUniversidades;
    // End of variables declaration//GEN-END:variables
}
