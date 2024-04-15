
package tp_6_com2.vistas;

import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tp_6_com2.entidades.Producto;


public class ConsultaPorPrecio extends javax.swing.JInternalFrame {
    private TreeSet<Producto> productos;
     private DefaultTableModel modelo=new DefaultTableModel();
    
    public ConsultaPorPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        armarCabecera();
        
    }

   
private void armarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    modelo.addColumn("Rubro");
    jTable.setModel(modelo);
}
private void borrarFilas(){
    int filas=modelo.getRowCount()-1;
    for(int f=filas;f>=0;f--){
        modelo.removeRow(f);
    }
        
    
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jlEntre = new javax.swing.JLabel();
        jtPrecioMin = new javax.swing.JTextField();
        jlY = new javax.swing.JLabel();
        jtPrecioMax = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlTitulo.setText("Listado Por Precio");

        jlEntre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlEntre.setText("Entre $:");

        jlY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlY.setText("y");

        jtPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioMaxKeyReleased(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlY, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlY)
                    .addComponent(jtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbSalir)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtPrecioMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioMaxKeyReleased
         borrarFilas();
         if(validaReal(jtPrecioMin.getText())&& validaReal(jtPrecioMax.getText())){
         Double min= Double.parseDouble(jtPrecioMin.getText());
         Double max= Double.parseDouble(jtPrecioMax.getText());
      for (Producto prod : productos) {
            if (prod.getPrecio() >= min && prod.getPrecio() <= max) {
                Vector renglon = new Vector();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                renglon.add(prod.getRubro());
                modelo.addRow(renglon);
            }
    }//GEN-LAST:event_jtPrecioMaxKeyReleased
    }else {JOptionPane.showMessageDialog(this, "Ingresar un número");
            jtPrecioMin.requestFocus();
            return;    
    }
    }
    private boolean validaReal(String nro){
    Pattern patron=Pattern.compile("[0-9]+(?:\\.[0-9]+)?");
        Matcher m=patron.matcher(nro);
        return m.matches();
        
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlEntre;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlY;
    private javax.swing.JTextField jtPrecioMax;
    private javax.swing.JTextField jtPrecioMin;
    // End of variables declaration//GEN-END:variables
}
