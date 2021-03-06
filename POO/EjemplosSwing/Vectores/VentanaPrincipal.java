/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author LuXar
 */

public class VentanaPrincipal extends javax.swing.JFrame {
    
    JCheckBox vCuadros[];
    JButton btnAceptar;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        CreacionVentana();
    }

    public void CreacionVentana(){
        
        //Caracteristicas de la ventana
        this.setTitle( "Ejemplo de vector de componentes" );
        this.setSize( 300,600 );
        
        //construccion del vector (10 elementos)
        vCuadros = new JCheckBox[10];
        
        //construccion de cada cuadro de verificiacion del vector
        //y asignación de propiedades a dichos cuadros        
        String vTextos[] = { "rojo", "verde", "azul", "rosa", "celeste"
                            ,"morado", "amarillo", "marron", "naranja", "blanco" };
        
        int i = 0;
        
        for (i = 0 ; i < vCuadros.length ; i++ ){
            
            vCuadros[i] = new JCheckBox(); //se construye cada cuadro
            vCuadros[i].setText( vTextos[i] ); //se le da un texto del vector de textos
            vCuadros[i].setBounds( 10, 10 + 30 * i, 100, 20 );
            this.getContentPane().add( vCuadros[i] );
            
        }//Fin for
        
        btnAceptar = new JButton();
        btnAceptar.setText( "Aceptar" );
        btnAceptar.setBounds( 10,360,100,20 );
        this.getContentPane().add( btnAceptar );
        
        btnAceptar.addActionListener ( new ActionListener() {
           public void actionPerformed ( ActionEvent evt ) {
               
               btnAceptarActionPerformed( evt );
               
           }//fin actionPerformed         
        });
        
    }//fin CreacionVentana
    
    public void btnAceptarActionPerformed( ActionEvent evt) {
        
        int i = 0;
        int cont = 0;
        
        for ( i = 0 ; i < vCuadros.length ; i++ ){
            
            if ( vCuadros[i].isSelected() ){
                
                cont++;
                
            }//Fin if
        }//Fin for
        
        JOptionPane.showMessageDialog( null, "Hay " + cont + " cuadros seleccionados" );
        
    }//Fin btnAceptarActionPerformed
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
