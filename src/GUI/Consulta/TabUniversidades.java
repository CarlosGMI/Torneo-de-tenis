/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consulta;
import Fuente.CLS_Universidad;
import Fuente.CNS_Universidad;
import javax.swing.JTabbedPane;
import javax.swing.ListModel;
        
/**
 *
 * @author Jose Luis
 */
public class TabUniversidades extends javax.swing.JPanel {

    /**
     * Creates new form TabUniversidades
     */
    private CLS_Universidad listaUniversidad;
            
            
    public TabUniversidades(CLS_Universidad lista) {
        initComponents();
        listaUniversidad= lista;
        llenarListaUniversidad();
    }
    
    public void cerrarTabs(){
        JTabbedPane padre=(JTabbedPane)this.getParent();
         if(padre!=null){
            if(((JTabbedPane)this.getParent()).getTabCount()>2){
                int aux=((JTabbedPane)this.getParent()).getTabCount();
                    for(int i=2; i<aux;i++){
                    ((JTabbedPane)this.getParent()).removeTabAt(2);
                    }  
                }  
            }
    }
    
    public void llenarListaUniversidad (){
    //listaUniversidades.addItem(""); // Combo Box
    CNS_Universidad NodoAux;
    NodoAux = listaUniversidad.getCabeza();
    while(NodoAux!=null){
    listaUniversidades.addItem(NodoAux.getNombre());
    NodoAux=NodoAux.getProx();
    }
    cerrarTabs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Universidad = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        verCategorias = new javax.swing.JButton();
        listaUniversidades = new javax.swing.JComboBox();

        jButton3.setText("Eliminar Universidad");

        verCategorias.setText("Ver Categorias");
        verCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verCategoriasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UniversidadLayout = new javax.swing.GroupLayout(Universidad);
        Universidad.setLayout(UniversidadLayout);
        UniversidadLayout.setHorizontalGroup(
            UniversidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UniversidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaUniversidades, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(UniversidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        UniversidadLayout.setVerticalGroup(
            UniversidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UniversidadLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(UniversidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verCategorias)
                    .addComponent(listaUniversidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCategoriasMouseClicked
        // TODO add your handling code here:
            
            CNS_Universidad aux = listaUniversidad.buscar(listaUniversidades.getSelectedItem().toString());
            abrirTabCategorias(aux);

    }//GEN-LAST:event_verCategoriasMouseClicked
public void abrirTabCategorias (CNS_Universidad nodoUni){
          
            cerrarTabs();
            ((JTabbedPane)this.getParent()).addTab(nodoUni.getNombre(), new TabCategorias(nodoUni.getCategorias()));
            ((JTabbedPane)this.getParent()).setSelectedIndex(2);
        
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Universidad;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox listaUniversidades;
    private javax.swing.JButton verCategorias;
    // End of variables declaration//GEN-END:variables
}
