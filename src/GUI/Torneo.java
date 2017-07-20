package GUI;
import Fuente.CArchivoObjeto;
import Fuente.CLD_Año;
import Fuente.CND_Año;
import GUI.Consulta.Consultar;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Torneo extends javax.swing.JFrame 
{
    private CLD_Año torneos;
    private CArchivoObjeto guardar;
    
    public Torneo() 
    {
        initComponents();
        guardar = new CArchivoObjeto();
        this.inicializarListaAños();
        this.addWindowListener(new Guardar(torneos));
    }
    
    public void inicializarListaAños() 
    {
        try 
        {
            torneos = (CLD_Año)guardar.capturarArchivoAños();
            llenarListaAños(torneos.getCabeza());
        } 
        catch (Exception ex) 
        {
            torneos = new CLD_Año();
            this.display.setText("ERROR! No se ha podido inicializar la lista de años");
        }
    }
    
    public void llenarListaAños(CND_Año aux)
    {
        if(aux != null)
        {
            listaAños.addItem(aux.getAño());
            llenarListaAños(aux.getProx());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoTorneo = new javax.swing.JButton();
        listaAños = new javax.swing.JComboBox();
        textoAño = new javax.swing.JTextField();
        acceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planificador de Torneo ");

        nuevoTorneo.setText("Nuevo Torneo");
        nuevoTorneo.setToolTipText("Crea un nuevo torneo");
        nuevoTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoTorneoMouseClicked(evt);
            }
        });

        listaAños.setToolTipText("Seleccione un año ");
        listaAños.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAñosMouseClicked(evt);
            }
        });
        listaAños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAñosActionPerformed(evt);
            }
        });

        acceder.setText("Acceder");
        acceder.setToolTipText("Explora la univerisdad seleccionada");
        acceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accederMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Torneos");

        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/copa2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("EDITOR DE TORNEOS 3000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoAño)
                                .addComponent(listaAños, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nuevoTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nuevoTorneo)
                            .addComponent(textoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(46, 46, 46)
                            .addComponent(acceder))
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(listaAños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        listaAños.getAccessibleContext().setAccessibleName("Años");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoTorneoMouseClicked
        // TODO add your handling code here:
        if(!"".equals(textoAño.getText()))
        {
            int numAño = Integer.parseInt(textoAño.getText());
            CND_Año nuevoAño = new CND_Año(numAño);
            torneos.insertarPrimero(nuevoAño);
            listaAños.removeAllItems();
            this.llenarListaAños(torneos.getCabeza());
            try 
            {
                guardar.crearArchivoAños(torneos);
            } 
            catch (IOException ex) 
            {
                this.display.setText("Ha habido un error creando el torneo");
            }
            textoAño.setText("");
            display.setText("Torneo creado!");
            AñadirUniversidad VentanaUni = new AñadirUniversidad(nuevoAño);
            VentanaUni.setVisible(true);
            VentanaUni.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        else
        {
            display.setText("No has introducido ningún año");
        }
    }//GEN-LAST:event_nuevoTorneoMouseClicked

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void accederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accederMouseClicked
        // TODO add your handling code here:
        int a = Integer.parseInt(listaAños.getSelectedItem().toString());
        CND_Año aux= torneos.buscar(a);
        //System.out.println(aux.getUniversidades().getCabeza().getCategorias().getCabeza().getEquipos().getCabeza().getAtletas().getColaJugadores().getPrimeroCola().getNombre());
        //System.out.println(aux.getUniversidades().getCabeza().getCategorias().getCabeza().getEquipos().getCabeza().getAtletas().getRaiz().getHijoDer().getNombre());
        //System.out.println(aux.getUniversidades().getCabeza().getCategorias().getCabeza().getEquipos().getCabeza().getAtletas().getRaiz().getNombre());
        //System.out.println(aux.getUniversidades().getCabeza().getCategorias().getCabeza().getEquipos().getCabeza().getAtletas().getRaiz().getHijoDer().getNombre());
        Consultar ventanaConsulta = new Consultar(aux);
        ventanaConsulta.setVisible(true);
        ventanaConsulta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_accederMouseClicked

    private void listaAñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAñosActionPerformed


    }//GEN-LAST:event_listaAñosActionPerformed

    private void listaAñosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAñosMouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_listaAñosMouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Torneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceder;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox listaAños;
    private javax.swing.JButton nuevoTorneo;
    private javax.swing.JTextField textoAño;
    // End of variables declaration//GEN-END:variables
}
