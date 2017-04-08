/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Entidades.*;
import Metodos.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class Interfaz_Entrenador extends javax.swing.JFrame {

    DefaultTableModel entrenadores;
    
    //MetodosEntrenador met =new MetodosEntrenador(); 
     
     DefaultListModel <String> ListModel = new DefaultListModel <>();// esto es para poder usar la jlist1
     
    public Interfaz_Entrenador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1_Insertar_Inicio_Un_Entrenador = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton5_Agrgar_Al_Final_Entrenador_ = new javax.swing.JButton();
        jButton1_atras_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador crear Entrenador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Agregar Entrenador");

        jLabel2.setText("Nombre");

        jLabel3.setText("Identificacion");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1_Insertar_Inicio_Un_Entrenador.setText("Agregar Inicio");
        jButton1_Insertar_Inicio_Un_Entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Mostrar");

        jButton5_Agrgar_Al_Final_Entrenador_.setText("Agregar Final");
        jButton5_Agrgar_Al_Final_Entrenador_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed(evt);
            }
        });

        jButton1_atras_.setText("Atras");
        jButton1_atras_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_atras_ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5_Agrgar_Al_Final_Entrenador_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1_Insertar_Inicio_Un_Entrenador, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1_atras_))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1_Insertar_Inicio_Un_Entrenador)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5_Agrgar_Al_Final_Entrenador_)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1_atras_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName(" Entrenador");

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed
        
        try
        {
        String nombre= jTextField1.getText();
        int    identificacion  = Integer.parseInt( jTextField2.getText());

        boolean verifica=Interfaz_Login.metEn.verificaID(identificacion);
        if (verifica == false)
        {
            String insertado=Interfaz_Login.metEn.InsertarInicio(nombre, identificacion);
          
            
            JOptionPane.showMessageDialog(null, insertado); 
            imprimir();

            //
            jTextField1.setText("");
            jTextField2.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La ID no se encuentra disponible"); 
        }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Ingresar los Datos");
        }
    }//GEN-LAST:event_jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed

    public void imprimir()
    {
        //Tabla para Entrenadores
        String titulo1[]={"Nombre","Identificacion"};
        String datos1[][]={};
        entrenadores=new DefaultTableModel(datos1,titulo1);
        jTable1.setModel(entrenadores);
        
        if (Interfaz_Login.metEn.inicio==Interfaz_Login.metEn.inicio.sig)
        {
          //Tabal Entrenadores
          Object datos[]={Interfaz_Login.metEn.inicio.getNombre(),Interfaz_Login.metEn.inicio.getId()};
          entrenadores.addRow(datos);
        }
        else
        {
            Entrenadores temp = Interfaz_Login.metEn.inicio;
            Entrenadores  aux = Interfaz_Login.metEn.inicio;
            while(aux.sig != temp)
            {
                //Tabal Entrenadores
                Object datos[]={aux.getNombre(),aux.getId()};
                entrenadores.addRow(datos);
                aux=aux.sig;
            }
            //Tabal Entrenadores
            Object datos[]={aux.getNombre(),aux.getId()};
            entrenadores.addRow(datos);
        }
        
    }
    
    
    private void jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed
       
        try
        {
            
            String nombre= jTextField1.getText();
            int    identificacion  = Integer.parseInt( jTextField2.getText());
            
            boolean verifica=Interfaz_Login.metEn.verificaID(identificacion);
            if (verifica==false)
            {
                String insertado=Interfaz_Login.metEn.InsertarFinal(nombre,identificacion);
                JOptionPane.showMessageDialog(null, insertado);
                imprimir();
                //
                jTextField1.setText("");
                jTextField2.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La ID no se encuentra disponible");
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Ingresar los Datos");
        }
    }//GEN-LAST:event_jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed

    private void jButton1_atras_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_atras_ActionPerformed
      Interfaz_Login.principal.setVisible(true);
      this.dispose();  
    }//GEN-LAST:event_jButton1_atras_ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Entrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Insertar_Inicio_Un_Entrenador;
    private javax.swing.JButton jButton1_atras_;
    private javax.swing.JButton jButton5_Agrgar_Al_Final_Entrenador_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
