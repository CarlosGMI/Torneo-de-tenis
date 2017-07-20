package GUI;

import javax.swing.*;
import Fuente.CNS_Categoria;
import Fuente.CLD_Equipo;
import Fuente.CND_Equipo;
import javax.swing.WindowConstants;

public class CrearEquipo extends javax.swing.JFrame 
{
    private CLD_Equipo equipos = new CLD_Equipo();
    int contm,contf = 0;
    
    public CrearEquipo()
    {
        
    }
    
    public CrearEquipo(CNS_Categoria nodo) 
    {
        initComponents();
        nodo.setEquipos(equipos);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSexo = new javax.swing.JComboBox();
        crearEquipo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de Equipo");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        crearEquipo.setText("Crear");
        crearEquipo.setToolTipText("Crear equipo");
        crearEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearEquipoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setText("Tipoo de Equipo");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/genero_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(crearEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearEquipoMouseClicked
        // TODO add your handling code here:
        
        if(comboSexo.getSelectedItem().toString().equalsIgnoreCase("Masculino"))
        {
            if(contm > 0)
            {
                display.setText("No puedes inscribir otro equipo masculino en esta categoría!");
            }
            else
            {
                CND_Equipo nuevoEquipo = new CND_Equipo("Masculino");
                equipos.insertarPrimero(nuevoEquipo);
                display.setText("Equipo masculino creado!");
                contm++;
                AñadirJugador ventanaJugadores = new AñadirJugador(nuevoEquipo);
                ventanaJugadores.setVisible(true);
                ventanaJugadores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        }
        else
        {
            if(contf > 0)
            {
                display.setText("No puedes inscribir otro equipo femenino en esta categoría!");
            }
            else
            {
                CND_Equipo nuevoEquipo = new CND_Equipo("Femenino");
                equipos.insertarPrimero(nuevoEquipo);
                display.setText("Equipo femenino creado!");
                contf++;
                AñadirJugador ventanaJugadores = new AñadirJugador(nuevoEquipo);
                ventanaJugadores.setVisible(true);
                ventanaJugadores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_crearEquipoMouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new CrearEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboSexo;
    private javax.swing.JButton crearEquipo;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
