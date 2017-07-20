package GUI.Consulta;

import Fuente.ABB_Jugador;
import Fuente.CNA_Jugador;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class TabJugadores extends javax.swing.JPanel {

private ABB_Jugador arbolJugadores = new ABB_Jugador();
DefaultListModel modelo;

    public TabJugadores(ABB_Jugador arbol) 
    {
        initComponents();
        arbolJugadores = arbol; 
        modelo = new DefaultListModel();
        listaJuga.setModel(modelo);
        llenarListaJugadores(arbol.getRaiz());
    }
    
    private void llenarListaJugadores(CNA_Jugador nodoAuxJug) 
    {
        if(nodoAuxJug != null)
        {
            llenarListaJugadores(nodoAuxJug.getHijoIzq());
            modelo.addElement(nodoAuxJug.getNombre());
            llenarListaJugadores(nodoAuxJug.getHijoDer());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jugadores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaJuga = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        EliminarJug = new javax.swing.JButton();
        VerJug = new javax.swing.JButton();
        ModificarJug = new javax.swing.JButton();

        jScrollPane2.setViewportView(listaJuga);

        jLabel4.setText("Jugadores ");

        EliminarJug.setText("Eliminar Jugador");
        EliminarJug.setToolTipText("elimina el jugador seleccionado");

        VerJug.setText("Ver Jugador");
        VerJug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerJugMouseClicked(evt);
            }
        });

        ModificarJug.setText("Modificar Jugador");
        ModificarJug.setToolTipText("modifica los Atributos del jugador ");

        javax.swing.GroupLayout JugadoresLayout = new javax.swing.GroupLayout(Jugadores);
        Jugadores.setLayout(JugadoresLayout);
        JugadoresLayout.setHorizontalGroup(
            JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JugadoresLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JugadoresLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(EliminarJug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VerJug, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ModificarJug))))
                .addContainerGap())
        );
        JugadoresLayout.setVerticalGroup(
            JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JugadoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JugadoresLayout.createSequentialGroup()
                        .addComponent(ModificarJug)
                        .addGap(32, 32, 32)
                        .addComponent(EliminarJug)
                        .addGap(31, 31, 31)
                        .addComponent(VerJug)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Jugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VerJugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerJugMouseClicked
        
        //TODO add your handling code here
        CNA_Jugador nodoAuxJug = arbolJugadores.buscar(arbolJugadores.getRaiz(), listaJuga.getSelectedValue().toString());
        InfoJug VentanaJugador = new InfoJug (nodoAuxJug);
        VentanaJugador.setVisible(true);
        VentanaJugador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_VerJugMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarJug;
    private javax.swing.JPanel Jugadores;
    private javax.swing.JButton ModificarJug;
    private javax.swing.JButton VerJug;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaJuga;
    // End of variables declaration//GEN-END:variables
}
