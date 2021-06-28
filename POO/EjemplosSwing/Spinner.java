/**
*
* @author  Aguilar Bernal Luis Raul
* @version 1.0
* @since   2019/15/9
* 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Clase principal, Spinner.
public class Spinner extends javax.swing.JFrame {

   // Variables Globales
   JLabel etiValor = new JLabel();
   JSpinner spiValor = new JSpinner();

   //Constructor
   Spinner(){		
      super("Spinner");
      SpinnerNumberModel nm = new SpinnerNumberModel();        
      nm.setMaximum(50);        
      nm.setMinimum(0); 
      nm.setStepSize(2);
      nm.setValue(4);
      ventana();
      spiValor.setModel(nm);		
	}// fin-Constructor       

   // Contenido de la ventana
   public void ventana(){
      
      getContentPane().setLayout(null);
      getContentPane().add(etiValor);
      
      etiValor.setFont(new java.awt.Font("Arial", 0, 14)); 
      etiValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
      etiValor.setBounds( 15, 100, 130, 25 );
      
      getContentPane().add(spiValor);
      
      spiValor.setBounds( 15, 15, 130, 25 );
      spiValor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                etiValor.setText("El valor es: "+spiValor.getValue().toString());
            }// fin-stateChanged
        });//fin-addChangeListener
                     
   }// fin-ventana
   
   // Metodo main
   public static void main(String args[]) {
		
		Spinner ventana = new Spinner();		
		ventana.show();
      ventana.setSize(250,250);
      ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
      ventana.setVisible(true);
        
   }// fin-main
}// fin-clase