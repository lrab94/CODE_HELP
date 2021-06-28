/**
*
* @author  Aguilar Bernal Luis Raul
* @version 1.0
* @since   2019/15/9
* 
*/

import javax.swing.*;
import java.awt.Color;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

// Clase principal: ScrollBars
public class ScrollBars extends JFrame {

   JScrollBar desValor = new JScrollBar();
   JLabel etiValor = new JLabel();

   // Constructor
   public ScrollBars() {
      super( "Scroll Bars" );
      ventana();
   } // fin-Constructor

   // Contenido de la ventana
   public void ventana() {

      this.getContentPane().setLayout( null );

      desValor.setBlockIncrement( 20 );
      desValor.setMaximum( 150 );
      desValor.setMinimum( 50 );
      desValor.setOrientation( JScrollBar.HORIZONTAL );
      desValor.setUnitIncrement( 2 );
      desValor.setVisibleAmount( 5 );
      desValor.setValue( 70 );
      desValor.addAdjustmentListener( new AdjustmentListener() {
         public void adjustmentValueChanged( AdjustmentEvent evt ) {
            etiValor.setText( "El valor es: " + desValor.getValue() );
         } // fin-adjustmentValueChanged
      } );// fin-addAdjustmentListener
      desValor.setBounds( 50, 30, 325, 20 );
      this.getContentPane().add( desValor );
      etiValor.setBorder( BorderFactory.createLineBorder( new Color( 0, 0, 0 ) ) );
      etiValor.setBounds( 80, 110, 250, 33 );
      this.getContentPane().add( etiValor );

   } // fin-ventana

   public static void main(String[] args) {
        
      ScrollBars ventana = new ScrollBars();
      ventana.setSize(450, 230);
      ventana.setDefaultCloseOperation( EXIT_ON_CLOSE );
      ventana.setVisible( true );
        
   } // fin-main
} // fin-clase