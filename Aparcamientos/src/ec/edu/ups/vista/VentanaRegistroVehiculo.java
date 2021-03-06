/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorVehiculo;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tano
 */
public class VentanaRegistroVehiculo extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private VentanaRegistroCliente registroCliente;
    private VentanaPrincipal ventanaPrincipal;
    
    public VentanaRegistroVehiculo(ControladorCliente controladorCliente, ControladorVehiculo controladorVehiculo) {
	initComponents();
	this.controladorCliente = controladorCliente;
	this.controladorVehiculo = controladorVehiculo;
	controladorCliente.verClientes((DefaultTableModel)tablaClientes.getModel());
	btnRegistrar.setEnabled(false);
	setTitle("Registro de Vehículo");
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
	this.ventanaPrincipal = ventanaPrincipal;
	registroCliente = ventanaPrincipal.getRegistroCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable() {
            public boolean editCellAt(int row, int column, java.util.EventObject e){
                return false;
            }
        };
        lblPlaca = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtPlaca = new javax.swing.JFormattedTextField();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Dirección", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        lblPlaca.setText("Placa");

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCliente.setText("Registrar Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(58, 58, 58)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMarca)
                                    .addComponent(lblPlaca)
                                    .addComponent(lblModelo))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(txtModelo)
                                    .addComponent(txtPlaca))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addGap(84, 84, 84)
                .addComponent(btnCliente)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        limpiar();
	ventanaPrincipal.getRegistroIngreso().actualizar();
	ventanaPrincipal.getRegistroIngreso().show();
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String placa = txtPlaca.getText();
	String modelo = txtModelo.getText();
	String marca = txtMarca.getText();
	String cedula = (String)tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0);
	controladorVehiculo.registrar(placa, marca, modelo, cedula);
	JOptionPane.showMessageDialog(this, "Vehiculo Registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);
	limpiar();
	ventanaPrincipal.getRegistroIngreso().actualizar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        /*limpiar();
	ventanaPrincipal.getVentanaRegistroIngreso().actualizar();*/
	dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
	hide();
	ventanaPrincipal.getDesktopPane().remove(registroCliente);
	ventanaPrincipal.getDesktopPane().add(registroCliente);
	registroCliente.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()){
	    evt.consume();
	    btnRegistrar.setEnabled(true);
	}
    }//GEN-LAST:event_tablaClientesMouseClicked

    public void actualizar(){
	controladorCliente.verClientes((DefaultTableModel)tablaClientes.getModel());
    }
    
    public void limpiar(){
	txtPlaca.setText("");
	txtMarca.setText("");
	txtModelo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JFormattedTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    void cambiarIdioma(Locale localizacion, ResourceBundle mensajes) {
	lblMarca.setText(mensajes.getString("lblMarca"));
	lblModelo.setText(mensajes.getString("lblModelo"));
	lblPlaca.setText(mensajes.getString("lblPlaca"));
	tablaClientes.getColumnModel().getColumn(0).setHeaderValue(mensajes.getString("clientesCédula"));
	tablaClientes.getColumnModel().getColumn(1).setHeaderValue(mensajes.getString("clientesNombre"));
	tablaClientes.getColumnModel().getColumn(2).setHeaderValue(mensajes.getString("clientesDirección"));
	tablaClientes.getColumnModel().getColumn(3).setHeaderValue(mensajes.getString("clientesTeléfono"));
	btnCancelar.setText(mensajes.getString("btnCancelar"));
	btnRegistrar.setText(mensajes.getString("btnRegistrar"));
	btnCliente.setText(mensajes.getString("btnCliente"));
	setTitle(mensajes.getString("btnRegistrarVehiculo"));
    }
}
