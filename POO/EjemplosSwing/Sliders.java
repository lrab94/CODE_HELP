/**
*
* @author  Aguilar Bernal Luis Raul
* @version 1.0
* @since   2019/15/9
* 
*/

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;

// Clase principal Sliders
public class Sliders extends JFrame {

   JSlider slDeslizador = new JSlider();
   JLabel etiValor = new JLabel();

   // Constructor
   public Sliders() {
      super( "Sliders" );
      ventana();
   } // fin-Constructor

   // Contenido de la ventana
   public void ventana() {

      this.getContentPane().setLayout( null );

      slDeslizador.setMajorTickSpacing( 50 );
      slDeslizador.setMaximum( 500 );
      slDeslizador.setMinimum( 100 );
      slDeslizador.setMinorTickSpacing( 10 );
      slDeslizador.setPaintLabels( true );
      slDeslizador.setPaintTicks( true );
      slDeslizador.setSnapToTicks( true );
      slDeslizador.setValue( 400 );
      slDeslizador.addChangeListener( new ChangeListener() {
         public void stateChanged( ChangeEvent evt ) {
            etiValor.setText( "Valor= " + slDeslizador.getValue() );
         } // fin-stateChanged
      } );// fin-addChangeListener
        
      slDeslizador.setBounds( 20, 50, 380, 50 );
      this.getContentPane().add( slDeslizador );
      etiValor.setBorder( BorderFactory.createLineBorder( new Color( 0, 0, 0 ) ) );
      etiValor.setBounds( 20, 180, 380, 50 );
      this.getContentPane().add( etiValor );

   } // fin-ventana

   // Metodo main
   public static void main(String[] args) {
        
      Sliders ventana = new Sliders();
      ventana.setSize(450, 300);
      ventana.setDefaultCloseOperation( EXIT_ON_CLOSE );
      ventana.setVisible( true );

   } // fin-main
} // fin-clase

