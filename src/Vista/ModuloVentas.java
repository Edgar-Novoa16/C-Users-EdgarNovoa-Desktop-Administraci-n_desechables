/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ventas;
import Modelo.Venta;
import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author marco
 */
public class ModuloVentas extends javax.swing.JPanel {

    /**
     * Creates new form ModuloVentas
     */
    public ModuloVentas() {
        initComponents();
    }

    Ventas vs = new Ventas();
    Venta venta;
    boolean dec;
    boolean activacion;
    boolean desactivar = false;
    
    /**
    * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtxtCantidadVenta = new javax.swing.JTextField();
        jtxtTotalDeVenta = new javax.swing.JTextField();
        jcmbTipoProductoVenta = new javax.swing.JComboBox<>();
        btnEliminarVenta = new javax.swing.JButton();
        btnInsertarVenta = new javax.swing.JButton();
        jtxtClaveProductoVenta = new javax.swing.JTextField();
        btnCancelarVenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblVentas = new javax.swing.JTable();
        jcmbFiltroTipoProductoVenta = new javax.swing.JComboBox<>();
        jrbFiltrarTodasLasVentas = new javax.swing.JRadioButton();
        jrbFiltrarAlgunasVentas = new javax.swing.JRadioButton();
        jtxtFiltrarAlgunasVentasInicial = new javax.swing.JTextField();
        jtxtFiltrarAlgunasVentasFinal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jrbFiltrarPorIdProducto = new javax.swing.JRadioButton();
        jtxtFiltrarPorIdProducto = new javax.swing.JTextField();
        jrbFiltrarPorFechaVenta = new javax.swing.JRadioButton();
        jdtFiltrarPorFechaVentaInicial = new com.toedter.calendar.JDateChooser();
        jdtFiltrarPorFechaVentaFinal = new com.toedter.calendar.JDateChooser();
        btnFiltrar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(123, 204, 181));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtCantidadVenta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtCantidadVenta.setForeground(new java.awt.Color(153, 153, 153));
        jtxtCantidadVenta.setText("      CANTIDAD");
        jtxtCantidadVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCantidadVentaMouseClicked(evt);
            }
        });
        jtxtCantidadVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCantidadVentaActionPerformed(evt);
            }
        });
        jtxtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtCantidadVentaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCantidadVentaKeyReleased(evt);
            }
        });
        jPanel2.add(jtxtCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

        jtxtTotalDeVenta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtTotalDeVenta.setForeground(new java.awt.Color(153, 153, 153));
        jtxtTotalDeVenta.setText("          TOTAL");
        jtxtTotalDeVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtTotalDeVentaMouseClicked(evt);
            }
        });
        jtxtTotalDeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalDeVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtTotalDeVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 30));

        jcmbTipoProductoVenta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcmbTipoProductoVenta.setForeground(new java.awt.Color(153, 153, 153));
        jcmbTipoProductoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALIMENTOS", "DESECHABLES", "PRIMERA NECESIDAD", "SEGUNDA NECESIDAD" }));
        jcmbTipoProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbTipoProductoVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jcmbTipoProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        btnEliminarVenta.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnEliminarVenta.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminarVenta.setText("ELIMINAR");
        btnEliminarVenta.setBorder(null);
        btnEliminarVenta.setBorderPainted(false);
        btnEliminarVenta.setContentAreaFilled(false);
        btnEliminarVenta.setFocusPainted(false);
        btnEliminarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarVentaMouseClicked(evt);
            }
        });
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 40));

        btnInsertarVenta.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnInsertarVenta.setForeground(new java.awt.Color(51, 51, 51));
        btnInsertarVenta.setText("INSERTAR");
        btnInsertarVenta.setBorder(null);
        btnInsertarVenta.setBorderPainted(false);
        btnInsertarVenta.setContentAreaFilled(false);
        btnInsertarVenta.setFocusPainted(false);
        btnInsertarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarVentaMouseClicked(evt);
            }
        });
        btnInsertarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnInsertarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, 40));

        jtxtClaveProductoVenta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtClaveProductoVenta.setForeground(new java.awt.Color(153, 153, 153));
        jtxtClaveProductoVenta.setText("CLAVE PRODUCTO");
        jtxtClaveProductoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtClaveProductoVentaMouseClicked(evt);
            }
        });
        jtxtClaveProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtClaveProductoVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtClaveProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 20));

        btnCancelarVenta.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelarVenta.setText("CANCELAR");
        btnCancelarVenta.setBorder(null);
        btnCancelarVenta.setBorderPainted(false);
        btnCancelarVenta.setContentAreaFilled(false);
        btnCancelarVenta.setFocusPainted(false);
        btnCancelarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarVentaMouseClicked(evt);
            }
        });
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 270, 580));

        jPanel3.setBackground(new java.awt.Color(63, 50, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 580));

        jtblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID VENTA", "TIPO DE PRODUCTO", "CLAVE PRODUCTO", "CANTIDAD", "FECHA DE VENTA", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblVentas);

        jcmbFiltroTipoProductoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALIMENTOS", "DESECHABLES", "PRIMERA NECESIDAD", "SEGUNDA NECESIDAD", " " }));
        jcmbFiltroTipoProductoVenta.setEnabled(false);

        buttonGroup1.add(jrbFiltrarTodasLasVentas);
        jrbFiltrarTodasLasVentas.setText("Traer todas las ventas");
        jrbFiltrarTodasLasVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltrarTodasLasVentasMouseClicked(evt);
            }
        });
        jrbFiltrarTodasLasVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFiltrarTodasLasVentasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbFiltrarAlgunasVentas);
        jrbFiltrarAlgunasVentas.setText("Traer algunas ventas");
        jrbFiltrarAlgunasVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltrarAlgunasVentasMouseClicked(evt);
            }
        });

        jtxtFiltrarAlgunasVentasInicial.setEnabled(false);

        jtxtFiltrarAlgunasVentasFinal.setEnabled(false);

        jLabel1.setText("A");

        buttonGroup1.add(jrbFiltrarPorIdProducto);
        jrbFiltrarPorIdProducto.setText("Filtrar por ID producto");
        jrbFiltrarPorIdProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltrarPorIdProductoMouseClicked(evt);
            }
        });

        jtxtFiltrarPorIdProducto.setEnabled(false);

        buttonGroup1.add(jrbFiltrarPorFechaVenta);
        jrbFiltrarPorFechaVenta.setText("Filtrar por fecha de venta");
        jrbFiltrarPorFechaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltrarPorFechaVentaMouseClicked(evt);
            }
        });

        jdtFiltrarPorFechaVentaInicial.setDateFormatString("yyyy-MM-dd");
        jdtFiltrarPorFechaVentaInicial.setEnabled(false);
        jdtFiltrarPorFechaVentaInicial.setMaxSelectableDate(new java.util.Date(2556169318000L));
        jdtFiltrarPorFechaVentaInicial.setMinSelectableDate(new java.util.Date(1622527318000L));

        jdtFiltrarPorFechaVentaFinal.setDateFormatString("yyyy-MM-dd");
        jdtFiltrarPorFechaVentaFinal.setEnabled(false);
        jdtFiltrarPorFechaVentaFinal.setMaxSelectableDate(new java.util.Date(2556169265000L));
        jdtFiltrarPorFechaVentaFinal.setMinSelectableDate(new java.util.Date(1622527265000L));

        btnFiltrar.setText("FILTRAR");
        btnFiltrar.setEnabled(false);
        btnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbFiltrarTodasLasVentas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbFiltrarAlgunasVentas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtFiltrarAlgunasVentasInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtFiltrarAlgunasVentasFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcmbFiltroTipoProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbFiltrarPorIdProducto)
                                    .addComponent(jrbFiltrarPorFechaVenta))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jdtFiltrarPorFechaVentaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jdtFiltrarPorFechaVentaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtxtFiltrarPorIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbFiltroTipoProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbFiltrarTodasLasVentas)
                    .addComponent(jrbFiltrarAlgunasVentas)
                    .addComponent(jtxtFiltrarAlgunasVentasInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtFiltrarAlgunasVentasFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbFiltrarPorIdProducto)
                    .addComponent(jtxtFiltrarPorIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbFiltrarPorFechaVenta)
                    .addComponent(jdtFiltrarPorFechaVentaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdtFiltrarPorFechaVentaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCantidadVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCantidadVentaMouseClicked
        jtxtCantidadVenta.setText("");
        jtxtCantidadVenta.setText("");
        if(jtxtCantidadVenta.getText().equals("")){
            jtxtCantidadVenta.setText("");
        }
        if(jtxtTotalDeVenta.getText().equals("")){

            jtxtTotalDeVenta.setText(" TOTAl");

        }
        if(jtxtClaveProductoVenta.getText().equals("")){

            jtxtClaveProductoVenta.setText(" CLAVE PRODUCTO");

        }

    }//GEN-LAST:event_jtxtCantidadVentaMouseClicked

    private void jtxtCantidadVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCantidadVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCantidadVentaActionPerformed

    private void jtxtTotalDeVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtTotalDeVentaMouseClicked
        jtxtTotalDeVenta.setText("");
        jtxtTotalDeVenta.setText("");
        if(jtxtTotalDeVenta.getText().equals("")){
            jtxtTotalDeVenta.setText("");
        }
        if(jtxtCantidadVenta.getText().equals("")){

            jtxtCantidadVenta.setText(" CANTIDAD");

        }
        if(jtxtClaveProductoVenta.getText().equals("")){

            jtxtClaveProductoVenta.setText(" CLAVE PRODUCTO");

        }
    }//GEN-LAST:event_jtxtTotalDeVentaMouseClicked

    private void jtxtTotalDeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalDeVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalDeVentaActionPerformed

    private void jcmbTipoProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbTipoProductoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbTipoProductoVentaActionPerformed

    private void btnEliminarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarVentaMouseClicked

        this.vs.EliminarRegistroVenta(this);

    }//GEN-LAST:event_btnEliminarVentaMouseClicked

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnInsertarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarVentaMouseClicked
        
    if(this.activacion == true)
    {
            
        boolean estadoCampos;    
        this.venta = new Venta();
    
        estadoCampos = this.vs.obtenerInformacion(this);
        
        if(estadoCampos == false)
        {
            
          JOptionPane.showMessageDialog(null, "Inserta Información verídica");
            
        }else
        {
            
          this.vs.agregarRegistroVenta(this);
        
        } 
            
    }else{
        
        
        JOptionPane.showMessageDialog(null, "inserta información verídica");
        
    }
        
            



    }//GEN-LAST:event_btnInsertarVentaMouseClicked

    private void jtxtClaveProductoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtClaveProductoVentaMouseClicked
        jtxtClaveProductoVenta.setText("");
        jtxtClaveProductoVenta.setText("");
        if(jtxtClaveProductoVenta.getText().equals("")){
            jtxtClaveProductoVenta.setText("");
        }
        if(jtxtTotalDeVenta.getText().equals("")){

            jtxtTotalDeVenta.setText(" TOTAL");

        }
        if(jtxtCantidadVenta.getText().equals("")){

            jtxtCantidadVenta.setText(" CANTIDAD");

        }
    }//GEN-LAST:event_jtxtClaveProductoVentaMouseClicked

    private void jtxtClaveProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtClaveProductoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtClaveProductoVentaActionPerformed
/**/
    private void btnCancelarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVentaMouseClicked

        this.vs.cancelarEdicionVentas(this);
        
    }//GEN-LAST:event_btnCancelarVentaMouseClicked

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void jrbFiltrarTodasLasVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFiltrarTodasLasVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFiltrarTodasLasVentasActionPerformed

    private void jtblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblVentasMouseClicked

    private void jrbFiltrarTodasLasVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltrarTodasLasVentasMouseClicked

        this.venta = new Venta();
        
        this.jcmbFiltroTipoProductoVenta.setEnabled(true);
        this.btnFiltrar.setEnabled(true);
        this.jtxtFiltrarAlgunasVentasInicial.setEnabled(false);
        this.jtxtFiltrarAlgunasVentasInicial.setText("");
        this.jtxtFiltrarAlgunasVentasFinal.setEnabled(false);
        this.jtxtFiltrarAlgunasVentasFinal.setText("");
        this.jtxtFiltrarPorIdProducto.setEnabled(false);
        this.jtxtFiltrarPorIdProducto.setText("");
        this.jdtFiltrarPorFechaVentaInicial.setDate(null);
        this.jdtFiltrarPorFechaVentaInicial.setEnabled(false);
        this.jdtFiltrarPorFechaVentaFinal.setDate(null);
        this.jdtFiltrarPorFechaVentaFinal.setEnabled(false);
        
    }//GEN-LAST:event_jrbFiltrarTodasLasVentasMouseClicked

    private void jrbFiltrarAlgunasVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltrarAlgunasVentasMouseClicked

        this.venta = new Venta();
        
        this.jcmbFiltroTipoProductoVenta.setEnabled(true);
        this.btnFiltrar.setEnabled(true);
        this.jtxtFiltrarAlgunasVentasInicial.setEnabled(true);
        this.jtxtFiltrarAlgunasVentasFinal.setEnabled(true);
        this.jtxtFiltrarPorIdProducto.setEnabled(false);
        this.jtxtFiltrarPorIdProducto.setText("");
        this.jdtFiltrarPorFechaVentaInicial.setDate(null);
        this.jdtFiltrarPorFechaVentaInicial.setEnabled(false);
        this.jdtFiltrarPorFechaVentaFinal.setDate(null);
        this.jdtFiltrarPorFechaVentaFinal.setEnabled(false);

    }//GEN-LAST:event_jrbFiltrarAlgunasVentasMouseClicked

    private void jrbFiltrarPorIdProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltrarPorIdProductoMouseClicked

        this.venta = new Venta();
        
        this.jcmbFiltroTipoProductoVenta.setEnabled(true);
        this.btnFiltrar.setEnabled(true);
        this.jtxtFiltrarAlgunasVentasInicial.setEnabled(false);
        this.jtxtFiltrarAlgunasVentasInicial.setText("");
        this.jtxtFiltrarAlgunasVentasFinal.setEnabled(false);
        this.jtxtFiltrarAlgunasVentasFinal.setText("");
        this.jtxtFiltrarPorIdProducto.setEnabled(true);
        this.jdtFiltrarPorFechaVentaInicial.setDate(null);
        this.jdtFiltrarPorFechaVentaInicial.setEnabled(false);
        this.jdtFiltrarPorFechaVentaFinal.setDate(null);
        this.jdtFiltrarPorFechaVentaFinal.setEnabled(false);


    }//GEN-LAST:event_jrbFiltrarPorIdProductoMouseClicked

    private void jrbFiltrarPorFechaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltrarPorFechaVentaMouseClicked

        this.venta = new Venta();
        
        this.jcmbFiltroTipoProductoVenta.setEnabled(true);
        this.btnFiltrar.setEnabled(true);
        this.jtxtFiltrarAlgunasVentasInicial.setEnabled(false);
        this.jtxtFiltrarAlgunasVentasInicial.setText("");
        this.jtxtFiltrarAlgunasVentasFinal.setEnabled(false);
        this.jtxtFiltrarAlgunasVentasFinal.setText("");
        this.jtxtFiltrarPorIdProducto.setEnabled(false);
        this.jtxtFiltrarPorIdProducto.setText("");
        this.jdtFiltrarPorFechaVentaInicial.setEnabled(true);
        this.jdtFiltrarPorFechaVentaFinal.setEnabled(true);

    }//GEN-LAST:event_jrbFiltrarPorFechaVentaMouseClicked

    private void jtxtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantidadVentaKeyPressed
        
    }//GEN-LAST:event_jtxtCantidadVentaKeyPressed

    private void btnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseClicked

        this.vs.consultar(this);
        this.desactivar = true;
        
    }//GEN-LAST:event_btnFiltrarMouseClicked

    private void jtxtCantidadVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantidadVentaKeyReleased

        
     try{   
        if(!this.jtxtCantidadVenta.getText().equals("") && !this.jtxtCantidadVenta.getText().equals("      CANTIDAD"))
        {
            
            float aux = Float.parseFloat(this.jtxtCantidadVenta.getText());
            
            if( aux > 0){
            
            this.dec = this.vs.establecerCantidadProducto(this);
            
            if(this.dec == true)
            {
                
              this.vs.establecerTotalVenta(this);
              this.activacion = true;  
              
            }else
            {
               
                this.activacion = false;
                
            }
            }else
            {
               
              JOptionPane.showMessageDialog(null, "Es imposible vender esa cantidad");
              this.jtxtCantidadVenta.setText("      CANTIDAD");
              this.jtxtTotalDeVenta.setText("          TOTAL");
              
            }
            
        }
     }catch(HeadlessException | NumberFormatException ex)
     {
         throw ex;
     }
        
        
    }//GEN-LAST:event_jtxtCantidadVentaKeyReleased

    private void btnInsertarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarVentaActionPerformed

    public JButton getBtnCancelarVenta() {
        return btnCancelarVenta;
    }

    public void setBtnCancelarVenta(JButton btnCancelarVenta) {
        this.btnCancelarVenta = btnCancelarVenta;
    }

    public JButton getBtnEliminarVenta() {
        return btnEliminarVenta;
    }

    public void setBtnEliminarVenta(JButton btnEliminarVenta) {
        this.btnEliminarVenta = btnEliminarVenta;
    }

    public JButton getBtnFiltrar() {
        return btnFiltrar;
    }

    public void setBtnFiltrar(JButton btnFiltrar) {
        this.btnFiltrar = btnFiltrar;
    }

    public JButton getBtnInsertarVenta() {
        return btnInsertarVenta;
    }

    public void setBtnInsertarVenta(JButton btnInsertarVenta) {
        this.btnInsertarVenta = btnInsertarVenta;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JComboBox<String> getJcmbFiltroTipoProductoVenta() {
        return jcmbFiltroTipoProductoVenta;
    }

    public void setJcmbFiltroTipoProductoVenta(JComboBox<String> jcmbFiltroTipoProductoVenta) {
        this.jcmbFiltroTipoProductoVenta = jcmbFiltroTipoProductoVenta;
    }

    public JComboBox<String> getJcmbTipoProductoVenta() {
        return jcmbTipoProductoVenta;
    }

    public void setJcmbTipoProductoVenta(JComboBox<String> jcmbTipoProductoVenta) {
        this.jcmbTipoProductoVenta = jcmbTipoProductoVenta;
    }

    public JDateChooser getJdtFiltrarPorFechaVentaFinal() {
        return jdtFiltrarPorFechaVentaFinal;
    }

    public void setJdtFiltrarPorFechaVentaFinal(JDateChooser jdtFiltrarPorFechaVentaFinal) {
        this.jdtFiltrarPorFechaVentaFinal = jdtFiltrarPorFechaVentaFinal;
    }

    public JDateChooser getJdtFiltrarPorFechaVentaInicial() {
        return jdtFiltrarPorFechaVentaInicial;
    }

    public void setJdtFiltrarPorFechaVentaInicial(JDateChooser jdtFiltrarPorFechaVentaInicial) {
        this.jdtFiltrarPorFechaVentaInicial = jdtFiltrarPorFechaVentaInicial;
    }

    public JRadioButton getJrbFiltrarAlgunasVentas() {
        return jrbFiltrarAlgunasVentas;
    }

    public void setJrbFiltrarAlgunasVentas(JRadioButton jrbFiltrarAlgunasVentas) {
        this.jrbFiltrarAlgunasVentas = jrbFiltrarAlgunasVentas;
    }

    public JRadioButton getJrbFiltrarPorFechaVenta() {
        return jrbFiltrarPorFechaVenta;
    }

    public void setJrbFiltrarPorFechaVenta(JRadioButton jrbFiltrarPorFechaVenta) {
        this.jrbFiltrarPorFechaVenta = jrbFiltrarPorFechaVenta;
    }

    public JRadioButton getJrbFiltrarPorIdProducto() {
        return jrbFiltrarPorIdProducto;
    }

    public void setJrbFiltrarPorIdProducto(JRadioButton jrbFiltrarPorIdProducto) {
        this.jrbFiltrarPorIdProducto = jrbFiltrarPorIdProducto;
    }

    public JRadioButton getJrbFiltrarTodasLasVentas() {
        return jrbFiltrarTodasLasVentas;
    }

    public void setJrbFiltrarTodasLasVentas(JRadioButton jrbFiltrarTodasLasVentas) {
        this.jrbFiltrarTodasLasVentas = jrbFiltrarTodasLasVentas;
    }

    public JTable getJtblVentas() {
        return jtblVentas;
    }

    public void setJtblVentas(JTable jtblVentas) {
        this.jtblVentas = jtblVentas;
    }

    public JTextField getJtxtCantidadVenta() {
        return jtxtCantidadVenta;
    }

    public void setJtxtCantidadVenta(JTextField jtxtCantidadVenta) {
        this.jtxtCantidadVenta = jtxtCantidadVenta;
    }

    public JTextField getJtxtClaveProductoVenta() {
        return jtxtClaveProductoVenta;
    }

    public void setJtxtClaveProductoVenta(JTextField jtxtClaveProductoVenta) {
        this.jtxtClaveProductoVenta = jtxtClaveProductoVenta;
    }

    public JTextField getJtxtFiltrarAlgunasVentasFinal() {
        return jtxtFiltrarAlgunasVentasFinal;
    }

    public void setJtxtFiltrarAlgunasVentasFinal(JTextField jtxtFiltrarAlgunasVentasFinal) {
        this.jtxtFiltrarAlgunasVentasFinal = jtxtFiltrarAlgunasVentasFinal;
    }

    public JTextField getJtxtFiltrarAlgunasVentasInicial() {
        return jtxtFiltrarAlgunasVentasInicial;
    }

    public void setJtxtFiltrarAlgunasVentasInicial(JTextField jtxtFiltrarAlgunasVentasInicial) {
        this.jtxtFiltrarAlgunasVentasInicial = jtxtFiltrarAlgunasVentasInicial;
    }

    public JTextField getJtxtFiltrarPorIdProducto() {
        return jtxtFiltrarPorIdProducto;
    }

    public void setJtxtFiltrarPorIdProducto(JTextField jtxtFiltrarPorIdProducto) {
        this.jtxtFiltrarPorIdProducto = jtxtFiltrarPorIdProducto;
    }

    public JTextField getJtxtTotalDeVenta() {
        return jtxtTotalDeVenta;
    }

    public void setJtxtTotalDeVenta(JTextField jtxtTotalDeVenta) {
        this.jtxtTotalDeVenta = jtxtTotalDeVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnInsertarVenta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbFiltroTipoProductoVenta;
    private javax.swing.JComboBox<String> jcmbTipoProductoVenta;
    private com.toedter.calendar.JDateChooser jdtFiltrarPorFechaVentaFinal;
    private com.toedter.calendar.JDateChooser jdtFiltrarPorFechaVentaInicial;
    private javax.swing.JRadioButton jrbFiltrarAlgunasVentas;
    private javax.swing.JRadioButton jrbFiltrarPorFechaVenta;
    private javax.swing.JRadioButton jrbFiltrarPorIdProducto;
    private javax.swing.JRadioButton jrbFiltrarTodasLasVentas;
    private javax.swing.JTable jtblVentas;
    private javax.swing.JTextField jtxtCantidadVenta;
    private javax.swing.JTextField jtxtClaveProductoVenta;
    private javax.swing.JTextField jtxtFiltrarAlgunasVentasFinal;
    private javax.swing.JTextField jtxtFiltrarAlgunasVentasInicial;
    private javax.swing.JTextField jtxtFiltrarPorIdProducto;
    private javax.swing.JTextField jtxtTotalDeVenta;
    // End of variables declaration//GEN-END:variables
}