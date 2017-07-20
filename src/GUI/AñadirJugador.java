package GUI;

import javax.swing.*;
import Fuente.ABB_Jugador;
import Fuente.CNA_Jugador;
import Fuente.CNCola_Jugadores;
import Fuente.CCola_Jugadores;
import Fuente.CND_Equipo;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AñadirJugador extends javax.swing.JFrame 
{
    private ABB_Jugador atletas = new ABB_Jugador();
    private CCola_Jugadores colaJugadores = new CCola_Jugadores();
    
    public AñadirJugador()
    {
        
    }

    public AñadirJugador(CND_Equipo equipo) 
    {
        initComponents();
        equipo.setAtletas(atletas);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        agregarJugador = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edadJugador = new javax.swing.JTextField();
        cedulaJugador = new javax.swing.JTextField();
        nombreJugador = new javax.swing.JTextField();
        finalizarAdicion = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Jugador");

        jLabel1.setText("Nombre");

        agregarJugador.setText("Agregar Jugador");
        agregarJugador.setToolTipText("Agrega un jugador al equipo");
        agregarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarJugadorMouseClicked(evt);
            }
        });

        jLabel3.setText("Cedula");

        jLabel4.setText("Edad");

        finalizarAdicion.setText("Finalizar");
        finalizarAdicion.setToolTipText("Finalizar Inscripcion del equipo");
        finalizarAdicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarAdicionMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/tennis-lesson.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalizarAdicion)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(agregarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edadJugador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedulaJugador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(edadJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cedulaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(agregarJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finalizarAdicion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarAdicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarAdicionMouseClicked
    atletas.setColaJugadores(colaJugadores);
    atletas.setRaiz(colaJugadores.desencolar());
        for(int i=1;i<8;i++)
        {
                atletas.setColaJugadores(colaJugadores);
                atletas.Insertar(atletas.getRaiz(), colaJugadores.desencolar());
        }
        this.setVisible(false);
    }//GEN-LAST:event_finalizarAdicionMouseClicked

    private void agregarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarJugadorMouseClicked
        // TODO add your handling code here:
        int edad = Integer.parseInt(edadJugador.getText());
        int cedula = Integer.parseInt(cedulaJugador.getText());
        CNCola_Jugadores jugadorEnCola = new CNCola_Jugadores(nombreJugador.getText(),edad,cedula);
        colaJugadores.encolar(jugadorEnCola);
        nombreJugador.setText("");
        edadJugador.setText("");
        cedulaJugador.setText("");
        display.setText("Jugador inscrito!");
    }//GEN-LAST:event_agregarJugadorMouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new AñadirJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarJugador;
    private javax.swing.JTextField cedulaJugador;
    private javax.swing.JTextField display;
    private javax.swing.JTextField edadJugador;
    private javax.swing.JButton finalizarAdicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreJugador;
    // End of variables declaration//GEN-END:variables
}
