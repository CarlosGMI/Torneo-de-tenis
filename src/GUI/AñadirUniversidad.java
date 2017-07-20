package GUI;

import javax.swing.*;
import Fuente.CND_Año;
import Fuente.CLS_Universidad;
import Fuente.CNS_Universidad;
import java.io.IOException;

public class AñadirUniversidad extends javax.swing.JFrame
{
    private CLS_Universidad universidades = new CLS_Universidad();
    DefaultListModel modelo;
    
    public AñadirUniversidad()
    {
        
    }
    
    public AñadirUniversidad(CND_Año nodo) 
    {
        initComponents();
        nodo.setUniversidades(universidades);
        this.inicializarlistaUniversidades();
        modelo = new DefaultListModel();
        listaUni.setModel(modelo);
    }
    
    public void inicializarlistaUniversidades()
    {
        try 
        {
            llenarListaUni(universidades.getCabeza());
        } 
        catch (Exception ex) 
        {
            //universidades = new CLS_Universidad();
            //año.setUniversidades(new CLS_Universidad());
            this.display.setText("ERROR! No se ha podido inicializar la lista de años");
        }
    }
    
    public void llenarListaUni(CNS_Universidad aux)
    {
        if (aux != null)
        {
            modelo.addElement(aux.getNombre());
            llenarListaUni(aux.getProx());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        textoUni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        crearUni = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        seleccionarUni = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaUni = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre de la universidad");

        crearUni.setText("Crear");
        crearUni.setToolTipText("Crear equipo");
        crearUni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearUniMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/universidad.png"))); // NOI18N

        seleccionarUni.setText("Seleccionar");
        seleccionarUni.setToolTipText("Crear categorías");
        seleccionarUni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionarUniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seleccionarUni, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoUni, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(crearUni)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearUni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionarUni)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(listaUni);

        jLabel3.setText("Universidades Inscritas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(display)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarUniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarUniMouseClicked
        if (listaUni.getSelectedValue()!=null)
        {
            CNS_Universidad nodoUni = universidades.buscar(listaUni.getSelectedValue().toString());
            SeleccionarCategoria ventanaCat = new SeleccionarCategoria(nodoUni);
            ventanaCat.setVisible(true);
            ventanaCat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        else
        {
            display.setText("Error! No has seleccionado ninguna universidad.");
        }
    }//GEN-LAST:event_seleccionarUniMouseClicked

    private void crearUniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUniMouseClicked
        // TODO add your handling code here:
        if(!"".equals(textoUni.getText()))
        {
            CNS_Universidad universidad = new CNS_Universidad(textoUni.getText());
            universidades.insertarFinal(universidad);
            modelo.removeAllElements();
            this.llenarListaUni(universidades.getCabeza());
            textoUni.setText("");
            display.setText("Universidad creada!");
        }
        else
        {
            display.setText("No has inscrito ninguna Universidad");
        }
    }//GEN-LAST:event_crearUniMouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new AñadirUniversidad().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearUni;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaUni;
    private javax.swing.JButton seleccionarUni;
    private javax.swing.JTextField textoUni;
    // End of variables declaration//GEN-END:variables
}
