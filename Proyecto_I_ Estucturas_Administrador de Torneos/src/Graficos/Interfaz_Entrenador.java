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
/**
 *
 * @author Usuario
 */
public class Interfaz_Entrenador extends javax.swing.JFrame {

    
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1_Insertar_Inicio_Un_Entrenador = new javax.swing.JButton();
        jButton2_busca_Entrenador_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton5_Agrgar_Al_Final_Entrenador_ = new javax.swing.JButton();
        jButton1_boton_impirmir_datos_ = new javax.swing.JButton();
        jButton1_atras_ = new javax.swing.JButton();

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Buscar Entrenador");

        jLabel5.setText("Nombre ");

        jLabel6.setText("Identificacion");

        jButton1_Insertar_Inicio_Un_Entrenador.setText("Agregar Inicio");
        jButton1_Insertar_Inicio_Un_Entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed(evt);
            }
        });

        jButton2_busca_Entrenador_.setText("Buscar");
        jButton2_busca_Entrenador_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_busca_Entrenador_ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Mostrar");

        jScrollPane1.setViewportView(jList1);

        jButton5_Agrgar_Al_Final_Entrenador_.setText("Agregar Final");
        jButton5_Agrgar_Al_Final_Entrenador_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed(evt);
            }
        });

        jButton1_boton_impirmir_datos_.setText("Mostrar");
        jButton1_boton_impirmir_datos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_boton_impirmir_datos_ActionPerformed(evt);
            }
        });

        jButton1_atras_.setText("Atras");
        jButton1_atras_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_atras_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1_boton_impirmir_datos_))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                        .addComponent(jButton1_Insertar_Inicio_Un_Entrenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5_Agrgar_Al_Final_Entrenador_, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2_busca_Entrenador_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(126, 126, 126)
                                .addComponent(jButton1_atras_))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jButton1_atras_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1_Insertar_Inicio_Un_Entrenador)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton5_Agrgar_Al_Final_Entrenador_))
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2_busca_Entrenador_)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton1_boton_impirmir_datos_)
                .addGap(17, 17, 17))
        );

        getAccessibleContext().setAccessibleName(" Entrenador");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //aqui estoy quemand datos del entrenador
    //String nuevo1=Interfaz_MenuPrincipal.metEn.InsertarInicio("Jorge Luis Pinto ",203040);
    //String nuevo2=Interfaz_MenuPrincipal.metEn.InsertarInicio("Andrey Amdor ",213344);
    //String nuevo3=Interfaz_MenuPrincipal.metEn.InsertarInicio("Oscar Ramirez ",223444);
    //String nuevo4=Interfaz_MenuPrincipal.metEn.InsertarInicio("Bob Marley",233444);
    //String nuevo5=Interfaz_MenuPrincipal.metEn.InsertarInicio("Rammstein",243444);
    //String nuevo6=Interfaz_MenuPrincipal.metEn.InsertarInicio("Skiller ",253444);
    //String nuevo7=Interfaz_MenuPrincipal.metEn.InsertarInicio("Red Hot Chili Peppers ",233444);
    
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
        ListModel.clear();
        if (Interfaz_Login.metEn.inicio==Interfaz_Login.metEn.inicio.sig)
        {
          ListModel.addElement("Nombre: "+Interfaz_Login.metEn.inicio.getNombre() +"  Identificacion: "+ Interfaz_Login.metEn.inicio.getId());// muestra en ListModel el nombre y la edad del Cliente
        }
        else
        {
            Entrenadores temp = Interfaz_Login.metEn.inicio;
            Entrenadores  aux = Interfaz_Login.metEn.inicio;
            while(aux.sig != temp)
            {
                ListModel.addElement("Nombre: "+aux.getNombre() +"  Identificacion:  "+ aux.getId());// muestra en ListModel el nombre y la edad del Cliente
                aux=aux.sig;
            }
            ListModel.addElement("Nombre: "+aux.getNombre()+"  Identificacon:  "+ aux.getId());
        }
        jList1.setModel(ListModel);
        
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

    private void jButton2_busca_Entrenador_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_busca_Entrenador_ActionPerformed
       try
        {
            String nombre= jTextField3.getText();
            int    id  = Integer.parseInt( jTextField4.getText());

            boolean insertado=Interfaz_Login.metEn.buscarEntrenador(nombre, id);
            if (insertado==true)
            {
                JOptionPane.showMessageDialog(null, "Fue encontrado");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "No fue encontrado");
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Ingresar los Datos");
        }
    }//GEN-LAST:event_jButton2_busca_Entrenador_ActionPerformed

    private void jButton1_boton_impirmir_datos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_boton_impirmir_datos_ActionPerformed
        
        imprimir();
    }//GEN-LAST:event_jButton1_boton_impirmir_datos_ActionPerformed

    private void jButton1_atras_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_atras_ActionPerformed
      Interfaz_Login.principal.setVisible(true);
      this.dispose();  
    }//GEN-LAST:event_jButton1_atras_ActionPerformed
   
    
    
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
    private javax.swing.JButton jButton1_boton_impirmir_datos_;
    private javax.swing.JButton jButton2_busca_Entrenador_;
    private javax.swing.JButton jButton5_Agrgar_Al_Final_Entrenador_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
