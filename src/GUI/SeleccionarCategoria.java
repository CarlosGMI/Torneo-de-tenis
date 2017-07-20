package GUI;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import Fuente.CNS_Universidad;
import Fuente.CLS_Categoria;
import Fuente.CNS_Categoria;

public class SeleccionarCategoria extends javax.swing.JFrame 
{
    private CLS_Categoria categorias = new CLS_Categoria(); 
    
    public SeleccionarCategoria()
    {
        
    }
    
    public SeleccionarCategoria(CNS_Universidad nodoUni) 
    {
        initComponents();
        nodoUni.setCategorias(categorias);
        inicializarListaCategorias();
    }
    
    private void inicializarListaCategorias()
    {
        try 
        {
            llenarComboBoxCategorias (categorias.getCabeza());
        } 
        catch (Exception ex) 
        {
            display.setText("ERROR! No se ha podido inicializar la lista de Categorias");
        }
    }
    public void llenarComboBoxCategorias (CNS_Categoria auxCat)
    {
        if (auxCat != null)
        {
           listaCategorias.addItem(auxCat.getNumCat());
           llenarComboBoxCategorias(auxCat.getProx());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaCategorias = new javax.swing.JComboBox();
        crearCategoria = new javax.swing.JButton();
        EliminarCategoria = new javax.swing.JButton();
        accederCategoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        textoCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleccionar Categoria");

        listaCategorias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6ta", "5ta", "4ta", "3ra" }));
        listaCategorias.setToolTipText("seleccione la categoria");

        crearCategoria.setText("Crear Categoria");
        crearCategoria.setToolTipText("añade una categoria a la lista");
        crearCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCategoriaMouseClicked(evt);
            }
        });

        EliminarCategoria.setText("Eliminar Categoria");
        EliminarCategoria.setToolTipText("para descartar una categoria");
        EliminarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarCategoriaMouseClicked(evt);
            }
        });

        accederCategoria.setText("Añadir Equipos");
        accederCategoria.setToolTipText("para añadir equipos");
        accederCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accederCategoriaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setText("Categoria");

        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        textoCategoria.setToolTipText("para escribir el número de la categoría");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("Crear una nueva categoría");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/olive.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(listaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EliminarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accederCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearCategoria)
                        .addGap(26, 26, 26)
                        .addComponent(EliminarCategoria))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(listaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(7, 7, 7)
                .addComponent(accederCategoria)
                .addGap(18, 18, 18)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accederCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accederCategoriaMouseClicked
        // TODO add your handling code here:
        CNS_Categoria nuevaCat;
        if(listaCategorias.getSelectedItem().toString().equalsIgnoreCase("6ta"))
        {
            nuevaCat = new CNS_Categoria(6);
            categorias.insertarPrimero(nuevaCat);
        }
        else if(listaCategorias.getSelectedItem().toString().equalsIgnoreCase("5ta"))
        {
            nuevaCat = new CNS_Categoria(5);
            categorias.insertarPrimero(nuevaCat);
        }
        else if(listaCategorias.getSelectedItem().toString().equalsIgnoreCase("4ta"))
        {
            nuevaCat = new CNS_Categoria(4);
            categorias.insertarPrimero(nuevaCat);
        }
        else if(listaCategorias.getSelectedItem().toString().equalsIgnoreCase("3ra"))
        {
            nuevaCat = new CNS_Categoria(3);
            categorias.insertarPrimero(nuevaCat);
        }
        else
        {
            int num = Integer.parseInt(listaCategorias.getSelectedItem().toString());
            nuevaCat = new CNS_Categoria(num);
        }
        CrearEquipo ventanaEquipo = new CrearEquipo(nuevaCat);
        ventanaEquipo.setVisible(true);
        ventanaEquipo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_accederCategoriaMouseClicked

    private void crearCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCategoriaMouseClicked
        // TODO add your handling code here:
        int numCat = Integer.parseInt(textoCategoria.getText());
        CNS_Categoria nuevaCat = new CNS_Categoria(numCat);
        categorias.insertarPrimero(nuevaCat);
        listaCategorias.removeAllItems();
        listaCategorias.addItem("6ta");
        listaCategorias.addItem("5ta");
        listaCategorias.addItem("4ta");
        listaCategorias.addItem("3ra");
        this.llenarComboBoxCategorias(categorias.getCabeza());
        textoCategoria.setText("");
        display.setText("Categoría creada!");
    }//GEN-LAST:event_crearCategoriaMouseClicked

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void EliminarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarCategoriaMouseClicked
        
        int num = Integer.parseInt(listaCategorias.getSelectedItem().toString());
        if(categorias.buscar(num) != null)
        {
            if(listaCategorias.getSelectedItem().toString().equalsIgnoreCase("6ta"))
            {
                categorias.eliminarPosicion(categorias.buscarParaEliminar(6));
            }
            else if(listaCategorias.getSelectedItem().toString().equalsIgnoreCase("5ta"))
            {
                categorias.eliminarPosicion(categorias.buscarParaEliminar(5));
            }
            else if(listaCategorias.getSelectedItem().toString().equalsIgnoreCase("4ta"))
            {
                categorias.eliminarPosicion(categorias.buscarParaEliminar(4));
            }
            else if(listaCategorias.getSelectedItem().toString().equalsIgnoreCase("3ra"))
            {
                categorias.eliminarPosicion(categorias.buscarParaEliminar(4));
            }
            else
            {
                int num2 = Integer.parseInt(listaCategorias.getSelectedItem().toString());
                categorias.eliminarPosicion(categorias.buscarParaEliminar(num));
            }
            listaCategorias.removeItem(listaCategorias.getSelectedItem());
            display.setText("Categoría eliminada!");
        }
        else
        {
            display.setText("Error! Categoría inexistente");
        }
    }//GEN-LAST:event_EliminarCategoriaMouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new SeleccionarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarCategoria;
    private javax.swing.JButton accederCategoria;
    private javax.swing.JButton crearCategoria;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox listaCategorias;
    private javax.swing.JTextField textoCategoria;
    // End of variables declaration//GEN-END:variables
}
